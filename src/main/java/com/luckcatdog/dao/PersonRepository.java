package com.luckcatdog.dao;

import com.luckcatdog.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


/**
 * Created by LuckCatDog
 * Date: 2017/3/16
 * Time: 16:59
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByUsername(String username);

    @Query(value = "SELECT * FROM t_life_person p ORDER BY p.id DESC LIMIT 1", nativeQuery = true)
    Person findLastPerson();

}
