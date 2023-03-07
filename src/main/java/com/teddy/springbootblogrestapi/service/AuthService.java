package com.teddy.springbootblogrestapi.service;

import com.teddy.springbootblogrestapi.payload.LoginUserDto;
import com.teddy.springbootblogrestapi.payload.RegisterUserDto;

public interface AuthService {
    String loginUser(LoginUserDto loginUserDto);
    String registerUser(RegisterUserDto registerUserDto);
}
