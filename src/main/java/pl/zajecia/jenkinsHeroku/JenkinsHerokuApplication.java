package pl.zajecia.jenkinsHeroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JenkinsHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsHerokuApplication.class, args);
	}


	@GetMapping
	public String get()
	{
		return "Hello";
	}
}
