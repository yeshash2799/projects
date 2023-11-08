package com.yeshash.exceptionhandling.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yeshash.exceptionhandling.dto.UserDTO;
import com.yeshash.exceptionhandling.entity.User;
import com.yeshash.exceptionhandling.exception.UserNotFoundException;
import com.yeshash.exceptionhandling.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(UserDTO userDTO) {
        User user = userDTO.buildUser();
        return userRepository.save(user);
    }

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) throws UserNotFoundException {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found with id " + id));
    }
}
