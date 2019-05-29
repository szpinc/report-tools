package com.hyzs.tools.report.service;

import com.hyzs.gz.common.core.bo.PageBO;
import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import com.hyzs.gz.common.dao.dto.PageQueryDTO;
import com.hyzs.tools.report.vo.BaseVO;

import java.io.Serializable;
import java.util.List;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/29 8:06
 */
public interface IService<T, K> {

    public void save(T t);

    public void update(T t);

    public void deleteById(K id);

    public T findById(K id);

    public List<T> findAll();

    public <E extends BaseVO> List<E> findAll(Class<E> clazz);

    /**
     * @param pageQueryDTO
     * @param clazz
     * @param <E>
     * @return
     */
    public <E extends BaseVO> PageBO<E> findAllByPage(PageQueryDTO pageQueryDTO, Class<E> clazz);

    public CommonDaoManager<T, K> getBaseManager();

}
