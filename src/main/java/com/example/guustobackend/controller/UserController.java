package com.example.guustobackend.controller;

import com.example.guustobackend.domain.model.User;
import com.example.guustobackend.service.GenericService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/user")
public class UserController extends GenericRestController<User, Long> {

    public UserController(GenericService<User, Long> service) {
        super(service);
    }

}
