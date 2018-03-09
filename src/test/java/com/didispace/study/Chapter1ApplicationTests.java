package com.didispace.study;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = MockServletContext.class)
@SpringApplicationConfiguration(Application.class)
public class Chapter1ApplicationTests {

	private static final Log l = LogFactory.getLog(Application.class);

//	private MockMvc mvc;
//
//	@Before
//	public void setUp() throws Exception {
//		mvc = MockMvcBuilders.standaloneSetup(new com.didispace.chapter1.HelloController()).build();
//	}
//
//	@Test
//	public void getHello() throws Exception {
//		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andExpect(content().string(equalTo("Hello World")));
//	}



	@Autowired
	private BlogProperties blogProperties;

	@Test
	public void getHelloProperties() throws Exception {
		Assert.assertEquals(blogProperties.getName(), "computer DD");
		Assert.assertEquals(blogProperties.getTitle(), "Spring Boot教程");
		Assert.assertEquals(blogProperties.getDesc(), "computer DD正在努力写《Spring Boot教程》");
		Assert.assertEquals(blogProperties.getDesc(), "computer DD正在努力写《Spring Boot教程》");
		l.info("随机数测试输出：");
		l.info("随机字符串 : " + blogProperties.getValue());
		l.info("随机int : " + blogProperties.getNumber());
		l.info("随机long : " + blogProperties.getBignumber());
		l.info("随机10以下 : " + blogProperties.getTest1());
		l.info("随机10-20 : " + blogProperties.getTest2());
		l.info("测试端口号 : " + blogProperties.getPort());
	}

}
