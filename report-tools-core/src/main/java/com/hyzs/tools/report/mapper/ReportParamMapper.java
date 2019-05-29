package com.hyzs.tools.report.mapper;
import com.hyzs.tools.report.dbo.ReportParamDO;
import com.hyzs.gz.common.dao.mapper.CommonMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Date;
import java.util.HashMap;
import org.springframework.util.CollectionUtils;
import org.apache.ibatis.annotations.Param;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.ibatis.annotations.MapKey;



/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Mapper
public interface ReportParamMapper extends CommonMapper<ReportParamDO,Long>{

        public List<ReportParamDO> listByReportId(@Param("reportId") Long reportId,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportParamDO> mapByReportId(@Param("reportId") Long reportId,@Param("fieldNames") String[] fieldNames);

        public Integer countByReportId(@Param("reportId") Long reportId);

        public default ReportParamDO singleResultByReportId(Long reportId,String[] fieldNames){
             List<ReportParamDO> list=this.listByReportId(reportId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportParamDO>> groupingByReportId(Long reportId, Function<ReportParamDO, T> mapper, String[] fieldNames){
             List<ReportParamDO> list=this.listByReportId(reportId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByReportId(@Param("updateDO") ReportParamDO updateDO, @Param("reportId") Long reportId);

        public Integer updateAllFieldsByReportId(@Param("updateDO") ReportParamDO updateDO, @Param("reportId") Long reportId);

        public Integer deleteByReportId( @Param("reportId") Long reportId);




        public List<ReportParamDO> listByInReportId(@Param("reportIdList") Collection<Long> reportIdList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportParamDO> mapByInReportId(@Param("reportIdList") Collection<Long> reportIdList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInReportId(@Param("reportIdList") Collection<Long> reportIdList);

        public default ReportParamDO singleResultByInReportId(Collection<Long> reportIdList,String[] fieldNames){
             List<ReportParamDO> list=this.listByInReportId(reportIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportParamDO>> groupingByInReportId(Collection<Long> reportIdList, Function<ReportParamDO, T> mapper, String[] fieldNames){
             List<ReportParamDO> list=this.listByInReportId(reportIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInReportId(@Param("updateDO") ReportParamDO updateDO, @Param("reportIdList") Collection<Long> reportIdList);

        public Integer updateAllFieldsByInReportId(@Param("updateDO") ReportParamDO updateDO, @Param("reportIdList") Collection<Long> reportIdList);

        public Integer deleteByInReportId( @Param("reportIdList") Collection<Long> reportIdList);

        public List<ReportParamDO> listByParamId(@Param("paramId") Long paramId,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportParamDO> mapByParamId(@Param("paramId") Long paramId,@Param("fieldNames") String[] fieldNames);

        public Integer countByParamId(@Param("paramId") Long paramId);

        public default ReportParamDO singleResultByParamId(Long paramId,String[] fieldNames){
             List<ReportParamDO> list=this.listByParamId(paramId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportParamDO>> groupingByParamId(Long paramId, Function<ReportParamDO, T> mapper, String[] fieldNames){
             List<ReportParamDO> list=this.listByParamId(paramId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByParamId(@Param("updateDO") ReportParamDO updateDO, @Param("paramId") Long paramId);

        public Integer updateAllFieldsByParamId(@Param("updateDO") ReportParamDO updateDO, @Param("paramId") Long paramId);

        public Integer deleteByParamId( @Param("paramId") Long paramId);




        public List<ReportParamDO> listByInParamId(@Param("paramIdList") Collection<Long> paramIdList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportParamDO> mapByInParamId(@Param("paramIdList") Collection<Long> paramIdList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInParamId(@Param("paramIdList") Collection<Long> paramIdList);

        public default ReportParamDO singleResultByInParamId(Collection<Long> paramIdList,String[] fieldNames){
             List<ReportParamDO> list=this.listByInParamId(paramIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportParamDO>> groupingByInParamId(Collection<Long> paramIdList, Function<ReportParamDO, T> mapper, String[] fieldNames){
             List<ReportParamDO> list=this.listByInParamId(paramIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInParamId(@Param("updateDO") ReportParamDO updateDO, @Param("paramIdList") Collection<Long> paramIdList);

        public Integer updateAllFieldsByInParamId(@Param("updateDO") ReportParamDO updateDO, @Param("paramIdList") Collection<Long> paramIdList);

        public Integer deleteByInParamId( @Param("paramIdList") Collection<Long> paramIdList);


}
