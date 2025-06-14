package com.curdoperations.CURDOperations.Service;

import java.util.HashMap;
import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.curdoperations.CURDOperations.DTO.RequestResponse;
import com.curdoperations.CURDOperations.Entity.Users;
import com.curdoperations.CURDOperations.Repository.UsersRepository;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public RequestResponse registerUser(RequestResponse registrationRequest) {
        RequestResponse response = new RequestResponse();

        try {
            Users users = new Users();
            users.setName(registrationRequest.getName());
            users.setEmail(registrationRequest.getEmail());

            Users userResult = usersRepository.save(users);

            if (userResult.getId() > 0) {
                response.setUsers(userResult);
                response.setStatusCode(200);
                response.setMessage("User registered successfully");
            }
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error occurred while registering user: " + e.getMessage());
            response.setError(e.getMessage());
        }
        return response;
    }

    public RequestResponse getAllUsers() {
        RequestResponse RequestResponse = new RequestResponse();

        try {
            List<Users> result = usersRepository.findAll();
            if (!result.isEmpty()) {
                RequestResponse.setUsersList(result);
                RequestResponse.setStatusCode(200);
                RequestResponse.setMessage("Successful");
            } else {
                RequestResponse.setStatusCode(404);
                RequestResponse.setMessage("No users found");
            }
            return RequestResponse;
        } catch (Exception e) {
            RequestResponse.setStatusCode(500);
            RequestResponse.setMessage("Error occurred: " + e.getMessage());
            return RequestResponse;
        }
    }

    public RequestResponse getUsersById(Integer id) {
        RequestResponse RequestResponse = new RequestResponse();
        try {
            Users usersById = usersRepository.findById(id).orElseThrow(() -> new RuntimeException("User Not found"));
            RequestResponse.setUsers(usersById);
            RequestResponse.setStatusCode(200);
            RequestResponse.setMessage("Users with id '" + id + "' found successfully");
        } catch (Exception e) {
            RequestResponse.setStatusCode(500);
            RequestResponse.setMessage("Error occurred: " + e.getMessage());
        }
        return RequestResponse;
    }

    public RequestResponse deleteUser(Integer userId) {
        RequestResponse RequestResponse = new RequestResponse();
        try {
            Optional<Users> userOptional = usersRepository.findById(userId);
            if (userOptional.isPresent()) {
                usersRepository.deleteById(userId);
                RequestResponse.setStatusCode(200);
                RequestResponse.setMessage("User deleted successfully");
            } else {
                RequestResponse.setStatusCode(404);
                RequestResponse.setMessage("User not found for deletion");
            }
        } catch (Exception e) {
            RequestResponse.setStatusCode(500);
            RequestResponse.setMessage("Error occurred while deleting user: " + e.getMessage());
        }
        return RequestResponse;
    }

    public RequestResponse updateUser(Integer userId, Users updatedUser) {
        RequestResponse RequestResponse = new RequestResponse();
        try {
            Optional<Users> userOptional = usersRepository.findById(userId);
            if (userOptional.isPresent()) {
                Users existingUser = userOptional.get();
                existingUser.setEmail(updatedUser.getEmail());
                existingUser.setName(updatedUser.getName());

                Users savedUser = usersRepository.save(existingUser);
                RequestResponse.setUsers(savedUser);
                RequestResponse.setStatusCode(200);
                RequestResponse.setMessage("User updated successfully");
            } else {
                RequestResponse.setStatusCode(404);
                RequestResponse.setMessage("User not found for update");
            }
        } catch (Exception e) {
            RequestResponse.setStatusCode(500);
            RequestResponse.setMessage("Error occurred while updating user: " + e.getMessage());
        }
        return RequestResponse;
    }

    public RequestResponse getMyInfo(String email) {
        RequestResponse RequestResponse = new RequestResponse();
        try {
            Optional<Users> userOptional = usersRepository.findByEmail(email);
            if (userOptional.isPresent()) {
                RequestResponse.setUsers(userOptional.get());
                RequestResponse.setStatusCode(200);
                RequestResponse.setMessage("successful");
            } else {
                RequestResponse.setStatusCode(404);
                RequestResponse.setMessage("User not found for update");
            }

        } catch (Exception e) {
            RequestResponse.setStatusCode(500);
            RequestResponse.setMessage("Error occurred while getting user info: " + e.getMessage());
        }
        return RequestResponse;

    }
}
