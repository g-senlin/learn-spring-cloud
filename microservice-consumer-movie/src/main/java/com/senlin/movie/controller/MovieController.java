package com.senlin.movie.controller;

import com.senlin.movie.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author gsl
 * @date 2019/1/3 22:30.
 */
@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://localhost:8080/users/{id}", User.class, id);
    }


}


