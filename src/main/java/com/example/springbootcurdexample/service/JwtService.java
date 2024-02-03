package com.example.springbootcurdexample.service;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class JwtService {

    public String generateToken(String userName){
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, userName);
    }

    private String createToken(Map<String, Object> claims, String userName){
        return null;
    }
}
