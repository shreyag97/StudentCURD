package com.example.studentCRUD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentCRUD.domain.student;
import com.example.studentCRUD.repository.studentRepository;

import java.util.List;

@Service
public class studentservice {
	
@Autowired

private studentRepository repo;
public List<student> listAll() {
    return repo.findAll();
}

public void save(student std) {
    repo.save(std);
}

public student get(long id) {
    return repo.findById(id).get();
}

public void delete(long id) {
    repo.deleteById(id);
}

}
