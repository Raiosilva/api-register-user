package com.oliveira.register.resource;

import com.oliveira.register.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User maria = new User("1", "Maria Oliveira", "maria@gmail.com");
        User ze = new User("2", "Zé Oliveira", "ze@gmail.com");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, ze));

        return ResponseEntity.ok().body(list);
    }
}
