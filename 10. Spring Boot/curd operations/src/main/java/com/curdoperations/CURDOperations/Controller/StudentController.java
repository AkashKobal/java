package com.curdoperations.CURDOperations.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curdoperations.CURDOperations.Entity.Employee;
import com.curdoperations.CURDOperations.Entity.StudentEntity;
import com.curdoperations.CURDOperations.Service.StudentService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/addStudent")
    public StudentEntity addStudent(@RequestBody StudentEntity studentEntity){
        return studentService.addStudent(studentEntity);
    }

    @GetMapping("/getAllStudents")
    public List<StudentEntity> getAllStudents(){
        return studentService.getAllStudents(); // get all students from the database
    }

     @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable Long id) {
        try {
            studentService.deleteStudent(id);
            return new ResponseEntity<>("Student with id " + id + " deleted successfully", HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getStudentId/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id) {
        StudentEntity studentEntity = studentService.getStudentById(id);
        if (studentEntity == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(studentEntity);
    }

    @PatchMapping("/editStudent/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable Long id, @RequestBody StudentEntity studentEntity) {
        StudentEntity updatedStudent = studentService.updateStudent(id, studentEntity);
        if (updatedStudent == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        return ResponseEntity.ok(updatedStudent);
    }

}
