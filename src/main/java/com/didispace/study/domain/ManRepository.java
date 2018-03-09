package com.didispace.study.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by lh on 2018/3/8.
 */
public interface ManRepository extends JpaRepository<Man, Long> {

    Man findByName(String name);

    Man findByNameAndAge(String name, Integer age);

    @Query("from Man u where u.name=:name")
    Man findUser(@Param("name") String name);

}