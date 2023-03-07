package com.teddy.springbootblogrestapi.controller;

import com.teddy.springbootblogrestapi.payload.JWTAuthResponse;
import com.teddy.springbootblogrestapi.payload.LoginUserDto;
import com.teddy.springbootblogrestapi.payload.RegisterUserDto;
import com.teddy.springbootblogrestapi.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    // Build Login REST API
    @PostMapping(value = {"/login", "/signin"})
    public ResponseEntity<JWTAuthResponse> login(@RequestBody LoginUserDto loginUserDto) {
        String token = authService.loginUser(loginUserDto);
        JWTAuthResponse jwtAuthResponse = new JWTAuthResponse();
        jwtAuthResponse.setAccessToken(token);
        return ResponseEntity.ok(jwtAuthResponse);
    }
    // Build Register REST API
    @PostMapping(value = {"/register", "/signup"})
    public ResponseEntity<String> registerUser(@RequestBody RegisterUserDto registerUserDto) {
        String response = authService.registerUser(registerUserDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
