package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController//which can able to handle web request
public class StudentController {
	
	//lets make this method restapi
	//http:localhost:8090/student    //by using this url cliant can access restaaaaaaaaapi
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Akshay","Randive");
	}
	
	@GetMapping("/Students")
	public List<Student> getStudents(){
		List<Student>students = new ArrayList<>();
		students.add(new Student("Akshay","Randive"));
		students.add(new Student("Aniket","Patil"));
		students.add(new Student("Akash","Shinde"));
		students.add(new Student("Amit","Shaha"));
		students.add(new Student("Narendra","Modi"));
		return students;
		
		
	}
	//creating RestApi for path variabls
	//http:localhost:8090/student/akshay/randive    //aksahy/randive are path variables
	
	//@PathVariable annotation
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName")String firstName, @PathVariable("lastName")String LastName) {
		return new Student(firstName, LastName);
	}


//build rest API to handle query parameter
//http://localhost:8080/student?firstName=Akshay&lastName=Randive   //in order to hand this query parameter we need @

@GetMapping("/student/query")

public Student studentQueryParam(@RequestParam(name="firstName") String firstName,
		@RequestParam(name= "lastName") String lastName) {
	return new Student(firstName,lastName);
}
}
