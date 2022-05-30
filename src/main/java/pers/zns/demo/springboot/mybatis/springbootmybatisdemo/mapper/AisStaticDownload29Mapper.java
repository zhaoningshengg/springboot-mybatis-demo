package pers.zns.demo.springboot.mybatis.springbootmybatisdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import pers.zns.demo.springboot.mybatis.springbootmybatisdemo.domain.AisStaticDownload29;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import pers.zns.demo.springboot.mybatis.springbootmybatisdemo.domain.ColumnCounter;

import java.util.List;
import java.util.Map;

/**
 * @Entity pers.zns.demo.springboot.mybatis.springbootmybatisdemo.domain.AisStaticDownload29
 */
public interface AisStaticDownload29Mapper extends BaseMapper<AisStaticDownload29> {

    List<ColumnCounter> testCount();

    List<ColumnCounter> testCount2(@Param("columnNames") List<String> columnNames);

    List<ColumnCounter> testCount3(@Param("tableNames") List<String> tableNames, @Param("columnNames") List<String> columnNames);
}




