package com.mock_itsol.mockitsol.controller;

import com.mock_itsol.mockitsol.config.JwtConfig;
import com.mock_itsol.mockitsol.dto.JwtResponse;
import com.mock_itsol.mockitsol.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/auth")
@CrossOrigin("http://localhost:4200")
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtConfig jwtConfig;

    @PostMapping("/token")
    public ResponseEntity<?> getToken(@RequestBody UserDTO dto){
        Date expiryDate;
        String jwtToken;
        Authentication authentication =authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(dto.getUserName(), dto.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        jwtToken = jwtConfig.generateToken(authentication);
        expiryDate = jwtConfig.getExpiryDate(jwtToken);

        return new ResponseEntity<>(new JwtResponse(jwtToken, userDetails.getUsername(), expiryDate), HttpStatus.OK);
    }

}
