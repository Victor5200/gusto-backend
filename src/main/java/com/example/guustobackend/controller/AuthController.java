package com.example.guustobackend.controller;

import com.example.guustobackend.domain.dto.TokenDTO;
import com.example.guustobackend.domain.model.AuthRequest;
import com.example.guustobackend.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;


    @PostMapping("/auth")
    public TokenDTO generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                            authRequest.getUserName(),
                            authRequest.getPassword()));
        } catch (Exception ex) {
            throw new Exception("invalid username/password");
        }

        return TokenDTO.builder().token(jwtUtil.generateToken(authRequest.getUserName())).build();
    }

}
