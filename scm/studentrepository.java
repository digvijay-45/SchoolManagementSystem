package com.example.school_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.school_management.dto.student;

public interface studentrepository extends JpaRepository<student, Integer>
{

}
