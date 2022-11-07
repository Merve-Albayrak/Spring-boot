package com.springsecurity.springsecurityclient.service;

import com.springsecurity.springsecurityclient.entity.User;
import com.springsecurity.springsecurityclient.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);
}
