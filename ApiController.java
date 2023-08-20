package com.example.demo.Controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;


@RestController
public class ApiController {
	
	@GetMapping("shak")
	public List<Student> fun()
	{
		return Arrays.asList(new Student("Shakthi","Don't lose your hope"),new Student("Priyanka","Nothing is permanent"));
	}

}
