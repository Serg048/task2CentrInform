package com.github.steed777.taskcentrinform.service.impl;

import com.github.steed777.taskcentrinform.model.User;
import com.github.steed777.taskcentrinform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User byUsername = null;
        try {
             byUsername = userRepository.findByUsername(username);
            return byUsername;
        }catch (UsernameNotFoundException e){

        }
        return byUsername;
    }
}
