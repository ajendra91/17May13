package com.example.FeignServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

    @GetMapping("/users")
    public String getUsers() {
        return "feignServer";
    }

    @GetMapping("/user/{name}")
    public String getId(@PathVariable String name) {
        return "feignServer"+name;
    }

}
