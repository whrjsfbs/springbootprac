package com.ckr.prac.service;

import com.ckr.prac.Repository.UserRepository;
import com.ckr.prac.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Transactional
    public void getUsers() {
        List<UserEntity> users = userRepository.findAll();
        users.stream().forEach(i -> System.out.println(i.getEmail()));
    }
}
