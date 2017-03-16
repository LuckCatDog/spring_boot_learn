package com.luckcatdog.controller;

import com.luckcatdog.dao.PersonDao;
import com.luckcatdog.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by LuckCatDog
 * Date: 2017/3/16
 * Time: 17:03
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Resource
    private PersonDao dao;

    @GetMapping("/findUserByName")
    public Person findUserByName(String username) {
        return dao.findUserByName(username);
    }

}
