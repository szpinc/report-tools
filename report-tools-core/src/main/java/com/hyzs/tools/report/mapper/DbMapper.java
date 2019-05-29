package com.hyzs.tools.report.mapper;
import com.hyzs.tools.report.dbo.DbDO;
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
public interface DbMapper extends CommonMapper<DbDO,Long>{

        public List<DbDO> listByDriverClass(@Param("driverClass") String driverClass,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DbDO> mapByDriverClass(@Param("driverClass") String driverClass,@Param("fieldNames") String[] fieldNames);

        public Integer countByDriverClass(@Param("driverClass") String driverClass);

        public default DbDO singleResultByDriverClass(String driverClass,String[] fieldNames){
             List<DbDO> list=this.listByDriverClass(driverClass,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByDriverClass(String driverClass, Function<DbDO, T> mapper, String[] fieldNames){
             List<DbDO> list=this.listByDriverClass(driverClass,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDriverClass(@Param("updateDO") DbDO updateDO, @Param("driverClass") String driverClass);

        public Integer updateAllFieldsByDriverClass(@Param("updateDO") DbDO updateDO, @Param("driverClass") String driverClass);

        public Integer deleteByDriverClass( @Param("driverClass") String driverClass);




        public List<DbDO> listByInDriverClass(@Param("driverClassList") Collection<String> driverClassList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DbDO> mapByInDriverClass(@Param("driverClassList") Collection<String> driverClassList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInDriverClass(@Param("driverClassList") Collection<String> driverClassList);

        public default DbDO singleResultByInDriverClass(Collection<String> driverClassList,String[] fieldNames){
             List<DbDO> list=this.listByInDriverClass(driverClassList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByInDriverClass(Collection<String> driverClassList, Function<DbDO, T> mapper, String[] fieldNames){
             List<DbDO> list=this.listByInDriverClass(driverClassList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInDriverClass(@Param("updateDO") DbDO updateDO, @Param("driverClassList") Collection<String> driverClassList);

        public Integer updateAllFieldsByInDriverClass(@Param("updateDO") DbDO updateDO, @Param("driverClassList") Collection<String> driverClassList);

        public Integer deleteByInDriverClass( @Param("driverClassList") Collection<String> driverClassList);

        public List<DbDO> listByName(@Param("name") String name,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DbDO> mapByName(@Param("name") String name,@Param("fieldNames") String[] fieldNames);

        public Integer countByName(@Param("name") String name);

        public default DbDO singleResultByName(String name,String[] fieldNames){
             List<DbDO> list=this.listByName(name,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByName(String name, Function<DbDO, T> mapper, String[] fieldNames){
             List<DbDO> list=this.listByName(name,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByName(@Param("updateDO") DbDO updateDO, @Param("name") String name);

        public Integer updateAllFieldsByName(@Param("updateDO") DbDO updateDO, @Param("name") String name);

        public Integer deleteByName( @Param("name") String name);




        public List<DbDO> listByInName(@Param("nameList") Collection<String> nameList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DbDO> mapByInName(@Param("nameList") Collection<String> nameList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInName(@Param("nameList") Collection<String> nameList);

        public default DbDO singleResultByInName(Collection<String> nameList,String[] fieldNames){
             List<DbDO> list=this.listByInName(nameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByInName(Collection<String> nameList, Function<DbDO, T> mapper, String[] fieldNames){
             List<DbDO> list=this.listByInName(nameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInName(@Param("updateDO") DbDO updateDO, @Param("nameList") Collection<String> nameList);

        public Integer updateAllFieldsByInName(@Param("updateDO") DbDO updateDO, @Param("nameList") Collection<String> nameList);

        public Integer deleteByInName( @Param("nameList") Collection<String> nameList);

        public List<DbDO> listByPassword(@Param("password") String password,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DbDO> mapByPassword(@Param("password") String password,@Param("fieldNames") String[] fieldNames);

        public Integer countByPassword(@Param("password") String password);

        public default DbDO singleResultByPassword(String password,String[] fieldNames){
             List<DbDO> list=this.listByPassword(password,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByPassword(String password, Function<DbDO, T> mapper, String[] fieldNames){
             List<DbDO> list=this.listByPassword(password,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPassword(@Param("updateDO") DbDO updateDO, @Param("password") String password);

        public Integer updateAllFieldsByPassword(@Param("updateDO") DbDO updateDO, @Param("password") String password);

        public Integer deleteByPassword( @Param("password") String password);




        public List<DbDO> listByInPassword(@Param("passwordList") Collection<String> passwordList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DbDO> mapByInPassword(@Param("passwordList") Collection<String> passwordList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInPassword(@Param("passwordList") Collection<String> passwordList);

        public default DbDO singleResultByInPassword(Collection<String> passwordList,String[] fieldNames){
             List<DbDO> list=this.listByInPassword(passwordList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByInPassword(Collection<String> passwordList, Function<DbDO, T> mapper, String[] fieldNames){
             List<DbDO> list=this.listByInPassword(passwordList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPassword(@Param("updateDO") DbDO updateDO, @Param("passwordList") Collection<String> passwordList);

        public Integer updateAllFieldsByInPassword(@Param("updateDO") DbDO updateDO, @Param("passwordList") Collection<String> passwordList);

        public Integer deleteByInPassword( @Param("passwordList") Collection<String> passwordList);

        public List<DbDO> listByUrl(@Param("url") String url,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DbDO> mapByUrl(@Param("url") String url,@Param("fieldNames") String[] fieldNames);

        public Integer countByUrl(@Param("url") String url);

        public default DbDO singleResultByUrl(String url,String[] fieldNames){
             List<DbDO> list=this.listByUrl(url,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByUrl(String url, Function<DbDO, T> mapper, String[] fieldNames){
             List<DbDO> list=this.listByUrl(url,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUrl(@Param("updateDO") DbDO updateDO, @Param("url") String url);

        public Integer updateAllFieldsByUrl(@Param("updateDO") DbDO updateDO, @Param("url") String url);

        public Integer deleteByUrl( @Param("url") String url);




        public List<DbDO> listByInUrl(@Param("urlList") Collection<String> urlList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DbDO> mapByInUrl(@Param("urlList") Collection<String> urlList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInUrl(@Param("urlList") Collection<String> urlList);

        public default DbDO singleResultByInUrl(Collection<String> urlList,String[] fieldNames){
             List<DbDO> list=this.listByInUrl(urlList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByInUrl(Collection<String> urlList, Function<DbDO, T> mapper, String[] fieldNames){
             List<DbDO> list=this.listByInUrl(urlList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUrl(@Param("updateDO") DbDO updateDO, @Param("urlList") Collection<String> urlList);

        public Integer updateAllFieldsByInUrl(@Param("updateDO") DbDO updateDO, @Param("urlList") Collection<String> urlList);

        public Integer deleteByInUrl( @Param("urlList") Collection<String> urlList);

        public List<DbDO> listByUsername(@Param("username") String username,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DbDO> mapByUsername(@Param("username") String username,@Param("fieldNames") String[] fieldNames);

        public Integer countByUsername(@Param("username") String username);

        public default DbDO singleResultByUsername(String username,String[] fieldNames){
             List<DbDO> list=this.listByUsername(username,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByUsername(String username, Function<DbDO, T> mapper, String[] fieldNames){
             List<DbDO> list=this.listByUsername(username,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUsername(@Param("updateDO") DbDO updateDO, @Param("username") String username);

        public Integer updateAllFieldsByUsername(@Param("updateDO") DbDO updateDO, @Param("username") String username);

        public Integer deleteByUsername( @Param("username") String username);




        public List<DbDO> listByInUsername(@Param("usernameList") Collection<String> usernameList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DbDO> mapByInUsername(@Param("usernameList") Collection<String> usernameList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInUsername(@Param("usernameList") Collection<String> usernameList);

        public default DbDO singleResultByInUsername(Collection<String> usernameList,String[] fieldNames){
             List<DbDO> list=this.listByInUsername(usernameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByInUsername(Collection<String> usernameList, Function<DbDO, T> mapper, String[] fieldNames){
             List<DbDO> list=this.listByInUsername(usernameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUsername(@Param("updateDO") DbDO updateDO, @Param("usernameList") Collection<String> usernameList);

        public Integer updateAllFieldsByInUsername(@Param("updateDO") DbDO updateDO, @Param("usernameList") Collection<String> usernameList);

        public Integer deleteByInUsername( @Param("usernameList") Collection<String> usernameList);

        public List<DbDO> listByType(@Param("type") String type,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DbDO> mapByType(@Param("type") String type,@Param("fieldNames") String[] fieldNames);

        public Integer countByType(@Param("type") String type);

        public default DbDO singleResultByType(String type,String[] fieldNames){
             List<DbDO> list=this.listByType(type,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByType(String type, Function<DbDO, T> mapper, String[] fieldNames){
             List<DbDO> list=this.listByType(type,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByType(@Param("updateDO") DbDO updateDO, @Param("type") String type);

        public Integer updateAllFieldsByType(@Param("updateDO") DbDO updateDO, @Param("type") String type);

        public Integer deleteByType( @Param("type") String type);




        public List<DbDO> listByInType(@Param("typeList") Collection<String> typeList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DbDO> mapByInType(@Param("typeList") Collection<String> typeList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInType(@Param("typeList") Collection<String> typeList);

        public default DbDO singleResultByInType(Collection<String> typeList,String[] fieldNames){
             List<DbDO> list=this.listByInType(typeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByInType(Collection<String> typeList, Function<DbDO, T> mapper, String[] fieldNames){
             List<DbDO> list=this.listByInType(typeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInType(@Param("updateDO") DbDO updateDO, @Param("typeList") Collection<String> typeList);

        public Integer updateAllFieldsByInType(@Param("updateDO") DbDO updateDO, @Param("typeList") Collection<String> typeList);

        public Integer deleteByInType( @Param("typeList") Collection<String> typeList);

        public List<DbDO> listByInitialSize(@Param("initialSize") Integer initialSize,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DbDO> mapByInitialSize(@Param("initialSize") Integer initialSize,@Param("fieldNames") String[] fieldNames);

        public Integer countByInitialSize(@Param("initialSize") Integer initialSize);

        public default DbDO singleResultByInitialSize(Integer initialSize,String[] fieldNames){
             List<DbDO> list=this.listByInitialSize(initialSize,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByInitialSize(Integer initialSize, Function<DbDO, T> mapper, String[] fieldNames){
             List<DbDO> list=this.listByInitialSize(initialSize,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInitialSize(@Param("updateDO") DbDO updateDO, @Param("initialSize") Integer initialSize);

        public Integer updateAllFieldsByInitialSize(@Param("updateDO") DbDO updateDO, @Param("initialSize") Integer initialSize);

        public Integer deleteByInitialSize( @Param("initialSize") Integer initialSize);




        public List<DbDO> listByInInitialSize(@Param("initialSizeList") Collection<Integer> initialSizeList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DbDO> mapByInInitialSize(@Param("initialSizeList") Collection<Integer> initialSizeList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInInitialSize(@Param("initialSizeList") Collection<Integer> initialSizeList);

        public default DbDO singleResultByInInitialSize(Collection<Integer> initialSizeList,String[] fieldNames){
             List<DbDO> list=this.listByInInitialSize(initialSizeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByInInitialSize(Collection<Integer> initialSizeList, Function<DbDO, T> mapper, String[] fieldNames){
             List<DbDO> list=this.listByInInitialSize(initialSizeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInInitialSize(@Param("updateDO") DbDO updateDO, @Param("initialSizeList") Collection<Integer> initialSizeList);

        public Integer updateAllFieldsByInInitialSize(@Param("updateDO") DbDO updateDO, @Param("initialSizeList") Collection<Integer> initialSizeList);

        public Integer deleteByInInitialSize( @Param("initialSizeList") Collection<Integer> initialSizeList);

        public List<DbDO> listByMaxActive(@Param("maxActive") Integer maxActive,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DbDO> mapByMaxActive(@Param("maxActive") Integer maxActive,@Param("fieldNames") String[] fieldNames);

        public Integer countByMaxActive(@Param("maxActive") Integer maxActive);

        public default DbDO singleResultByMaxActive(Integer maxActive,String[] fieldNames){
             List<DbDO> list=this.listByMaxActive(maxActive,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByMaxActive(Integer maxActive, Function<DbDO, T> mapper, String[] fieldNames){
             List<DbDO> list=this.listByMaxActive(maxActive,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByMaxActive(@Param("updateDO") DbDO updateDO, @Param("maxActive") Integer maxActive);

        public Integer updateAllFieldsByMaxActive(@Param("updateDO") DbDO updateDO, @Param("maxActive") Integer maxActive);

        public Integer deleteByMaxActive( @Param("maxActive") Integer maxActive);




        public List<DbDO> listByInMaxActive(@Param("maxActiveList") Collection<Integer> maxActiveList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DbDO> mapByInMaxActive(@Param("maxActiveList") Collection<Integer> maxActiveList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInMaxActive(@Param("maxActiveList") Collection<Integer> maxActiveList);

        public default DbDO singleResultByInMaxActive(Collection<Integer> maxActiveList,String[] fieldNames){
             List<DbDO> list=this.listByInMaxActive(maxActiveList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByInMaxActive(Collection<Integer> maxActiveList, Function<DbDO, T> mapper, String[] fieldNames){
             List<DbDO> list=this.listByInMaxActive(maxActiveList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInMaxActive(@Param("updateDO") DbDO updateDO, @Param("maxActiveList") Collection<Integer> maxActiveList);

        public Integer updateAllFieldsByInMaxActive(@Param("updateDO") DbDO updateDO, @Param("maxActiveList") Collection<Integer> maxActiveList);

        public Integer deleteByInMaxActive( @Param("maxActiveList") Collection<Integer> maxActiveList);

        public List<DbDO> listByMinIdle(@Param("minIdle") Integer minIdle,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DbDO> mapByMinIdle(@Param("minIdle") Integer minIdle,@Param("fieldNames") String[] fieldNames);

        public Integer countByMinIdle(@Param("minIdle") Integer minIdle);

        public default DbDO singleResultByMinIdle(Integer minIdle,String[] fieldNames){
             List<DbDO> list=this.listByMinIdle(minIdle,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByMinIdle(Integer minIdle, Function<DbDO, T> mapper, String[] fieldNames){
             List<DbDO> list=this.listByMinIdle(minIdle,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByMinIdle(@Param("updateDO") DbDO updateDO, @Param("minIdle") Integer minIdle);

        public Integer updateAllFieldsByMinIdle(@Param("updateDO") DbDO updateDO, @Param("minIdle") Integer minIdle);

        public Integer deleteByMinIdle( @Param("minIdle") Integer minIdle);




        public List<DbDO> listByInMinIdle(@Param("minIdleList") Collection<Integer> minIdleList,@Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DbDO> mapByInMinIdle(@Param("minIdleList") Collection<Integer> minIdleList,@Param("fieldNames") String[] fieldNames);

        public Integer countByInMinIdle(@Param("minIdleList") Collection<Integer> minIdleList);

        public default DbDO singleResultByInMinIdle(Collection<Integer> minIdleList,String[] fieldNames){
             List<DbDO> list=this.listByInMinIdle(minIdleList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DbDO>> groupingByInMinIdle(Collection<Integer> minIdleList, Function<DbDO, T> mapper, String[] fieldNames){
             List<DbDO> list=this.listByInMinIdle(minIdleList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInMinIdle(@Param("updateDO") DbDO updateDO, @Param("minIdleList") Collection<Integer> minIdleList);

        public Integer updateAllFieldsByInMinIdle(@Param("updateDO") DbDO updateDO, @Param("minIdleList") Collection<Integer> minIdleList);

        public Integer deleteByInMinIdle( @Param("minIdleList") Collection<Integer> minIdleList);


}
