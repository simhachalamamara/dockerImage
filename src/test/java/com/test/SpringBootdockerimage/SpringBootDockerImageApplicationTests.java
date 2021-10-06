package com.test.SpringBootdockerimage;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

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
