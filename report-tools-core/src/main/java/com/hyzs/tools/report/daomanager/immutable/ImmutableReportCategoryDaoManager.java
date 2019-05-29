package com.hyzs.tools.report.daomanager.immutable;

import com.hyzs.tools.report.dbo.ReportCategoryDO;
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
public interface ImmutableReportCategoryDaoManager extends CommonDaoManager<ReportCategoryDO,Long> {


        public List<ReportCategoryDO> listByName(String name, String... fieldNames);

        public Map<Long,ReportCategoryDO> mapByName(String name, String... fieldNames);

        public Integer countByName(String name);

        public default ReportCategoryDO singleResultByName(String name,String... fieldNames){
             List<ReportCategoryDO> list=this.listByName(name,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportCategoryDO>> groupingByName(String name, Function<ReportCategoryDO, T> mapper, String... fieldNames){
             List<ReportCategoryDO> list=this.listByName(name,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByName(ReportCategoryDO updateDO, String name);

        public Integer updateAllFieldsByName(ReportCategoryDO updateDO,  String name);

        public Integer deleteByName( String name);






        public List<ReportCategoryDO> listByInName(Collection<String> nameList, String... fieldNames);

         public Map<Long,ReportCategoryDO> mapByInName(Collection<String> nameList, String... fieldNames);

         public Integer countByInName(Collection<String> nameList);

         public default ReportCategoryDO singleResultByInName(Collection<String> nameList,String... fieldNames){
              List<ReportCategoryDO> list=this.listByInName(nameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<ReportCategoryDO>> groupingByInName(Collection<String> nameList, Function<ReportCategoryDO, T> mapper, String... fieldNames){
              List<ReportCategoryDO> list=this.listByInName(nameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInName(ReportCategoryDO updateDO, Collection<String> nameList);

         public Integer updateAllFieldsByInName(ReportCategoryDO updateDO,  Collection<String> nameList);

         public Integer deleteByInName( Collection<String> nameList);
        public List<ReportCategoryDO> listByDescription(String description, String... fieldNames);

        public Map<Long,ReportCategoryDO> mapByDescription(String description, String... fieldNames);

        public Integer countByDescription(String description);

        public default ReportCategoryDO singleResultByDescription(String description,String... fieldNames){
             List<ReportCategoryDO> list=this.listByDescription(description,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<ReportCategoryDO>> groupingByDescription(String description, Function<ReportCategoryDO, T> mapper, String... fieldNames){
             List<ReportCategoryDO> list=this.listByDescription(description,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDescription(ReportCategoryDO updateDO, String description);

        public Integer updateAllFieldsByDescription(ReportCategoryDO updateDO,  String description);

        public Integer deleteByDescription( String description);






        public List<ReportCategoryDO> listByInDescription(Collection<String> descriptionList, String... fieldNames);

         public Map<Long,ReportCategoryDO> mapByInDescription(Collection<String> descriptionList, String... fieldNames);

         public Integer countByInDescription(Collection<String> descriptionList);

         public default ReportCategoryDO singleResultByInDescription(Collection<String> descriptionList,String... fieldNames){
              List<ReportCategoryDO> list=this.listByInDescription(descriptionList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<ReportCategoryDO>> groupingByInDescription(Collection<String> descriptionList, Function<ReportCategoryDO, T> mapper, String... fieldNames){
              List<ReportCategoryDO> list=this.listByInDescription(descriptionList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInDescription(ReportCategoryDO updateDO, Collection<String> descriptionList);

         public Integer updateAllFieldsByInDescription(ReportCategoryDO updateDO,  Collection<String> descriptionList);

         public Integer deleteByInDescription( Collection<String> descriptionList);


}

