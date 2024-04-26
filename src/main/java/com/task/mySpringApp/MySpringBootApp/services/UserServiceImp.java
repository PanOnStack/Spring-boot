package com.task.mySpringApp.MySpringBootApp.services;

import com.task.mySpringApp.MySpringBootApp.models.User;
import com.task.mySpringApp.MySpringBootApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;
    
    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
    @Override
    public User findOne(int id) {
        return userRepository.findById(id).orElse(null);
    }
    @Override
    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }
    @Override
    @Transactional
    public void update(int id, User updatedUser) {
        updatedUser.setId(id);
        userRepository.save(updatedUser);
    }
    @Override
    @Transactional
    public void delete(int id) {
        userRepository.deleteById(id);
    }

}
