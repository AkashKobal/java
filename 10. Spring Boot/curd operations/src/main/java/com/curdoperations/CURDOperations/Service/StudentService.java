package com.curdoperations.CURDOperations.Service;

import java.util.List;
import java.util.Optional;

import com.curdoperations.CURDOperations.DTO.RequestResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.curdoperations.CURDOperations.Entity.StudentEntity;
import com.curdoperations.CURDOperations.Repository.StudentRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

    public final StudentRepository studentRepository; // inject the StudentRepository

    public StudentEntity addStudent(StudentEntity studentEntity){

        return studentRepository.save(studentEntity);
    }

    // fetch all students
    public List<StudentEntity> getAllStudents(){
        return studentRepository.findAll(); // get all students from the database
    }

    
    public void deleteStudent(Long id) {
        if(!studentRepository.existsById(id)){
            throw new EntityNotFoundException("Student not found with id: " + id);
        }
        studentRepository.deleteById(id); // delete the employee by id from the database
    }

    public StudentEntity getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public StudentEntity updateStudent(Long id, StudentEntity studentEntity) {
        Optional<StudentEntity> optionalStudent = studentRepository.findById(id);
        if(optionalStudent.isPresent()){
            StudentEntity existingStudent = optionalStudent.get();
            existingStudent.setFirstName(studentEntity.getFirstName());
            existingStudent.setLastName(studentEntity.getLastName());
            return studentRepository.save(existingStudent); // save the updated employee to the database
        }
        return null;
    }

}
