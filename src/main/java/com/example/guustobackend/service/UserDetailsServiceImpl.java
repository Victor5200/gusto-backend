package com.example.guustobackend.service;

import com.example.guustobackend.domain.model.MyUserPrincipal;
import com.example.guustobackend.domain.model.User;
import com.example.guustobackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        try {
            User user = userRepository.findByNameEquals(login);
            return new MyUserPrincipal(user);
        } catch (NoSuchElementException e) {
            throw new UsernameNotFoundException("User " + login + " not found.", e);
        }
    }
}
