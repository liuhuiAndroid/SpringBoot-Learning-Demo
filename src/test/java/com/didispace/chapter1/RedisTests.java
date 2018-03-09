package com.didispace.chapter1;

import com.didispace.study.Application;
import com.didispace.study.domain.HiphopMan;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lh on 2018/3/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class RedisTests {

    @Autowired
    private RedisTemplate<String, HiphopMan> redisTemplate;

    @Test
    public void test() throws Exception {

        // 保存对象
        HiphopMan user = new HiphopMan("超人", 20);
        redisTemplate.opsForValue().set(user.getUsername(), user);

        user = new HiphopMan("蝙蝠侠", 30);
        redisTemplate.opsForValue().set(user.getUsername(), user);

        user = new HiphopMan("蜘蛛侠", 40);
        redisTemplate.opsForValue().set(user.getUsername(), user);

        Assert.assertEquals(20, redisTemplate.opsForValue().get("超人").getAge().longValue());
        Assert.assertEquals(30, redisTemplate.opsForValue().get("蝙蝠侠").getAge().longValue());
        Assert.assertEquals(40, redisTemplate.opsForValue().get("蜘蛛侠").getAge().longValue());

    }

}
