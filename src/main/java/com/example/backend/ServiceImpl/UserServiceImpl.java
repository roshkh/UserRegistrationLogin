package com.example.backend.ServiceImpl;

import com.example.backend.Entity.User;
import com.example.backend.Exception.ResourceNotPersistedException;
import com.example.backend.Repository.UserRepository;
import com.example.backend.Request.UserRequest;
import com.example.backend.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    @Override
    public User createUser(UserRequest userRequest) {


       try{
           User user=new User();
           user.setUsername(userRequest.getUsername());
           user.setPassword(passwordEncoder.encode(userRequest.getPassword()));
           System.out.println(passwordEncoder.encode(userRequest.getPassword()));
           return userRepository.save(user);
       }catch (Exception e){
           System.out.println("Something went wrong");
           throw  new ResourceNotPersistedException(userRequest.getUsername()+" not persisted");
       }
    }
}
