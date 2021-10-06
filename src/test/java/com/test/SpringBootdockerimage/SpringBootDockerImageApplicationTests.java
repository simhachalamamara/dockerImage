package com.test.SpringBootdockerimage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDockerImageApplicationTests {
	
	@Autowired
	private DockerContainer dockerContainer;

	@Test
	void contextLoads() {
	}
	@Test
	void getString()
	{
		String message=dockerContainer.getHello();
		assertEquals("hello from SpringBoot",message);
	}

}
