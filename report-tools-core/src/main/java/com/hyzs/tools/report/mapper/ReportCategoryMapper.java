package com.hyzs.tools.report.mapper;
import com.hyzs.tools.report.dbo.ReportCategoryDO;
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
public interface ReportCategoryMapper extends CommonMapper<ReportCategoryDO,Long>{

        public List<ReportCategoryDO> listByName(@Param("name") String name,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportCategoryDO> mapByName(@Param("name") String name,@Param("fieldNames") String[] fieldNames);

        public Integer countByName(@Param("name") String name);

        public default ReportCategoryDO singleResultByName(String name,String[] fieldNames){
             List<ReportCategoryDO> list=this.listByName(name,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportCategoryDO>> groupingByName(String name, Function<ReportCategoryDO, T> mapper, String[] fieldNames){
             List<ReportCategoryDO> list=this.listByName(name,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByName(@Param("updateDO") ReportCategoryDO updateDO, @Param("name") String name);

        public Integer updateAllFieldsByName(@Param("updateDO") ReportCategoryDO updateDO, @Param("name") String name);

        public Integer deleteByName( @Param("name") String name);




        public List<ReportCategoryDO> listByInName(@Param("nameList") Collection<String> nameList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportCategoryDO> mapByInName(@Param("nameList") Collection<String> nameList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInName(@Param("nameList") Collection<String> nameList);

        public default ReportCategoryDO singleResultByInName(Collection<String> nameList,String[] fieldNames){
             List<ReportCategoryDO> list=this.listByInName(nameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportCategoryDO>> groupingByInName(Collection<String> nameList, Function<ReportCategoryDO, T> mapper, String[] fieldNames){
             List<ReportCategoryDO> list=this.listByInName(nameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInName(@Param("updateDO") ReportCategoryDO updateDO, @Param("nameList") Collection<String> nameList);

        public Integer updateAllFieldsByInName(@Param("updateDO") ReportCategoryDO updateDO, @Param("nameList") Collection<String> nameList);

        public Integer deleteByInName( @Param("nameList") Collection<String> nameList);

        public List<ReportCategoryDO> listByDescription(@Param("description") String description,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportCategoryDO> mapByDescription(@Param("description") String description,@Param("fieldNames") String[] fieldNames);

        public Integer countByDescription(@Param("description") String description);

        public default ReportCategoryDO singleResultByDescription(String description,String[] fieldNames){
             List<ReportCategoryDO> list=this.listByDescription(description,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportCategoryDO>> groupingByDescription(String description, Function<ReportCategoryDO, T> mapper, String[] fieldNames){
             List<ReportCategoryDO> list=this.listByDescription(description,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDescription(@Param("updateDO") ReportCategoryDO updateDO, @Param("description") String description);

        public Integer updateAllFieldsByDescription(@Param("updateDO") ReportCategoryDO updateDO, @Param("description") String description);

        public Integer deleteByDescription( @Param("description") String description);




        public List<ReportCategoryDO> listByInDescription(@Param("descriptionList") Collection<String> descriptionList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportCategoryDO> mapByInDescription(@Param("descriptionList") Collection<String> descriptionList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInDescription(@Param("descriptionList") Collection<String> descriptionList);

        public default ReportCategoryDO singleResultByInDescription(Collection<String> descriptionList,String[] fieldNames){
             List<ReportCategoryDO> list=this.listByInDescription(descriptionList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportCategoryDO>> groupingByInDescription(Collection<String> descriptionList, Function<ReportCategoryDO, T> mapper, String[] fieldNames){
             List<ReportCategoryDO> list=this.listByInDescription(descriptionList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInDescription(@Param("updateDO") ReportCategoryDO updateDO, @Param("descriptionList") Collection<String> descriptionList);

        public Integer updateAllFieldsByInDescription(@Param("updateDO") ReportCategoryDO updateDO, @Param("descriptionList") Collection<String> descriptionList);

        public Integer deleteByInDescription( @Param("descriptionList") Collection<String> descriptionList);


}
