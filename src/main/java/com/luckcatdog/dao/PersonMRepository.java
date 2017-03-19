package com.luckcatdog.dao;

import com.luckcatdog.model.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by LuckCatDog.
 * Date: 2017/3/19
 * Time: 19:52
 * mongodb 实现
 */
public interface PersonMRepository extends MongoRepository<Person, Long> {

    /**
     * min < select age < max
     * @return person list
     */
    Page<Person> findByAgeBetween(int min, int max, Pageable pageable);

}
