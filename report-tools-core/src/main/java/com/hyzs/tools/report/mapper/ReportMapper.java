package com.hyzs.tools.report.mapper;
import com.hyzs.tools.report.dbo.ReportDO;
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
public interface ReportMapper extends CommonMapper<ReportDO,Long>{

        public List<ReportDO> listByCategoryId(@Param("categoryId") Long categoryId,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportDO> mapByCategoryId(@Param("categoryId") Long categoryId,@Param("fieldNames") String[] fieldNames);

        public Integer countByCategoryId(@Param("categoryId") Long categoryId);

        public default ReportDO singleResultByCategoryId(Long categoryId,String[] fieldNames){
             List<ReportDO> list=this.listByCategoryId(categoryId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByCategoryId(Long categoryId, Function<ReportDO, T> mapper, String[] fieldNames){
             List<ReportDO> list=this.listByCategoryId(categoryId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByCategoryId(@Param("updateDO") ReportDO updateDO, @Param("categoryId") Long categoryId);

        public Integer updateAllFieldsByCategoryId(@Param("updateDO") ReportDO updateDO, @Param("categoryId") Long categoryId);

        public Integer deleteByCategoryId( @Param("categoryId") Long categoryId);




        public List<ReportDO> listByInCategoryId(@Param("categoryIdList") Collection<Long> categoryIdList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportDO> mapByInCategoryId(@Param("categoryIdList") Collection<Long> categoryIdList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInCategoryId(@Param("categoryIdList") Collection<Long> categoryIdList);

        public default ReportDO singleResultByInCategoryId(Collection<Long> categoryIdList,String[] fieldNames){
             List<ReportDO> list=this.listByInCategoryId(categoryIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByInCategoryId(Collection<Long> categoryIdList, Function<ReportDO, T> mapper, String[] fieldNames){
             List<ReportDO> list=this.listByInCategoryId(categoryIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInCategoryId(@Param("updateDO") ReportDO updateDO, @Param("categoryIdList") Collection<Long> categoryIdList);

        public Integer updateAllFieldsByInCategoryId(@Param("updateDO") ReportDO updateDO, @Param("categoryIdList") Collection<Long> categoryIdList);

        public Integer deleteByInCategoryId( @Param("categoryIdList") Collection<Long> categoryIdList);

        public List<ReportDO> listByDatabaseId(@Param("databaseId") Long databaseId,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportDO> mapByDatabaseId(@Param("databaseId") Long databaseId,@Param("fieldNames") String[] fieldNames);

        public Integer countByDatabaseId(@Param("databaseId") Long databaseId);

        public default ReportDO singleResultByDatabaseId(Long databaseId,String[] fieldNames){
             List<ReportDO> list=this.listByDatabaseId(databaseId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByDatabaseId(Long databaseId, Function<ReportDO, T> mapper, String[] fieldNames){
             List<ReportDO> list=this.listByDatabaseId(databaseId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDatabaseId(@Param("updateDO") ReportDO updateDO, @Param("databaseId") Long databaseId);

        public Integer updateAllFieldsByDatabaseId(@Param("updateDO") ReportDO updateDO, @Param("databaseId") Long databaseId);

        public Integer deleteByDatabaseId( @Param("databaseId") Long databaseId);




        public List<ReportDO> listByInDatabaseId(@Param("databaseIdList") Collection<Long> databaseIdList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportDO> mapByInDatabaseId(@Param("databaseIdList") Collection<Long> databaseIdList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInDatabaseId(@Param("databaseIdList") Collection<Long> databaseIdList);

        public default ReportDO singleResultByInDatabaseId(Collection<Long> databaseIdList,String[] fieldNames){
             List<ReportDO> list=this.listByInDatabaseId(databaseIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByInDatabaseId(Collection<Long> databaseIdList, Function<ReportDO, T> mapper, String[] fieldNames){
             List<ReportDO> list=this.listByInDatabaseId(databaseIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInDatabaseId(@Param("updateDO") ReportDO updateDO, @Param("databaseIdList") Collection<Long> databaseIdList);

        public Integer updateAllFieldsByInDatabaseId(@Param("updateDO") ReportDO updateDO, @Param("databaseIdList") Collection<Long> databaseIdList);

        public Integer deleteByInDatabaseId( @Param("databaseIdList") Collection<Long> databaseIdList);

        public List<ReportDO> listByDescription(@Param("description") String description,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportDO> mapByDescription(@Param("description") String description,@Param("fieldNames") String[] fieldNames);

        public Integer countByDescription(@Param("description") String description);

        public default ReportDO singleResultByDescription(String description,String[] fieldNames){
             List<ReportDO> list=this.listByDescription(description,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByDescription(String description, Function<ReportDO, T> mapper, String[] fieldNames){
             List<ReportDO> list=this.listByDescription(description,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDescription(@Param("updateDO") ReportDO updateDO, @Param("description") String description);

        public Integer updateAllFieldsByDescription(@Param("updateDO") ReportDO updateDO, @Param("description") String description);

        public Integer deleteByDescription( @Param("description") String description);




        public List<ReportDO> listByInDescription(@Param("descriptionList") Collection<String> descriptionList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportDO> mapByInDescription(@Param("descriptionList") Collection<String> descriptionList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInDescription(@Param("descriptionList") Collection<String> descriptionList);

        public default ReportDO singleResultByInDescription(Collection<String> descriptionList,String[] fieldNames){
             List<ReportDO> list=this.listByInDescription(descriptionList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByInDescription(Collection<String> descriptionList, Function<ReportDO, T> mapper, String[] fieldNames){
             List<ReportDO> list=this.listByInDescription(descriptionList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInDescription(@Param("updateDO") ReportDO updateDO, @Param("descriptionList") Collection<String> descriptionList);

        public Integer updateAllFieldsByInDescription(@Param("updateDO") ReportDO updateDO, @Param("descriptionList") Collection<String> descriptionList);

        public Integer deleteByInDescription( @Param("descriptionList") Collection<String> descriptionList);

        public List<ReportDO> listByName(@Param("name") String name,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportDO> mapByName(@Param("name") String name,@Param("fieldNames") String[] fieldNames);

        public Integer countByName(@Param("name") String name);

        public default ReportDO singleResultByName(String name,String[] fieldNames){
             List<ReportDO> list=this.listByName(name,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByName(String name, Function<ReportDO, T> mapper, String[] fieldNames){
             List<ReportDO> list=this.listByName(name,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByName(@Param("updateDO") ReportDO updateDO, @Param("name") String name);

        public Integer updateAllFieldsByName(@Param("updateDO") ReportDO updateDO, @Param("name") String name);

        public Integer deleteByName( @Param("name") String name);




        public List<ReportDO> listByInName(@Param("nameList") Collection<String> nameList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportDO> mapByInName(@Param("nameList") Collection<String> nameList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInName(@Param("nameList") Collection<String> nameList);

        public default ReportDO singleResultByInName(Collection<String> nameList,String[] fieldNames){
             List<ReportDO> list=this.listByInName(nameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByInName(Collection<String> nameList, Function<ReportDO, T> mapper, String[] fieldNames){
             List<ReportDO> list=this.listByInName(nameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInName(@Param("updateDO") ReportDO updateDO, @Param("nameList") Collection<String> nameList);

        public Integer updateAllFieldsByInName(@Param("updateDO") ReportDO updateDO, @Param("nameList") Collection<String> nameList);

        public Integer deleteByInName( @Param("nameList") Collection<String> nameList);

        public List<ReportDO> listByPageable(@Param("pageable") Integer pageable,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportDO> mapByPageable(@Param("pageable") Integer pageable,@Param("fieldNames") String[] fieldNames);

        public Integer countByPageable(@Param("pageable") Integer pageable);

        public default ReportDO singleResultByPageable(Integer pageable,String[] fieldNames){
             List<ReportDO> list=this.listByPageable(pageable,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByPageable(Integer pageable, Function<ReportDO, T> mapper, String[] fieldNames){
             List<ReportDO> list=this.listByPageable(pageable,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPageable(@Param("updateDO") ReportDO updateDO, @Param("pageable") Integer pageable);

        public Integer updateAllFieldsByPageable(@Param("updateDO") ReportDO updateDO, @Param("pageable") Integer pageable);

        public Integer deleteByPageable( @Param("pageable") Integer pageable);




        public List<ReportDO> listByInPageable(@Param("pageableList") Collection<Integer> pageableList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportDO> mapByInPageable(@Param("pageableList") Collection<Integer> pageableList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInPageable(@Param("pageableList") Collection<Integer> pageableList);

        public default ReportDO singleResultByInPageable(Collection<Integer> pageableList,String[] fieldNames){
             List<ReportDO> list=this.listByInPageable(pageableList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByInPageable(Collection<Integer> pageableList, Function<ReportDO, T> mapper, String[] fieldNames){
             List<ReportDO> list=this.listByInPageable(pageableList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPageable(@Param("updateDO") ReportDO updateDO, @Param("pageableList") Collection<Integer> pageableList);

        public Integer updateAllFieldsByInPageable(@Param("updateDO") ReportDO updateDO, @Param("pageableList") Collection<Integer> pageableList);

        public Integer deleteByInPageable( @Param("pageableList") Collection<Integer> pageableList);

        public List<ReportDO> listByStatement(@Param("statement") String statement,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportDO> mapByStatement(@Param("statement") String statement,@Param("fieldNames") String[] fieldNames);

        public Integer countByStatement(@Param("statement") String statement);

        public default ReportDO singleResultByStatement(String statement,String[] fieldNames){
             List<ReportDO> list=this.listByStatement(statement,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByStatement(String statement, Function<ReportDO, T> mapper, String[] fieldNames){
             List<ReportDO> list=this.listByStatement(statement,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByStatement(@Param("updateDO") ReportDO updateDO, @Param("statement") String statement);

        public Integer updateAllFieldsByStatement(@Param("updateDO") ReportDO updateDO, @Param("statement") String statement);

        public Integer deleteByStatement( @Param("statement") String statement);




        public List<ReportDO> listByInStatement(@Param("statementList") Collection<String> statementList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportDO> mapByInStatement(@Param("statementList") Collection<String> statementList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInStatement(@Param("statementList") Collection<String> statementList);

        public default ReportDO singleResultByInStatement(Collection<String> statementList,String[] fieldNames){
             List<ReportDO> list=this.listByInStatement(statementList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByInStatement(Collection<String> statementList, Function<ReportDO, T> mapper, String[] fieldNames){
             List<ReportDO> list=this.listByInStatement(statementList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInStatement(@Param("updateDO") ReportDO updateDO, @Param("statementList") Collection<String> statementList);

        public Integer updateAllFieldsByInStatement(@Param("updateDO") ReportDO updateDO, @Param("statementList") Collection<String> statementList);

        public Integer deleteByInStatement( @Param("statementList") Collection<String> statementList);

        public List<ReportDO> listByFormKey(@Param("formKey") String formKey,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportDO> mapByFormKey(@Param("formKey") String formKey,@Param("fieldNames") String[] fieldNames);

        public Integer countByFormKey(@Param("formKey") String formKey);

        public default ReportDO singleResultByFormKey(String formKey,String[] fieldNames){
             List<ReportDO> list=this.listByFormKey(formKey,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByFormKey(String formKey, Function<ReportDO, T> mapper, String[] fieldNames){
             List<ReportDO> list=this.listByFormKey(formKey,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByFormKey(@Param("updateDO") ReportDO updateDO, @Param("formKey") String formKey);

        public Integer updateAllFieldsByFormKey(@Param("updateDO") ReportDO updateDO, @Param("formKey") String formKey);

        public Integer deleteByFormKey( @Param("formKey") String formKey);




        public List<ReportDO> listByInFormKey(@Param("formKeyList") Collection<String> formKeyList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,ReportDO> mapByInFormKey(@Param("formKeyList") Collection<String> formKeyList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInFormKey(@Param("formKeyList") Collection<String> formKeyList);

        public default ReportDO singleResultByInFormKey(Collection<String> formKeyList,String[] fieldNames){
             List<ReportDO> list=this.listByInFormKey(formKeyList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByInFormKey(Collection<String> formKeyList, Function<ReportDO, T> mapper, String[] fieldNames){
             List<ReportDO> list=this.listByInFormKey(formKeyList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInFormKey(@Param("updateDO") ReportDO updateDO, @Param("formKeyList") Collection<String> formKeyList);

        public Integer updateAllFieldsByInFormKey(@Param("updateDO") ReportDO updateDO, @Param("formKeyList") Collection<String> formKeyList);

        public Integer deleteByInFormKey( @Param("formKeyList") Collection<String> formKeyList);


}
