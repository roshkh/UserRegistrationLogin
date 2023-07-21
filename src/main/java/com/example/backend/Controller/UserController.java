package com.example.backend.Controller;

import com.example.backend.Entity.User;
import com.example.backend.Request.UserRequest;
import com.example.backend.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController @AllArgsConstructor
public class UserController {
    private UserService userService;
    @PostMapping("user/save")
    public ResponseEntity addUser(@RequestBody UserRequest userRequest){
        userService.createUser(userRequest);
        return ResponseEntity.ok().body("Created");
    }

}
