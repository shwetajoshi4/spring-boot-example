package com.sprint.boot.example.springbootexample;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				new Course (1, "Learn Sprintboot", "Shweta Joshi"),
				new Course (2, "Learn Crud Operations", "Shweta Joshi")
				
		);
	}

}
