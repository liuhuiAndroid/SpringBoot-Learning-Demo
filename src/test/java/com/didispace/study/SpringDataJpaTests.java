package com.didispace.study;

import com.didispace.study.domain.Man;
import com.didispace.study.domain.ManRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lh on 2018/3/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class SpringDataJpaTests {

    @Autowired
    private ManRepository manRepository;

    @Test
    @Transactional
    public void test() throws Exception {

        // 创建10条记录
        manRepository.save(new Man("AAA", 10));
        manRepository.save(new Man("BBB", 20));
        manRepository.save(new Man("CCC", 30));
        manRepository.save(new Man("DDD", 40));
        manRepository.save(new Man("EEE", 50));
        manRepository.save(new Man("FFF", 60));
        manRepository.save(new Man("GGG", 70));
        manRepository.save(new Man("HHH", 80));
        manRepository.save(new Man("III", 90));
        manRepository.save(new Man("JJJ", 100));

//        // 测试findAll, 查询所有记录
        //        Assert.assertEquals(10, manRepository.findAll().size());
        //
        //        // 测试findByName, 查询姓名为FFF的User
        //        Assert.assertEquals(60, manRepository.findByName("FFF").getAge().longValue());
        //
        //        // 测试findUser, 查询姓名为FFF的User
        //        Assert.assertEquals(60, manRepository.findUser("FFF").getAge().longValue());
        //
        //        // 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
        //        Assert.assertEquals("FFF", manRepository.findByNameAndAge("FFF", 60).getName());
        //
        //        // 测试删除姓名为AAA的User
        //        manRepository.delete(manRepository.findByName("AAA"));
        //
        //        // 测试findAll, 查询所有记录, 验证上面的删除是否成功
        //        Assert.assertEquals(9, manRepository.findAll().size());

    }

}
