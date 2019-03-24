package com.elina.UserProj.controller;

import com.elina.UserProj.entity.UserEntity;
import com.elina.UserProj.exception.UserNotFoundException;
import com.elina.UserProj.repository.UserRepository;
import com.elina.UserProj.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteUserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<UserEntity> deleteUserById(@PathVariable("id") Long id){
        UserEntity user = userService.findUserById(id);
        if(user == null){
            throw new UserNotFoundException("Not User Found To Delete");
        }
        userService.deleteUserById(id);
        
        System.out.println("User deleted: " + user.toString());
        return new ResponseEntity<UserEntity>(user, HttpStatus.OK);
    }
}



