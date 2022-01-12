package com.example.guustobackend.service.impl;

import com.example.guustobackend.domain.model.User;
import com.example.guustobackend.service.GenericService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements GenericService<User, Long> {

}
