package pers.zns.demo.springboot.mybatis.springbootmybatisdemo.domain;

import lombok.Data;

/**
 * @program: springboot-mybatis-demo
 * @description:
 * @author: zns
 * @create: 2022-05-30 17:34
 */
@Data
public class ColumnCounter {
    private String tableName;
    private String columnName;
    private Integer totalNum;
    private Integer totalNull;
    private Integer totalNotnull;
}