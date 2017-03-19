package com.luckcatdog.controller;

import com.luckcatdog.dao.PersonMRepository;
import com.luckcatdog.model.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by LuckCatDog.
 * Date: 2017/3/19
 * Time: 20:05
 */
@RestController
@RequestMapping("/personm")
public class PersonMController {

    @Resource
    private PersonMRepository mRepository;

    @GetMapping("/findUserById")
    public Person findUserById(Long id) {
        return mRepository.findOne(id);
    }

    @GetMapping("/findAllUser")
    public FindAllUserResp findAllUser(@RequestParam(value = "min", defaultValue = "0") Integer min,
                                       @RequestParam(value = "max", defaultValue = "100") Integer max) {
        FindAllUserResp resp = new FindAllUserResp();
        Sort sort = new Sort(Sort.Direction.DESC, "age");
        Pageable pageable = new PageRequest(0, 10, sort);
//        Page<Person> persons = mRepository.findAll(pageable);
        Page<Person> persons = mRepository.findByAgeBetween(min, max, pageable);
        FindAllUser allUser = new FindAllUser();
        allUser.setTotalCount(persons.getTotalElements());
        allUser.setList(persons.getContent());

        resp.setErrorCode("0");
        resp.setErrorMsg("success");
        resp.setData(allUser);

        return resp;
    }

    @GetMapping("/addUser")
    @Transactional(rollbackFor = Exception.class)
    public PersonResp addUser(Person person) {
        PersonResp resp = new PersonResp();
        if (StringUtils.isEmpty(person) || StringUtils.isEmpty(person.getId())) {
            resp.setErrorCode("1");
            resp.setErrorMsg("param error");
            return resp;
        }

        try {
            Person p = new Person();
            p.setId(5L);
            p.setAge(person.getAge() + 1);
            p.setUsername("搞死了开发年代末开始");
            mRepository.save(p);

            mRepository.insert(person);
        } catch (Exception e) {
            resp.setErrorCode("2");
            resp.setErrorMsg(e.getMessage());
            return resp;
        }

        resp.setErrorCode("0");
        resp.setErrorMsg("success");
        resp.setData(person);

        return resp;
    }
}
