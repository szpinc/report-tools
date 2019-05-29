package com.hyzs.tools.report.mapper;
import com.hyzs.tools.report.dbo.ParamDO;
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
public interface ParamMapper extends CommonMapper<ParamDO,Long>{

        public List<ParamDO> listByName(@Param("name") String name,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ParamDO> mapByName(@Param("name") String name,@Param("fieldNames") String[] fieldNames);

        public Integer countByName(@Param("name") String name);

        public default ParamDO singleResultByName(String name,String[] fieldNames){
             List<ParamDO> list=this.listByName(name,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ParamDO>> groupingByName(String name, Function<ParamDO, T> mapper, String[] fieldNames){
             List<ParamDO> list=this.listByName(name,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByName(@Param("updateDO") ParamDO updateDO, @Param("name") String name);

        public Integer updateAllFieldsByName(@Param("updateDO") ParamDO updateDO, @Param("name") String name);

        public Integer deleteByName( @Param("name") String name);




        public List<ParamDO> listByInName(@Param("nameList") Collection<String> nameList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ParamDO> mapByInName(@Param("nameList") Collection<String> nameList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInName(@Param("nameList") Collection<String> nameList);

        public default ParamDO singleResultByInName(Collection<String> nameList,String[] fieldNames){
             List<ParamDO> list=this.listByInName(nameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ParamDO>> groupingByInName(Collection<String> nameList, Function<ParamDO, T> mapper, String[] fieldNames){
             List<ParamDO> list=this.listByInName(nameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInName(@Param("updateDO") ParamDO updateDO, @Param("nameList") Collection<String> nameList);

        public Integer updateAllFieldsByInName(@Param("updateDO") ParamDO updateDO, @Param("nameList") Collection<String> nameList);

        public Integer deleteByInName( @Param("nameList") Collection<String> nameList);

        public List<ParamDO> listBySortable(@Param("sortable") Integer sortable,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ParamDO> mapBySortable(@Param("sortable") Integer sortable,@Param("fieldNames") String[] fieldNames);

        public Integer countBySortable(@Param("sortable") Integer sortable);

        public default ParamDO singleResultBySortable(Integer sortable,String[] fieldNames){
             List<ParamDO> list=this.listBySortable(sortable,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ParamDO>> groupingBySortable(Integer sortable, Function<ParamDO, T> mapper, String[] fieldNames){
             List<ParamDO> list=this.listBySortable(sortable,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsBySortable(@Param("updateDO") ParamDO updateDO, @Param("sortable") Integer sortable);

        public Integer updateAllFieldsBySortable(@Param("updateDO") ParamDO updateDO, @Param("sortable") Integer sortable);

        public Integer deleteBySortable( @Param("sortable") Integer sortable);




        public List<ParamDO> listByInSortable(@Param("sortableList") Collection<Integer> sortableList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ParamDO> mapByInSortable(@Param("sortableList") Collection<Integer> sortableList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInSortable(@Param("sortableList") Collection<Integer> sortableList);

        public default ParamDO singleResultByInSortable(Collection<Integer> sortableList,String[] fieldNames){
             List<ParamDO> list=this.listByInSortable(sortableList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ParamDO>> groupingByInSortable(Collection<Integer> sortableList, Function<ParamDO, T> mapper, String[] fieldNames){
             List<ParamDO> list=this.listByInSortable(sortableList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInSortable(@Param("updateDO") ParamDO updateDO, @Param("sortableList") Collection<Integer> sortableList);

        public Integer updateAllFieldsByInSortable(@Param("updateDO") ParamDO updateDO, @Param("sortableList") Collection<Integer> sortableList);

        public Integer deleteByInSortable( @Param("sortableList") Collection<Integer> sortableList);

        public List<ParamDO> listByValue(@Param("value") String value,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ParamDO> mapByValue(@Param("value") String value,@Param("fieldNames") String[] fieldNames);

        public Integer countByValue(@Param("value") String value);

        public default ParamDO singleResultByValue(String value,String[] fieldNames){
             List<ParamDO> list=this.listByValue(value,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ParamDO>> groupingByValue(String value, Function<ParamDO, T> mapper, String[] fieldNames){
             List<ParamDO> list=this.listByValue(value,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByValue(@Param("updateDO") ParamDO updateDO, @Param("value") String value);

        public Integer updateAllFieldsByValue(@Param("updateDO") ParamDO updateDO, @Param("value") String value);

        public Integer deleteByValue( @Param("value") String value);




        public List<ParamDO> listByInValue(@Param("valueList") Collection<String> valueList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ParamDO> mapByInValue(@Param("valueList") Collection<String> valueList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInValue(@Param("valueList") Collection<String> valueList);

        public default ParamDO singleResultByInValue(Collection<String> valueList,String[] fieldNames){
             List<ParamDO> list=this.listByInValue(valueList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ParamDO>> groupingByInValue(Collection<String> valueList, Function<ParamDO, T> mapper, String[] fieldNames){
             List<ParamDO> list=this.listByInValue(valueList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInValue(@Param("updateDO") ParamDO updateDO, @Param("valueList") Collection<String> valueList);

        public Integer updateAllFieldsByInValue(@Param("updateDO") ParamDO updateDO, @Param("valueList") Collection<String> valueList);

        public Integer deleteByInValue( @Param("valueList") Collection<String> valueList);

        public List<ParamDO> listBySortType(@Param("sortType") String sortType,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ParamDO> mapBySortType(@Param("sortType") String sortType,@Param("fieldNames") String[] fieldNames);

        public Integer countBySortType(@Param("sortType") String sortType);

        public default ParamDO singleResultBySortType(String sortType,String[] fieldNames){
             List<ParamDO> list=this.listBySortType(sortType,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ParamDO>> groupingBySortType(String sortType, Function<ParamDO, T> mapper, String[] fieldNames){
             List<ParamDO> list=this.listBySortType(sortType,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsBySortType(@Param("updateDO") ParamDO updateDO, @Param("sortType") String sortType);

        public Integer updateAllFieldsBySortType(@Param("updateDO") ParamDO updateDO, @Param("sortType") String sortType);

        public Integer deleteBySortType( @Param("sortType") String sortType);




        public List<ParamDO> listByInSortType(@Param("sortTypeList") Collection<String> sortTypeList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ParamDO> mapByInSortType(@Param("sortTypeList") Collection<String> sortTypeList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInSortType(@Param("sortTypeList") Collection<String> sortTypeList);

        public default ParamDO singleResultByInSortType(Collection<String> sortTypeList,String[] fieldNames){
             List<ParamDO> list=this.listByInSortType(sortTypeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ParamDO>> groupingByInSortType(Collection<String> sortTypeList, Function<ParamDO, T> mapper, String[] fieldNames){
             List<ParamDO> list=this.listByInSortType(sortTypeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInSortType(@Param("updateDO") ParamDO updateDO, @Param("sortTypeList") Collection<String> sortTypeList);

        public Integer updateAllFieldsByInSortType(@Param("updateDO") ParamDO updateDO, @Param("sortTypeList") Collection<String> sortTypeList);

        public Integer deleteByInSortType( @Param("sortTypeList") Collection<String> sortTypeList);


}
