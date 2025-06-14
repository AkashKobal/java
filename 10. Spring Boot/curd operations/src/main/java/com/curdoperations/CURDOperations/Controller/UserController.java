package com.curdoperations.CURDOperations.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.curdoperations.CURDOperations.DTO.RequestResponse;
import com.curdoperations.CURDOperations.Entity.Users;
import com.curdoperations.CURDOperations.Service.UsersService;

@RestController
public class UserController {
    @Autowired
    private UsersService usersManagementService;

    @PostMapping("/auth/register")
    public ResponseEntity<RequestResponse> registerUser(@RequestBody RequestResponse reg) {
        return ResponseEntity.ok(usersManagementService.registerUser(reg));
    }

    @GetMapping("/admin/get-all-users")
    public ResponseEntity<RequestResponse> getAllUsers() {
        return ResponseEntity.ok(usersManagementService.getAllUsers());

    }

    @GetMapping("/admin/get-users/{userId}")
    public ResponseEntity<RequestResponse> getUSerByID(@PathVariable Integer userId) {
        return ResponseEntity.ok(usersManagementService.getUsersById(userId));

    }

    @PutMapping("/admin/update/{userId}")
    public ResponseEntity<RequestResponse> updateUser(@PathVariable Integer userId,
                                                      @RequestBody Users RequestResponse) {
        return ResponseEntity.ok(usersManagementService.updateUser(userId, RequestResponse));
    }

    @DeleteMapping("/admin/delete/{userId}")
    public ResponseEntity<RequestResponse> deleteUSer(@PathVariable Integer userId) {
        return ResponseEntity.ok(usersManagementService.deleteUser(userId));
    }

}