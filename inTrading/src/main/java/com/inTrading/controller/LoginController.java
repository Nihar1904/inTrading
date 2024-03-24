package com.inTrading.controller;

import com.inTrading.service.UserService;
import com.inTrading.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {
        @Autowired
        private UserService userserv;

        @GetMapping("/users")
        public Users getAllUsers() {
            return new Users();
        }

        @PostMapping("/login")
        public ResponseEntity<Users> loginUser(@RequestBody Users user){
            return new ResponseEntity<Users>(userserv.loginUser(user), HttpStatus.OK);
        }
}
