package com.dataflow.di.dao;

import jakarta.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MainDao {

    @Resource
    private JdbcTemplate primaryJdbcTemplate;

    @Resource
    private JdbcTemplate secondJdbcTemplate;

    public String findInfo() {

        String mysql_string = primaryJdbcTemplate.queryForObject("select 'mysql';", String.class);

        String clickhouse_string = secondJdbcTemplate.queryForObject("select 'clickhouse' from system.one;", String.class);

        return "hello world! mysql: " + mysql_string + " clickhouse: " + clickhouse_string;
    }

}
