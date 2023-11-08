package com.yeshash.exceptionhandling.service;

import java.util.List;
import com.yeshash.exceptionhandling.dto.UserDTO;
import com.yeshash.exceptionhandling.entity.User;
import com.yeshash.exceptionhandling.exception.UserNotFoundException;

public interface UserService {
    public User saveUser(UserDTO userDTO);

    public List<User> getUserList();

    public User getUserById(int id) throws UserNotFoundException;
}
