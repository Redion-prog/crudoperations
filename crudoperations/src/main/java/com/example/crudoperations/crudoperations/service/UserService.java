package com.example.crudoperations.crudoperations.service;

import com.example.crudoperations.crudoperations.model.User;
import com.example.crudoperations.crudoperations.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


private final UserRepository userRepository;

//injektimi konstruktori

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;

    }

    public List<User>getAllUsers(){
        return userRepository.findAll();

    }
    public User createUser(User user ){
        return userRepository.save(user);
    }
    //get user by ID
    public User getUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }
    public User updateUser(Long id, User updateUser){
        return userRepository.update(id, updateUser);
    }
    public User deleteUser(Long id) {
        userRepository.deleteById(id);
        return null;
    }
}