package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // This querry is called JPQL (Java Persistence Query Language)
    @Query("SELECT s FROM Student s WHERE s.name = ?1")
    List<Student> findByName(String name); // method starts with "findBy" followed by the property name, because it is a standard

    @Query("SELECT s FROM Student s WHERE s.marks = ?1")
    List<Student> findByMarks(int marks);


}
