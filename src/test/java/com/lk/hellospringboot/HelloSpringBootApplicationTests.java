package com.lk.hellospringboot;

import com.lk.hellospringboot.controller.HelloController;
import com.lk.hellospringboot.dao.GirlRepository;
import com.lk.hellospringboot.model.Girl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloSpringBootApplicationTests {

	private MockMvc mockMvc;

	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
	}

	@Autowired
	private GirlRepository girlRepository;

	@Test
	public void contextLoads() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.post("/hello/getGirl")).andDo(print());
	}

}
