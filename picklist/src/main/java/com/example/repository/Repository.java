package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.entity.Student;

@Component
public interface Repository extends JpaRepository<Student, String>{

}
