package com.elina.UserProj.controller;

import com.elina.UserProj.entity.UserEntity;
import com.elina.UserProj.exception.UserNotFoundException;
import com.elina.UserProj.repository.UserRepository;
import com.elina.UserProj.service.UserServiceImpl;
import com.elina.UserProj.vo.PagedResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class GetUserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<PagedResponse<UserEntity>> getAllUsersPagination(@RequestParam(required = false, defaultValue = "0") Integer pageNo,     // paging param
                                                                          @RequestParam(required = false, defaultValue = "5") Integer rows,        // limit param
                                                                          @RequestParam(required = false, defaultValue = "name") String orderBy){  // sorting param
        PagedResponse<UserEntity> users = userService.findPaginated(pageNo, rows, orderBy);
        if(users.isEmpty()){
            throw new UserNotFoundException("User not Found");
        }
        
        System.out.println("The number of existing users is: " + users.getBody().size());
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserEntity> getUserById(@PathVariable("id") Long id){
        UserEntity user = userService.findUserById(id);
        if(user == null){
            throw new UserNotFoundException("User not Found");
        }
        
        System.out.println("Found user: " + user.toString());
        return new ResponseEntity<UserEntity>(user, HttpStatus.OK);
    }
}
