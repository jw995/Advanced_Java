package com.elina.UserProj.controller;

import com.elina.UserProj.entity.UserEntity;
import com.elina.UserProj.exception.FieldMissingException;
import com.elina.UserProj.repository.UserRepository;
import com.elina.UserProj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
public class NewUserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<Object> saveUser(@RequestBody UserEntity userEntity){
        if(userEntity.getAge() == null || userEntity.getSalary() == null || userEntity.getName() == null){
            throw new FieldMissingException("Not Enough Information Provided");
        }
        UserEntity savedUser = userService.saveUser(userEntity);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
        
        System.out.println("New user created: " + userEntity.toString());
        return ResponseEntity.created(location).build();
    }
}
