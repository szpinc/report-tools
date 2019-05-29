package com.hyzs.tools.report.daomanager.immutable;

import com.hyzs.tools.report.dbo.DbDO;
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
public interface ImmutableDbDaoManager extends CommonDaoManager<DbDO,Long> {


        public List<DbDO> listByDriverClass(String driverClass, String... fieldNames);

        public Map<Long,DbDO> mapByDriverClass(String driverClass, String... fieldNames);

        public Integer countByDriverClass(String driverClass);

        public default DbDO singleResultByDriverClass(String driverClass,String... fieldNames){
             List<DbDO> list=this.listByDriverClass(driverClass,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByDriverClass(String driverClass, Function<DbDO, T> mapper, String... fieldNames){
             List<DbDO> list=this.listByDriverClass(driverClass,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDriverClass(DbDO updateDO, String driverClass);

        public Integer updateAllFieldsByDriverClass(DbDO updateDO,  String driverClass);

        public Integer deleteByDriverClass( String driverClass);






        public List<DbDO> listByInDriverClass(Collection<String> driverClassList, String... fieldNames);

         public Map<Long,DbDO> mapByInDriverClass(Collection<String> driverClassList, String... fieldNames);

         public Integer countByInDriverClass(Collection<String> driverClassList);

         public default DbDO singleResultByInDriverClass(Collection<String> driverClassList,String... fieldNames){
              List<DbDO> list=this.listByInDriverClass(driverClassList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DbDO>> groupingByInDriverClass(Collection<String> driverClassList, Function<DbDO, T> mapper, String... fieldNames){
              List<DbDO> list=this.listByInDriverClass(driverClassList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInDriverClass(DbDO updateDO, Collection<String> driverClassList);

         public Integer updateAllFieldsByInDriverClass(DbDO updateDO,  Collection<String> driverClassList);

         public Integer deleteByInDriverClass( Collection<String> driverClassList);
        public List<DbDO> listByName(String name, String... fieldNames);

        public Map<Long,DbDO> mapByName(String name, String... fieldNames);

        public Integer countByName(String name);

        public default DbDO singleResultByName(String name,String... fieldNames){
             List<DbDO> list=this.listByName(name,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByName(String name, Function<DbDO, T> mapper, String... fieldNames){
             List<DbDO> list=this.listByName(name,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByName(DbDO updateDO, String name);

        public Integer updateAllFieldsByName(DbDO updateDO,  String name);

        public Integer deleteByName( String name);






        public List<DbDO> listByInName(Collection<String> nameList, String... fieldNames);

         public Map<Long,DbDO> mapByInName(Collection<String> nameList, String... fieldNames);

         public Integer countByInName(Collection<String> nameList);

         public default DbDO singleResultByInName(Collection<String> nameList,String... fieldNames){
              List<DbDO> list=this.listByInName(nameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DbDO>> groupingByInName(Collection<String> nameList, Function<DbDO, T> mapper, String... fieldNames){
              List<DbDO> list=this.listByInName(nameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInName(DbDO updateDO, Collection<String> nameList);

         public Integer updateAllFieldsByInName(DbDO updateDO,  Collection<String> nameList);

         public Integer deleteByInName( Collection<String> nameList);
        public List<DbDO> listByPassword(String password, String... fieldNames);

        public Map<Long,DbDO> mapByPassword(String password, String... fieldNames);

        public Integer countByPassword(String password);

        public default DbDO singleResultByPassword(String password,String... fieldNames){
             List<DbDO> list=this.listByPassword(password,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByPassword(String password, Function<DbDO, T> mapper, String... fieldNames){
             List<DbDO> list=this.listByPassword(password,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPassword(DbDO updateDO, String password);

        public Integer updateAllFieldsByPassword(DbDO updateDO,  String password);

        public Integer deleteByPassword( String password);






        public List<DbDO> listByInPassword(Collection<String> passwordList, String... fieldNames);

         public Map<Long,DbDO> mapByInPassword(Collection<String> passwordList, String... fieldNames);

         public Integer countByInPassword(Collection<String> passwordList);

         public default DbDO singleResultByInPassword(Collection<String> passwordList,String... fieldNames){
              List<DbDO> list=this.listByInPassword(passwordList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DbDO>> groupingByInPassword(Collection<String> passwordList, Function<DbDO, T> mapper, String... fieldNames){
              List<DbDO> list=this.listByInPassword(passwordList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPassword(DbDO updateDO, Collection<String> passwordList);

         public Integer updateAllFieldsByInPassword(DbDO updateDO,  Collection<String> passwordList);

         public Integer deleteByInPassword( Collection<String> passwordList);
        public List<DbDO> listByUrl(String url, String... fieldNames);

        public Map<Long,DbDO> mapByUrl(String url, String... fieldNames);

        public Integer countByUrl(String url);

        public default DbDO singleResultByUrl(String url,String... fieldNames){
             List<DbDO> list=this.listByUrl(url,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByUrl(String url, Function<DbDO, T> mapper, String... fieldNames){
             List<DbDO> list=this.listByUrl(url,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUrl(DbDO updateDO, String url);

        public Integer updateAllFieldsByUrl(DbDO updateDO,  String url);

        public Integer deleteByUrl( String url);






        public List<DbDO> listByInUrl(Collection<String> urlList, String... fieldNames);

         public Map<Long,DbDO> mapByInUrl(Collection<String> urlList, String... fieldNames);

         public Integer countByInUrl(Collection<String> urlList);

         public default DbDO singleResultByInUrl(Collection<String> urlList,String... fieldNames){
              List<DbDO> list=this.listByInUrl(urlList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DbDO>> groupingByInUrl(Collection<String> urlList, Function<DbDO, T> mapper, String... fieldNames){
              List<DbDO> list=this.listByInUrl(urlList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUrl(DbDO updateDO, Collection<String> urlList);

         public Integer updateAllFieldsByInUrl(DbDO updateDO,  Collection<String> urlList);

         public Integer deleteByInUrl( Collection<String> urlList);
        public List<DbDO> listByUsername(String username, String... fieldNames);

        public Map<Long,DbDO> mapByUsername(String username, String... fieldNames);

        public Integer countByUsername(String username);

        public default DbDO singleResultByUsername(String username,String... fieldNames){
             List<DbDO> list=this.listByUsername(username,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByUsername(String username, Function<DbDO, T> mapper, String... fieldNames){
             List<DbDO> list=this.listByUsername(username,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUsername(DbDO updateDO, String username);

        public Integer updateAllFieldsByUsername(DbDO updateDO,  String username);

        public Integer deleteByUsername( String username);






        public List<DbDO> listByInUsername(Collection<String> usernameList, String... fieldNames);

         public Map<Long,DbDO> mapByInUsername(Collection<String> usernameList, String... fieldNames);

         public Integer countByInUsername(Collection<String> usernameList);

         public default DbDO singleResultByInUsername(Collection<String> usernameList,String... fieldNames){
              List<DbDO> list=this.listByInUsername(usernameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DbDO>> groupingByInUsername(Collection<String> usernameList, Function<DbDO, T> mapper, String... fieldNames){
              List<DbDO> list=this.listByInUsername(usernameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUsername(DbDO updateDO, Collection<String> usernameList);

         public Integer updateAllFieldsByInUsername(DbDO updateDO,  Collection<String> usernameList);

         public Integer deleteByInUsername( Collection<String> usernameList);
        public List<DbDO> listByType(String type, String... fieldNames);

        public Map<Long,DbDO> mapByType(String type, String... fieldNames);

        public Integer countByType(String type);

        public default DbDO singleResultByType(String type,String... fieldNames){
             List<DbDO> list=this.listByType(type,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByType(String type, Function<DbDO, T> mapper, String... fieldNames){
             List<DbDO> list=this.listByType(type,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByType(DbDO updateDO, String type);

        public Integer updateAllFieldsByType(DbDO updateDO,  String type);

        public Integer deleteByType( String type);






        public List<DbDO> listByInType(Collection<String> typeList, String... fieldNames);

         public Map<Long,DbDO> mapByInType(Collection<String> typeList, String... fieldNames);

         public Integer countByInType(Collection<String> typeList);

         public default DbDO singleResultByInType(Collection<String> typeList,String... fieldNames){
              List<DbDO> list=this.listByInType(typeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DbDO>> groupingByInType(Collection<String> typeList, Function<DbDO, T> mapper, String... fieldNames){
              List<DbDO> list=this.listByInType(typeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInType(DbDO updateDO, Collection<String> typeList);

         public Integer updateAllFieldsByInType(DbDO updateDO,  Collection<String> typeList);

         public Integer deleteByInType( Collection<String> typeList);
        public List<DbDO> listByInitialSize(Integer initialSize, String... fieldNames);

        public Map<Long,DbDO> mapByInitialSize(Integer initialSize, String... fieldNames);

        public Integer countByInitialSize(Integer initialSize);

        public default DbDO singleResultByInitialSize(Integer initialSize,String... fieldNames){
             List<DbDO> list=this.listByInitialSize(initialSize,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByInitialSize(Integer initialSize, Function<DbDO, T> mapper, String... fieldNames){
             List<DbDO> list=this.listByInitialSize(initialSize,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInitialSize(DbDO updateDO, Integer initialSize);

        public Integer updateAllFieldsByInitialSize(DbDO updateDO,  Integer initialSize);

        public Integer deleteByInitialSize( Integer initialSize);






        public List<DbDO> listByInInitialSize(Collection<Integer> initialSizeList, String... fieldNames);

         public Map<Long,DbDO> mapByInInitialSize(Collection<Integer> initialSizeList, String... fieldNames);

         public Integer countByInInitialSize(Collection<Integer> initialSizeList);

         public default DbDO singleResultByInInitialSize(Collection<Integer> initialSizeList,String... fieldNames){
              List<DbDO> list=this.listByInInitialSize(initialSizeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DbDO>> groupingByInInitialSize(Collection<Integer> initialSizeList, Function<DbDO, T> mapper, String... fieldNames){
              List<DbDO> list=this.listByInInitialSize(initialSizeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInInitialSize(DbDO updateDO, Collection<Integer> initialSizeList);

         public Integer updateAllFieldsByInInitialSize(DbDO updateDO,  Collection<Integer> initialSizeList);

         public Integer deleteByInInitialSize( Collection<Integer> initialSizeList);
        public List<DbDO> listByMaxActive(Integer maxActive, String... fieldNames);

        public Map<Long,DbDO> mapByMaxActive(Integer maxActive, String... fieldNames);

        public Integer countByMaxActive(Integer maxActive);

        public default DbDO singleResultByMaxActive(Integer maxActive,String... fieldNames){
             List<DbDO> list=this.listByMaxActive(maxActive,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByMaxActive(Integer maxActive, Function<DbDO, T> mapper, String... fieldNames){
             List<DbDO> list=this.listByMaxActive(maxActive,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByMaxActive(DbDO updateDO, Integer maxActive);

        public Integer updateAllFieldsByMaxActive(DbDO updateDO,  Integer maxActive);

        public Integer deleteByMaxActive( Integer maxActive);






        public List<DbDO> listByInMaxActive(Collection<Integer> maxActiveList, String... fieldNames);

         public Map<Long,DbDO> mapByInMaxActive(Collection<Integer> maxActiveList, String... fieldNames);

         public Integer countByInMaxActive(Collection<Integer> maxActiveList);

         public default DbDO singleResultByInMaxActive(Collection<Integer> maxActiveList,String... fieldNames){
              List<DbDO> list=this.listByInMaxActive(maxActiveList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DbDO>> groupingByInMaxActive(Collection<Integer> maxActiveList, Function<DbDO, T> mapper, String... fieldNames){
              List<DbDO> list=this.listByInMaxActive(maxActiveList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInMaxActive(DbDO updateDO, Collection<Integer> maxActiveList);

         public Integer updateAllFieldsByInMaxActive(DbDO updateDO,  Collection<Integer> maxActiveList);

         public Integer deleteByInMaxActive( Collection<Integer> maxActiveList);
        public List<DbDO> listByMinIdle(Integer minIdle, String... fieldNames);

        public Map<Long,DbDO> mapByMinIdle(Integer minIdle, String... fieldNames);

        public Integer countByMinIdle(Integer minIdle);

        public default DbDO singleResultByMinIdle(Integer minIdle,String... fieldNames){
             List<DbDO> list=this.listByMinIdle(minIdle,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByMinIdle(Integer minIdle, Function<DbDO, T> mapper, String... fieldNames){
             List<DbDO> list=this.listByMinIdle(minIdle,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByMinIdle(DbDO updateDO, Integer minIdle);

        public Integer updateAllFieldsByMinIdle(DbDO updateDO,  Integer minIdle);

        public Integer deleteByMinIdle( Integer minIdle);






        public List<DbDO> listByInMinIdle(Collection<Integer> minIdleList, String... fieldNames);

         public Map<Long,DbDO> mapByInMinIdle(Collection<Integer> minIdleList, String... fieldNames);

         public Integer countByInMinIdle(Collection<Integer> minIdleList);

         public default DbDO singleResultByInMinIdle(Collection<Integer> minIdleList,String... fieldNames){
              List<DbDO> list=this.listByInMinIdle(minIdleList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DbDO>> groupingByInMinIdle(Collection<Integer> minIdleList, Function<DbDO, T> mapper, String... fieldNames){
              List<DbDO> list=this.listByInMinIdle(minIdleList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInMinIdle(DbDO updateDO, Collection<Integer> minIdleList);

         public Integer updateAllFieldsByInMinIdle(DbDO updateDO,  Collection<Integer> minIdleList);

         public Integer deleteByInMinIdle( Collection<Integer> minIdleList);


}

