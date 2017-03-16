package com.luckcatdog.controller;

import com.luckcatdog.dao.PersonRepository;
import com.luckcatdog.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LuckCatDog
 * Date: 2017/3/16
 * Time: 17:03
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Resource
    private PersonRepository repository;

    @GetMapping("/findUserByName")
    public List<Person> findUserByName(String username) {
        return repository.findByUsername(username);
    }

    @GetMapping("/findLastUser")
    public Person findLastUser() {
        return repository.findLastPerson();
    }

}
