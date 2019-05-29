package com.hyzs.tools.report.daomanager.immutable;

import com.hyzs.tools.report.dbo.ReportDO;
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
public interface ImmutableReportDaoManager extends CommonDaoManager<ReportDO,Long> {


        public List<ReportDO> listByCategoryId(Long categoryId, String... fieldNames);

        public Map<Long,ReportDO> mapByCategoryId(Long categoryId, String... fieldNames);

        public Integer countByCategoryId(Long categoryId);

        public default ReportDO singleResultByCategoryId(Long categoryId,String... fieldNames){
             List<ReportDO> list=this.listByCategoryId(categoryId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByCategoryId(Long categoryId, Function<ReportDO, T> mapper, String... fieldNames){
             List<ReportDO> list=this.listByCategoryId(categoryId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByCategoryId(ReportDO updateDO, Long categoryId);

        public Integer updateAllFieldsByCategoryId(ReportDO updateDO,  Long categoryId);

        public Integer deleteByCategoryId( Long categoryId);






        public List<ReportDO> listByInCategoryId(Collection<Long> categoryIdList, String... fieldNames);

         public Map<Long,ReportDO> mapByInCategoryId(Collection<Long> categoryIdList, String... fieldNames);

         public Integer countByInCategoryId(Collection<Long> categoryIdList);

         public default ReportDO singleResultByInCategoryId(Collection<Long> categoryIdList,String... fieldNames){
              List<ReportDO> list=this.listByInCategoryId(categoryIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<ReportDO>> groupingByInCategoryId(Collection<Long> categoryIdList, Function<ReportDO, T> mapper, String... fieldNames){
              List<ReportDO> list=this.listByInCategoryId(categoryIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInCategoryId(ReportDO updateDO, Collection<Long> categoryIdList);

         public Integer updateAllFieldsByInCategoryId(ReportDO updateDO,  Collection<Long> categoryIdList);

         public Integer deleteByInCategoryId( Collection<Long> categoryIdList);
        public List<ReportDO> listByDatabaseId(Long databaseId, String... fieldNames);

        public Map<Long,ReportDO> mapByDatabaseId(Long databaseId, String... fieldNames);

        public Integer countByDatabaseId(Long databaseId);

        public default ReportDO singleResultByDatabaseId(Long databaseId,String... fieldNames){
             List<ReportDO> list=this.listByDatabaseId(databaseId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByDatabaseId(Long databaseId, Function<ReportDO, T> mapper, String... fieldNames){
             List<ReportDO> list=this.listByDatabaseId(databaseId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDatabaseId(ReportDO updateDO, Long databaseId);

        public Integer updateAllFieldsByDatabaseId(ReportDO updateDO,  Long databaseId);

        public Integer deleteByDatabaseId( Long databaseId);






        public List<ReportDO> listByInDatabaseId(Collection<Long> databaseIdList, String... fieldNames);

         public Map<Long,ReportDO> mapByInDatabaseId(Collection<Long> databaseIdList, String... fieldNames);

         public Integer countByInDatabaseId(Collection<Long> databaseIdList);

         public default ReportDO singleResultByInDatabaseId(Collection<Long> databaseIdList,String... fieldNames){
              List<ReportDO> list=this.listByInDatabaseId(databaseIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<ReportDO>> groupingByInDatabaseId(Collection<Long> databaseIdList, Function<ReportDO, T> mapper, String... fieldNames){
              List<ReportDO> list=this.listByInDatabaseId(databaseIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInDatabaseId(ReportDO updateDO, Collection<Long> databaseIdList);

         public Integer updateAllFieldsByInDatabaseId(ReportDO updateDO,  Collection<Long> databaseIdList);

         public Integer deleteByInDatabaseId( Collection<Long> databaseIdList);
        public List<ReportDO> listByDescription(String description, String... fieldNames);

        public Map<Long,ReportDO> mapByDescription(String description, String... fieldNames);

        public Integer countByDescription(String description);

        public default ReportDO singleResultByDescription(String description,String... fieldNames){
             List<ReportDO> list=this.listByDescription(description,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByDescription(String description, Function<ReportDO, T> mapper, String... fieldNames){
             List<ReportDO> list=this.listByDescription(description,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDescription(ReportDO updateDO, String description);

        public Integer updateAllFieldsByDescription(ReportDO updateDO,  String description);

        public Integer deleteByDescription( String description);






        public List<ReportDO> listByInDescription(Collection<String> descriptionList, String... fieldNames);

         public Map<Long,ReportDO> mapByInDescription(Collection<String> descriptionList, String... fieldNames);

         public Integer countByInDescription(Collection<String> descriptionList);

         public default ReportDO singleResultByInDescription(Collection<String> descriptionList,String... fieldNames){
              List<ReportDO> list=this.listByInDescription(descriptionList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<ReportDO>> groupingByInDescription(Collection<String> descriptionList, Function<ReportDO, T> mapper, String... fieldNames){
              List<ReportDO> list=this.listByInDescription(descriptionList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInDescription(ReportDO updateDO, Collection<String> descriptionList);

         public Integer updateAllFieldsByInDescription(ReportDO updateDO,  Collection<String> descriptionList);

         public Integer deleteByInDescription( Collection<String> descriptionList);
        public List<ReportDO> listByName(String name, String... fieldNames);

        public Map<Long,ReportDO> mapByName(String name, String... fieldNames);

        public Integer countByName(String name);

        public default ReportDO singleResultByName(String name,String... fieldNames){
             List<ReportDO> list=this.listByName(name,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByName(String name, Function<ReportDO, T> mapper, String... fieldNames){
             List<ReportDO> list=this.listByName(name,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByName(ReportDO updateDO, String name);

        public Integer updateAllFieldsByName(ReportDO updateDO,  String name);

        public Integer deleteByName( String name);






        public List<ReportDO> listByInName(Collection<String> nameList, String... fieldNames);

         public Map<Long,ReportDO> mapByInName(Collection<String> nameList, String... fieldNames);

         public Integer countByInName(Collection<String> nameList);

         public default ReportDO singleResultByInName(Collection<String> nameList,String... fieldNames){
              List<ReportDO> list=this.listByInName(nameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<ReportDO>> groupingByInName(Collection<String> nameList, Function<ReportDO, T> mapper, String... fieldNames){
              List<ReportDO> list=this.listByInName(nameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInName(ReportDO updateDO, Collection<String> nameList);

         public Integer updateAllFieldsByInName(ReportDO updateDO,  Collection<String> nameList);

         public Integer deleteByInName( Collection<String> nameList);
        public List<ReportDO> listByPageable(Integer pageable, String... fieldNames);

        public Map<Long,ReportDO> mapByPageable(Integer pageable, String... fieldNames);

        public Integer countByPageable(Integer pageable);

        public default ReportDO singleResultByPageable(Integer pageable,String... fieldNames){
             List<ReportDO> list=this.listByPageable(pageable,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByPageable(Integer pageable, Function<ReportDO, T> mapper, String... fieldNames){
             List<ReportDO> list=this.listByPageable(pageable,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPageable(ReportDO updateDO, Integer pageable);

        public Integer updateAllFieldsByPageable(ReportDO updateDO,  Integer pageable);

        public Integer deleteByPageable( Integer pageable);






        public List<ReportDO> listByInPageable(Collection<Integer> pageableList, String... fieldNames);

         public Map<Long,ReportDO> mapByInPageable(Collection<Integer> pageableList, String... fieldNames);

         public Integer countByInPageable(Collection<Integer> pageableList);

         public default ReportDO singleResultByInPageable(Collection<Integer> pageableList,String... fieldNames){
              List<ReportDO> list=this.listByInPageable(pageableList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<ReportDO>> groupingByInPageable(Collection<Integer> pageableList, Function<ReportDO, T> mapper, String... fieldNames){
              List<ReportDO> list=this.listByInPageable(pageableList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPageable(ReportDO updateDO, Collection<Integer> pageableList);

         public Integer updateAllFieldsByInPageable(ReportDO updateDO,  Collection<Integer> pageableList);

         public Integer deleteByInPageable( Collection<Integer> pageableList);
        public List<ReportDO> listByStatement(String statement, String... fieldNames);

        public Map<Long,ReportDO> mapByStatement(String statement, String... fieldNames);

        public Integer countByStatement(String statement);

        public default ReportDO singleResultByStatement(String statement,String... fieldNames){
             List<ReportDO> list=this.listByStatement(statement,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByStatement(String statement, Function<ReportDO, T> mapper, String... fieldNames){
             List<ReportDO> list=this.listByStatement(statement,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByStatement(ReportDO updateDO, String statement);

        public Integer updateAllFieldsByStatement(ReportDO updateDO,  String statement);

        public Integer deleteByStatement( String statement);






        public List<ReportDO> listByInStatement(Collection<String> statementList, String... fieldNames);

         public Map<Long,ReportDO> mapByInStatement(Collection<String> statementList, String... fieldNames);

         public Integer countByInStatement(Collection<String> statementList);

         public default ReportDO singleResultByInStatement(Collection<String> statementList,String... fieldNames){
              List<ReportDO> list=this.listByInStatement(statementList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<ReportDO>> groupingByInStatement(Collection<String> statementList, Function<ReportDO, T> mapper, String... fieldNames){
              List<ReportDO> list=this.listByInStatement(statementList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInStatement(ReportDO updateDO, Collection<String> statementList);

         public Integer updateAllFieldsByInStatement(ReportDO updateDO,  Collection<String> statementList);

         public Integer deleteByInStatement( Collection<String> statementList);
        public List<ReportDO> listByFormKey(String formKey, String... fieldNames);

        public Map<Long,ReportDO> mapByFormKey(String formKey, String... fieldNames);

        public Integer countByFormKey(String formKey);

        public default ReportDO singleResultByFormKey(String formKey,String... fieldNames){
             List<ReportDO> list=this.listByFormKey(formKey,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportDO>> groupingByFormKey(String formKey, Function<ReportDO, T> mapper, String... fieldNames){
             List<ReportDO> list=this.listByFormKey(formKey,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByFormKey(ReportDO updateDO, String formKey);

        public Integer updateAllFieldsByFormKey(ReportDO updateDO,  String formKey);

        public Integer deleteByFormKey( String formKey);






        public List<ReportDO> listByInFormKey(Collection<String> formKeyList, String... fieldNames);

         public Map<Long,ReportDO> mapByInFormKey(Collection<String> formKeyList, String... fieldNames);

         public Integer countByInFormKey(Collection<String> formKeyList);

         public default ReportDO singleResultByInFormKey(Collection<String> formKeyList,String... fieldNames){
              List<ReportDO> list=this.listByInFormKey(formKeyList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<ReportDO>> groupingByInFormKey(Collection<String> formKeyList, Function<ReportDO, T> mapper, String... fieldNames){
              List<ReportDO> list=this.listByInFormKey(formKeyList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInFormKey(ReportDO updateDO, Collection<String> formKeyList);

         public Integer updateAllFieldsByInFormKey(ReportDO updateDO,  Collection<String> formKeyList);

         public Integer deleteByInFormKey( Collection<String> formKeyList);


}

