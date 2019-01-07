package com.senlin.user.controller;

import com.senlin.user.bean.User;
import com.senlin.user.dao.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author gsl
 * @date 2019/1/3 22:30.
 */
@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        log.info("param id= {}", id);
        return this.userRepository.findById(id);
    }
}


