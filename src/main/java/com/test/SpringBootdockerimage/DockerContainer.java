package com.test.SpringBootdockerimage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerContainer {
	
	@GetMapping("/message")
	public String getHello()
	{
		return "hello from SpringBoot";
	}
	@GetMapping("/message3")
	public String sayhello()
	{
		return "hello Mr Simhachalam";
	}
	@GetMapping("/message5")
	public String sayhello()
	{
		return "hello Mr Simhachalam";
	}
}
