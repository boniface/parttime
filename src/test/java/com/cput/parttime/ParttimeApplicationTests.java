package com.cput.parttime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParttimeApplicationTests {

	@Test
	public void contextLoads() {
		Order order = new Order
				.Builder()
				.id("1")
				.build();

	}

}
