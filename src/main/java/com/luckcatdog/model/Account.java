package com.luckcatdog.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by LuckCatDog.
 * Date: 2017/3/20
 * Time: 22:21
 */
@Data
@Entity
@Table(name = "t_life_account")
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    private Long personId;
    private String loginName;
    private String password;
    private Date createTime;

}
