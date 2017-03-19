package com.luckcatdog.controller;

import com.luckcatdog.model.Person;

import java.util.List;

/**
 * Created by LuckCatDog.
 * Date: 2017/3/19
 * Time: 20:26
 */
public class FindAllUser {

    private long totalCount;
    private List<Person> list;

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public List<Person> getList() {
        return list;
    }

    public void setList(List<Person> list) {
        this.list = list;
    }
}
