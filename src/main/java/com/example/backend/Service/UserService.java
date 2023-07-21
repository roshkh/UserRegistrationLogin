package com.example.backend.Service;

import com.example.backend.Entity.User;
import com.example.backend.Request.UserRequest;

public interface UserService {
    public User createUser(UserRequest userRequest);
}
