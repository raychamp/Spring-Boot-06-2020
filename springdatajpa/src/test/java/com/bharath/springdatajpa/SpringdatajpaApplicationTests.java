package com.bharath.springdatajpa;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.springdatajpa.entities.Student;
import com.bharath.springdatajpa.repositories.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	private StudentRepository repository;
	
	@Test
	void testSaveStudent() {
		
		Student student = new Student();
		student.setId(123L);
		student.setName("Champion");
		student.setTestScore(110);
		
		repository.save(student);
		
		Student savedStudent = repository.findById(123L).get();
		
		assertNotNull(savedStudent);
		
	}

}
