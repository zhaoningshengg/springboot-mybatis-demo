package pers.zns.demo.springboot.mybatis.springbootmybatisdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import pers.zns.demo.springboot.mybatis.springbootmybatisdemo.domain.AisStaticDownload29;
import pers.zns.demo.springboot.mybatis.springbootmybatisdemo.domain.ColumnCounter;
import pers.zns.demo.springboot.mybatis.springbootmybatisdemo.service.AisStaticDownload29Service;
import pers.zns.demo.springboot.mybatis.springbootmybatisdemo.mapper.AisStaticDownload29Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Service
public class AisStaticDownload29ServiceImpl extends ServiceImpl<AisStaticDownload29Mapper, AisStaticDownload29>
        implements AisStaticDownload29Service {

    @Autowired
    private AisStaticDownload29Mapper mapper;

    public List<ColumnCounter> testCount() {
        return mapper.testCount();
    }

    public List<ColumnCounter> testCount2(List<String> columnNames) {
        return mapper.testCount2(columnNames);
    }

    public List<ColumnCounter> testCount3(List<String> tableNames, List<String> columnNames) {
        return mapper.testCount3(tableNames,columnNames);
    }
}




