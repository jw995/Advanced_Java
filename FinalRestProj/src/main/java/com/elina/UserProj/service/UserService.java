package com.elina.UserProj.service;

import com.elina.UserProj.entity.UserEntity;
import com.elina.UserProj.vo.PagedResponse;

import java.util.List;


public interface UserService {

    UserEntity findUserById(Long id);

    UserEntity saveUser(UserEntity user);

    UserEntity updateUser(UserEntity user);

    void deleteUserById(long id);

    List<UserEntity> findAllUsers();

    PagedResponse<UserEntity> findPaginated(int page, int size, String orderBy);
}
