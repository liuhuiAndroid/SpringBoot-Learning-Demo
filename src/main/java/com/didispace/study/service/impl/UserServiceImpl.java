package com.didispace.study.service.impl;

import com.didispace.study.service.UserService;

import org.springframework.stereotype.Service;

/**
 * Created by lh on 2018/3/9.
 */
@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, Integer age) {
//        jdbcTemplate.update("insert into USER(NAME, AGE) values(?, ?)", name, age);
    }

    @Override
    public void deleteByName(String name) {
//        jdbcTemplate.update("delete from USER where NAME = ?", name);
    }

    @Override
    public Integer getAllUsers() {
//        return jdbcTemplate.queryForObject("select count(1) from USER", Integer.class);
        return -1;
    }

    @Override
    public void deleteAllUsers() {
//        jdbcTemplate.update("delete from USER");
    }
}