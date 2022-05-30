package pers.zns.demo.springboot.mybatis.springbootmybatisdemo;

import cn.hutool.core.util.StrUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pers.zns.demo.springboot.mybatis.springbootmybatisdemo.domain.ColumnCounter;
import pers.zns.demo.springboot.mybatis.springbootmybatisdemo.service.impl.AisStaticDownload29ServiceImpl;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringbootMybatisDemoApplicationTests {

    @Autowired
    private AisStaticDownload29ServiceImpl service;

    @Test
    void contextLoads() {
        System.out.println(service.testCount());
    }

    @Test
    void test2() {
        System.out.println(service.testCount2(Arrays.asList("imo", "callSign")));
    }

    @Test
    void test3() {
        List<ColumnCounter> res = service.testCount3(
                Arrays.asList("ais_static_download_29", "ais_static_download_88", "ais_static_download_txt_33", "ais_static_download_txt_92"),
                Arrays.asList("id",
                        "mmsi",
                        "imo",
                        "callSign",
                        "shipName",
                        "shipType",
                        "shipLength",
                        "shipBreadth",
                        "fixingDevice",
                        "eta",
                        "draft",
                        "destination",
                        "deviceType",
                        "countryCode",
                        "receiveTime",
                        "sourceId",
                        "toBow",
                        "toStern",
                        "toPort",
                        "toStarboard",
                        "messageType",
                        "baseStationId",
                        "mixShipType",
                        "dwt",
                        "gt",
                        "originalType",
                        "shipTypeLabel",
                        "shipTypeEnLabel"));
        res.forEach(columnCounter -> System.out.println(
                StrUtil.join(",",
                        columnCounter.getTableName(),
                        columnCounter.getColumnName(),
                        columnCounter.getTotalNum(),
                        columnCounter.getTotalNotnull(),
                        columnCounter.getTotalNull())
        ));
    }

}
