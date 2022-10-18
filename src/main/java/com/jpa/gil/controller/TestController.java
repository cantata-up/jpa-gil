package com.jpa.gil.controller;

import com.jpa.gil.entity.TestEntity;
import com.jpa.gil.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@AllArgsConstructor
@RequestMapping(value = "/")
public class TestController {

	private TestService testService;

	// 직원 ALL 조회
	@GetMapping("search")
	List<TestEntity> findAllEmployees() {
		System.out.println(testService.findAll());
		return testService.findAll();
	}

	@GetMapping("health")
	public String health() {
		return "OK";
	}


}
