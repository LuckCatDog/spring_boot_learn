package com.luckcatdog.model;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by LuckCatDog
 * Date: 2017/3/16
 * Time: 17:01
 */
@Entity
@Table(name = "t_life_person")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
