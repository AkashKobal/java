package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        StudentRepository repository = context.getBean(StudentRepository.class);


        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);

//insert data into the database
        s1.setRollNo(101);
        s1.setName("John Doe");
        s1.setMarks(85);
        System.out.println("Student 1: " + s1 + "Inserted Successfully");

        s2.setRollNo(102);
        s2.setName("Jane Smith");
        s2.setMarks(90);
        System.out.println("Student 2: " + s2 + "Inserted Successfully");

        s3.setRollNo(103);
        s3.setName("Alice Johnson");
        s3.setMarks(95);
        System.out.println("Student 3: " + s3 + "Inserted Successfully");


        repository.save(s1);
        repository.save(s2);
        repository.save(s3);

        // fetch all data from the database
        System.out.println(repository.findAll());

        // fetch data by id
        System.out.println(repository.findById(101));

        // search by name
        System.out.println(repository.findByName("John Doe"));

        // search by marks
        System.out.println(repository.findByMarks(90));

        // update a student
        s1.setMarks(95);
        repository.save(s1);

        // delete a student
        repository.deleteById(102);
    }

}
