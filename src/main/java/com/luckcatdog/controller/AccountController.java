package com.luckcatdog.controller;

import com.luckcatdog.dao.AccountRepository;
import com.luckcatdog.dao.PersonRepository;
import com.luckcatdog.model.Account;
import com.luckcatdog.model.Person;
import com.luckcatdog.model.PersonAccount;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by LuckCatDog.
 * Date: 2017/3/20
 * Time: 22:31
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountRepository repository;

    @Resource
    private PersonRepository personRepository;

    @GetMapping("/addAccount")
    public Account addAccount(Account account) {
        if (account.getPersonId() == null) {
            return null;
        }
        Person person = personRepository.findOne(account.getPersonId());
        if (person == null) {
            return null;
        }
        return repository.save(account);
    }

    @GetMapping("/getPersonAccount")
    public PersonAccount getPersonAccount(Long id) {
        Person person = personRepository.findOne(id);
        if (person == null) {
            return null;
        }
        PersonAccount personAccount = repository.getPersonAccount(id);
        personAccount.setId(id);
        return personAccount;
    }

}
