package com.inTrading.service;

import com.inTrading.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inTrading.repository.UserRepository;

import java.util.NoSuchElementException;

@Service
public class UserService {
    @Autowired
    private UserRepository userrepo;
    public Users loginUser(Users user){
        return this.userrepo.findByUsernameAndPassword(user.getUsername(), user.getPassword()).orElseThrow(()-> new NoSuchElementException());
    }
}
