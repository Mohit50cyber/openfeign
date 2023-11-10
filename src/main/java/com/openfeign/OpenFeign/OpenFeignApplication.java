package com.openfeign.OpenFeign;

import com.openfeign.OpenFeign.client.UserClient;
import com.openfeign.OpenFeign.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@EnableFeignClients
public class OpenFeignApplication {

	@Autowired
	private UserClient userClient;

	@GetMapping("/findAllUser")
	public List<UserResponse> getAllUsers(){
		return userClient.getUsers();
	}

	public static void main(String[] args) {
		SpringApplication.run(OpenFeignApplication.class, args);
	}

}
