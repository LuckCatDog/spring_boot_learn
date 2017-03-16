package com.luckcatdog.dao;

import com.luckcatdog.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by LuckCatDog
 * Date: 2017/3/16
 * Time: 16:59
 */
@Repository
public interface PersonDao extends JpaRepository<Person, Long> {

    Person findUserByName(String username);

}
