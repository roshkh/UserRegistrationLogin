package com.example.backend.Controller;

import com.example.backend.Request.AuthRequest;
import com.example.backend.Service.AuthService;
import com.example.backend.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@AllArgsConstructor
public class AuthController {
    private AuthService authService;
    @GetMapping("/get")
    public ResponseEntity doLogin(@RequestBody AuthRequest authRequest){
       String response= authService.doAuth(authRequest);
       return ResponseEntity.ok().body(response);
    }

}
