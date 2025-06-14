package com.curdoperations.CURDOperations.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curdoperations.CURDOperations.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    
} 
