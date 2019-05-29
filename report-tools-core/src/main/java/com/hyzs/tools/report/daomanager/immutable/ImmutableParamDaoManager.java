package com.hyzs.tools.report.daomanager.immutable;

import com.hyzs.tools.report.dbo.ParamDO;
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
public interface ImmutableParamDaoManager extends CommonDaoManager<ParamDO,Long> {


        public List<ParamDO> listByName(String name, String... fieldNames);

        public Map<Long,ParamDO> mapByName(String name, String... fieldNames);

        public Integer countByName(String name);

        public default ParamDO singleResultByName(String name,String... fieldNames){
             List<ParamDO> list=this.listByName(name,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ParamDO>> groupingByName(String name, Function<ParamDO, T> mapper, String... fieldNames){
             List<ParamDO> list=this.listByName(name,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByName(ParamDO updateDO, String name);

        public Integer updateAllFieldsByName(ParamDO updateDO,  String name);

        public Integer deleteByName( String name);






        public List<ParamDO> listByInName(Collection<String> nameList, String... fieldNames);

         public Map<Long,ParamDO> mapByInName(Collection<String> nameList, String... fieldNames);

         public Integer countByInName(Collection<String> nameList);

         public default ParamDO singleResultByInName(Collection<String> nameList,String... fieldNames){
              List<ParamDO> list=this.listByInName(nameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<ParamDO>> groupingByInName(Collection<String> nameList, Function<ParamDO, T> mapper, String... fieldNames){
              List<ParamDO> list=this.listByInName(nameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInName(ParamDO updateDO, Collection<String> nameList);

         public Integer updateAllFieldsByInName(ParamDO updateDO,  Collection<String> nameList);

         public Integer deleteByInName( Collection<String> nameList);
        public List<ParamDO> listBySortable(Integer sortable, String... fieldNames);

        public Map<Long,ParamDO> mapBySortable(Integer sortable, String... fieldNames);

        public Integer countBySortable(Integer sortable);

        public default ParamDO singleResultBySortable(Integer sortable,String... fieldNames){
             List<ParamDO> list=this.listBySortable(sortable,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ParamDO>> groupingBySortable(Integer sortable, Function<ParamDO, T> mapper, String... fieldNames){
             List<ParamDO> list=this.listBySortable(sortable,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsBySortable(ParamDO updateDO, Integer sortable);

        public Integer updateAllFieldsBySortable(ParamDO updateDO,  Integer sortable);

        public Integer deleteBySortable( Integer sortable);






        public List<ParamDO> listByInSortable(Collection<Integer> sortableList, String... fieldNames);

         public Map<Long,ParamDO> mapByInSortable(Collection<Integer> sortableList, String... fieldNames);

         public Integer countByInSortable(Collection<Integer> sortableList);

         public default ParamDO singleResultByInSortable(Collection<Integer> sortableList,String... fieldNames){
              List<ParamDO> list=this.listByInSortable(sortableList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<ParamDO>> groupingByInSortable(Collection<Integer> sortableList, Function<ParamDO, T> mapper, String... fieldNames){
              List<ParamDO> list=this.listByInSortable(sortableList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInSortable(ParamDO updateDO, Collection<Integer> sortableList);

         public Integer updateAllFieldsByInSortable(ParamDO updateDO,  Collection<Integer> sortableList);

         public Integer deleteByInSortable( Collection<Integer> sortableList);
        public List<ParamDO> listByValue(String value, String... fieldNames);

        public Map<Long,ParamDO> mapByValue(String value, String... fieldNames);

        public Integer countByValue(String value);

        public default ParamDO singleResultByValue(String value,String... fieldNames){
             List<ParamDO> list=this.listByValue(value,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ParamDO>> groupingByValue(String value, Function<ParamDO, T> mapper, String... fieldNames){
             List<ParamDO> list=this.listByValue(value,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByValue(ParamDO updateDO, String value);

        public Integer updateAllFieldsByValue(ParamDO updateDO,  String value);

        public Integer deleteByValue( String value);






        public List<ParamDO> listByInValue(Collection<String> valueList, String... fieldNames);

         public Map<Long,ParamDO> mapByInValue(Collection<String> valueList, String... fieldNames);

         public Integer countByInValue(Collection<String> valueList);

         public default ParamDO singleResultByInValue(Collection<String> valueList,String... fieldNames){
              List<ParamDO> list=this.listByInValue(valueList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<ParamDO>> groupingByInValue(Collection<String> valueList, Function<ParamDO, T> mapper, String... fieldNames){
              List<ParamDO> list=this.listByInValue(valueList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInValue(ParamDO updateDO, Collection<String> valueList);

         public Integer updateAllFieldsByInValue(ParamDO updateDO,  Collection<String> valueList);

         public Integer deleteByInValue( Collection<String> valueList);
        public List<ParamDO> listBySortType(String sortType, String... fieldNames);

        public Map<Long,ParamDO> mapBySortType(String sortType, String... fieldNames);

        public Integer countBySortType(String sortType);

        public default ParamDO singleResultBySortType(String sortType,String... fieldNames){
             List<ParamDO> list=this.listBySortType(sortType,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ParamDO>> groupingBySortType(String sortType, Function<ParamDO, T> mapper, String... fieldNames){
             List<ParamDO> list=this.listBySortType(sortType,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsBySortType(ParamDO updateDO, String sortType);

        public Integer updateAllFieldsBySortType(ParamDO updateDO,  String sortType);

        public Integer deleteBySortType( String sortType);






        public List<ParamDO> listByInSortType(Collection<String> sortTypeList, String... fieldNames);

         public Map<Long,ParamDO> mapByInSortType(Collection<String> sortTypeList, String... fieldNames);

         public Integer countByInSortType(Collection<String> sortTypeList);

         public default ParamDO singleResultByInSortType(Collection<String> sortTypeList,String... fieldNames){
              List<ParamDO> list=this.listByInSortType(sortTypeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<ParamDO>> groupingByInSortType(Collection<String> sortTypeList, Function<ParamDO, T> mapper, String... fieldNames){
              List<ParamDO> list=this.listByInSortType(sortTypeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInSortType(ParamDO updateDO, Collection<String> sortTypeList);

         public Integer updateAllFieldsByInSortType(ParamDO updateDO,  Collection<String> sortTypeList);

         public Integer deleteByInSortType( Collection<String> sortTypeList);


}

