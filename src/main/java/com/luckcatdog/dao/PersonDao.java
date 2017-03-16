package com.luckcatdog.dao;

import com.luckcatdog.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by LuckCatDog
 * Date: 2017/3/16
 * Time: 16:59
 */
public interface PersonDao extends JpaRepository<Person, Long> {

    Person findUserByName(String username);

}
