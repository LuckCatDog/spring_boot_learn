package com.luckcatdog.controller;

import com.luckcatdog.dao.PersonRepository;
import com.luckcatdog.learn.RoundL;
import com.luckcatdog.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/generateRoundsValue")
    public Map generateRoundsValue(@RequestParam(required = false, defaultValue = "10") Integer num) {
        if (num <= 0) {
            num = 10;
        }
        Map<String, String> maps = new HashMap<>();
        for (int i = 0; i < num; i++) {
            double value = (int) (Math.random() * 10000) + Math.random();
            maps.put(String.valueOf(value), RoundL.getRoundLValue(value).toString());
        }
        return maps;
    }


}
