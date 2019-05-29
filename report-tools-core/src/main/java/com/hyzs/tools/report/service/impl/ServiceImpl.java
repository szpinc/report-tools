package com.hyzs.tools.report.service.impl;

import com.hyzs.gz.common.core.bo.PageBO;
import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import com.hyzs.gz.common.dao.dto.PageQueryDTO;
import com.hyzs.gz.common.dao.util.DaoUtils;
import com.hyzs.tools.report.service.IService;
import com.hyzs.tools.report.vo.BaseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/29 8:15
 */
@Slf4j
public class ServiceImpl<M extends CommonDaoManager<T, K>, T, K> implements IService<T, K> {

    @Autowired
    private M manager;

    @Override
    public void save(T t) {
        Class<?> clazz = t.getClass();
        try {
            Field id = clazz.getDeclaredField("id");
            id.setAccessible(true);
            if (null == id.get(t)) {
                manager.insertAllProperties(t);
            } else {
                update(t);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            if (log.isErrorEnabled()) {
                log.error("对象id属性解析失败");
            }
            e.printStackTrace();
        }

    }

    @Override
    public void update(T t) {
        manager.updateAllProperties(t);
    }

    @Override
    public void deleteById(K id) {
        manager.deleteById(id);
    }

    @Override
    public T findById(K id) {
        return manager.getById(id);
    }

    @Override
    public List<T> findAll() {
        return manager.listAll();
    }

    @Override
    public <E extends BaseVO> List<E> findAll(Class<E> clazz) {
        return findAll().stream().map(DO -> CommonUtils.newInstance(DO, clazz)).collect(Collectors.toList());
    }

    @Override
    public <E extends BaseVO> PageBO<E> findAllByPage(PageQueryDTO pageQueryDTO, Class<E> clazz) {
        PageBO<T> pageBO = DaoUtils.listDOByPage(() -> this.manager.listAll(), pageQueryDTO);
        return CommonUtils.convertPageBO(pageBO, e -> CommonUtils.newInstance(e, clazz));
    }


    @Override
    public M getBaseManager() {
        return this.manager;
    }
}
