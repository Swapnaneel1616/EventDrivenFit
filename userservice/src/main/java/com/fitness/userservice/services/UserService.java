package com.fitness.userservice.services;


import com.fitness.userservice.dto.RegisterRequest;
import com.fitness.userservice.dto.UpdateUserRequest;
import com.fitness.userservice.dto.UserResponse;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    UserResponse register(RegisterRequest request);

    UserResponse getUserProfile(String userId);

    Boolean existsByUserId(String userId);


    List<UserResponse> getAllUsers();

    UserResponse updateUser(String userId, @Valid UpdateUserRequest request);

    void deleteUser(String userId);
}
