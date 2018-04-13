package com.lk.hellospringboot;

import com.lk.hellospringboot.dao.GirlRepository;
import com.lk.hellospringboot.model.Girl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloSpringBootApplicationTests {

	private MockMvc mockMvc;

	@Autowired
	private GirlRepository girlRepository;

	@Test
	public void contextLoads() {

		girlRepository.save(new Girl("唐玉军",23));
		System.out.println(girlRepository.findAll().size());
	}

}
