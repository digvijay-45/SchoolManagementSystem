package com.example.school_management.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.school_management.dto.student;
import com.example.school_management.repository.studentrepository;

@RestController
public class controller 
{
	@Autowired
	studentrepository sr;
	
	@PostMapping("/add")
	public String addstudent(@RequestBody student s)
	{
		sr.save(s);
		return "saved";
	}
	
	@GetMapping("/fetch")
	public student fetch(@RequestParam int id) 
	{
		Optional<student>o=sr.findById(id);
	    student student=o.get();
	    return student;
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam int id)
	{
		sr.deleteById(id);
		return "deleted";
	}
	
	@PutMapping("/update")
	public String update(@RequestBody student s)
	{
		sr.save(s);
		return "updated";
	}

}
