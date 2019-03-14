package com.elina.UserProj.controller;

import com.elina.UserProj.entity.UserEntity;
import com.elina.UserProj.exception.UserNotFoundException;
import com.elina.UserProj.repository.UserRepository;
import com.elina.UserProj.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class UpdateUserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public ResponseEntity<UserEntity> updateUser(@PathVariable("id") Long id, @RequestBody UserEntity userEntity){
        UserEntity user = userService.findUserById(id);
        if(user == null){
            throw new UserNotFoundException("Can not find the user to update");
        }
        UserEntity foundUser = user;
        foundUser.setAge(userEntity.getAge());
        foundUser.setSalary(userEntity.getSalary());
        foundUser.setName(userEntity.getName());
        userService.updateUser(foundUser);
        
        System.out.println("Updated user: " + foundUser.toString());
        return new ResponseEntity<UserEntity>(foundUser, HttpStatus.OK);
    }
}
