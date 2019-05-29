package com.hyzs.tools.report.daomanager.immutable;

import com.hyzs.tools.report.dbo.ReportParamDO;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.Date;
import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import java.util.stream.Collectors;
import org.springframework.util.CollectionUtils;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public interface ImmutableReportParamDaoManager extends CommonDaoManager<ReportParamDO,Long> {


        public List<ReportParamDO> listByReportId(Long reportId, String... fieldNames);

        public Map<Long,ReportParamDO> mapByReportId(Long reportId, String... fieldNames);

        public Integer countByReportId(Long reportId);

        public default ReportParamDO singleResultByReportId(Long reportId,String... fieldNames){
             List<ReportParamDO> list=this.listByReportId(reportId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportParamDO>> groupingByReportId(Long reportId, Function<ReportParamDO, T> mapper, String... fieldNames){
             List<ReportParamDO> list=this.listByReportId(reportId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByReportId(ReportParamDO updateDO, Long reportId);

        public Integer updateAllFieldsByReportId(ReportParamDO updateDO,  Long reportId);

        public Integer deleteByReportId( Long reportId);






        public List<ReportParamDO> listByInReportId(Collection<Long> reportIdList, String... fieldNames);

         public Map<Long,ReportParamDO> mapByInReportId(Collection<Long> reportIdList, String... fieldNames);

         public Integer countByInReportId(Collection<Long> reportIdList);

         public default ReportParamDO singleResultByInReportId(Collection<Long> reportIdList,String... fieldNames){
              List<ReportParamDO> list=this.listByInReportId(reportIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<ReportParamDO>> groupingByInReportId(Collection<Long> reportIdList, Function<ReportParamDO, T> mapper, String... fieldNames){
              List<ReportParamDO> list=this.listByInReportId(reportIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInReportId(ReportParamDO updateDO, Collection<Long> reportIdList);

         public Integer updateAllFieldsByInReportId(ReportParamDO updateDO,  Collection<Long> reportIdList);

         public Integer deleteByInReportId( Collection<Long> reportIdList);
        public List<ReportParamDO> listByParamId(Long paramId, String... fieldNames);

        public Map<Long,ReportParamDO> mapByParamId(Long paramId, String... fieldNames);

        public Integer countByParamId(Long paramId);

        public default ReportParamDO singleResultByParamId(Long paramId,String... fieldNames){
             List<ReportParamDO> list=this.listByParamId(paramId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportParamDO>> groupingByParamId(Long paramId, Function<ReportParamDO, T> mapper, String... fieldNames){
             List<ReportParamDO> list=this.listByParamId(paramId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByParamId(ReportParamDO updateDO, Long paramId);

        public Integer updateAllFieldsByParamId(ReportParamDO updateDO,  Long paramId);

        public Integer deleteByParamId( Long paramId);






        public List<ReportParamDO> listByInParamId(Collection<Long> paramIdList, String... fieldNames);

         public Map<Long,ReportParamDO> mapByInParamId(Collection<Long> paramIdList, String... fieldNames);

         public Integer countByInParamId(Collection<Long> paramIdList);

         public default ReportParamDO singleResultByInParamId(Collection<Long> paramIdList,String... fieldNames){
              List<ReportParamDO> list=this.listByInParamId(paramIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<ReportParamDO>> groupingByInParamId(Collection<Long> paramIdList, Function<ReportParamDO, T> mapper, String... fieldNames){
              List<ReportParamDO> list=this.listByInParamId(paramIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInParamId(ReportParamDO updateDO, Collection<Long> paramIdList);

         public Integer updateAllFieldsByInParamId(ReportParamDO updateDO,  Collection<Long> paramIdList);

         public Integer deleteByInParamId( Collection<Long> paramIdList);


}

