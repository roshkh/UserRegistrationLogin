package com.example.backend.ServiceImpl;

import com.example.backend.Entity.User;
import com.example.backend.Repository.UserRepository;
import com.example.backend.Request.AuthRequest;
import com.example.backend.Service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {
private UserRepository userRepository;
    @Override
    public String doAuth(AuthRequest authRequest) {
       try{
           System.out.println(authRequest.getUsername()+"---------------auth");
           User user=userRepository.findByUsername(authRequest.getUsername());
           System.out.println(user.getUsername());
           if (user==null){
               return "UserNotFound";
           }
           if (user!=null && user.getPassword().equals(authRequest.getPassword())){
               return "Authenticated";
           }
           else {
               return "Password didnt match";
           }

       }catch (Exception e){
           return "User Not Found";
       }
    }
}
