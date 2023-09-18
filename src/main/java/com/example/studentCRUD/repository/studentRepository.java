package com.example.studentCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentCRUD.domain.student;

@Repository
public interface studentRepository extends JpaRepository<student, Long> {
	 
	}