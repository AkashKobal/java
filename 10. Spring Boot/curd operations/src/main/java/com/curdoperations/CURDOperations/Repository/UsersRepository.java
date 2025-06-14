package com.curdoperations.CURDOperations.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curdoperations.CURDOperations.Entity.Users;


@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{ // <Entity, PRIMARY KEY TYPE>
    // Custom query method to find a user by email
    // This method will be automatically implemented by Spring Data JPA
    // based on the method name
    // The method name should follow the Spring Data JPA naming conventions
    // to be recognized as a query method
    // The method will return an Optional<Users> object
    // which will be empty if no user is found with the given email
    // The method will be used in the UserService class
    // to check if a user with the given email already exists
    // in the database
    Optional<Users> findByEmail(String email);
}
