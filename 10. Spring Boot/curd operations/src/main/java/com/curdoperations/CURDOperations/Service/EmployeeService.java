package com.curdoperations.CURDOperations.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.curdoperations.CURDOperations.Entity.Employee;
import com.curdoperations.CURDOperations.Repository.EmployeeRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // because we want to inject the EmployeeRepository
public class EmployeeService {
    
    private final EmployeeRepository employeeRepository; // inject the EmployeeRepository

    public Employee postEmployee(Employee employee) {
        return employeeRepository.save(employee); // save the employee to the database
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll(); // get all employees from the database
    }

    public void deleteEmployee(Long id) {
        if(!employeeRepository.existsById(id)){
            throw new EntityNotFoundException("Employee not found with id: " + id);
        }
        employeeRepository.deleteById(id); // delete the employee by id from the database
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee updateEmployee(Long id, Employee employee) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if(optionalEmployee.isPresent()){
            Employee existingEmployee = optionalEmployee.get();
            existingEmployee.setName(employee.getName());
            existingEmployee.setEmail(employee.getEmail());
            existingEmployee.setPhone(employee.getPhone());
            existingEmployee.setDepartment(employee.getDepartment());
            return employeeRepository.save(existingEmployee); // save the updated employee to the database
        }
        return null;
    }
}
