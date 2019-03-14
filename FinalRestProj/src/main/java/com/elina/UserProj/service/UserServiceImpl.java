package com.elina.UserProj.service;

import com.elina.UserProj.entity.UserEntity;
import com.elina.UserProj.exception.UserNotFoundException;
import com.elina.UserProj.repository.UserRepository;
import com.elina.UserProj.vo.PagedResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepo;


    @Override
    public UserEntity findUserById(Long id){
    	if (id == null) {
    		return null;
    	}
        return userRepo.getOne(id);
    }

    @Override
    public UserEntity saveUser(UserEntity user) {
        userRepo.save(user);
        return user;
    }

    @Override
    public UserEntity updateUser(UserEntity user) {
        UserEntity userEntity = userRepo.saveAndFlush(
        		new UserEntity(user.getId(), user.getName(), 
        					   user.getAge(), user.getSalary()));
        return userEntity;
    }

    @Override
    public void deleteUserById(long id) throws UserNotFoundException{
        userRepo.deleteById(id);
    }

    @Override
    public List<UserEntity> findAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public PagedResponse<UserEntity> findPaginated(int page, int size, String orderBy) {

        Sort sort = null;
        if (orderBy != null) {
            sort = new Sort(Sort.Direction.ASC, orderBy);
        }
        Page<UserEntity> page1 = userRepo.findAll(PageRequest.of(page, size, sort));
        List<UserEntity> list = page1.getContent();
        PagedResponse<UserEntity> result = new PagedResponse<>();
        result.setPage(page1.getNumber());
        result.setRows(page1.getSize());
        result.setTotalPage(page1.getTotalPages());
        result.setTotalElement(page1.getTotalElements());
        result.setOrder(page1.getSort().toString());
        result.setBody(list);
        return result;
    }
}
