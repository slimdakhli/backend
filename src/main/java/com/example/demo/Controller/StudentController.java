package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.Entity.Student;
import com.example.demo.Entity.Teacher;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.TeacherRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class StudentController {
	@Autowired
	private  TeacherRepository teacherrepository ;
	@Autowired
	private StudentRepository studentrepository ;



	@PostMapping("/teacher/add")
	Teacher newteacher(@RequestBody Teacher newTeacher) {
		return teacherrepository.save(newTeacher);
	}
	@PostMapping("/student/add")
	Student newstudent(@RequestBody Student newStudent) {
		return studentrepository.save(newStudent);
	}

}
