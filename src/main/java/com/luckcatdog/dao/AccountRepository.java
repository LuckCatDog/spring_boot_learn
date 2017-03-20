package com.luckcatdog.dao;

import com.luckcatdog.model.Account;
import com.luckcatdog.model.PersonAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by LuckCatDog.
 * Date: 2017/3/20
 * Time: 22:28
 */
public interface AccountRepository extends JpaRepository<Account, Long> {


    @Query(value = "SELECT p.username as userName, a.loginName as loginName FROM Person as p " +
            "LEFT JOIN Account as a ON p.id = a.personId " +
            "WHERE p.id = ?1")
    PersonAccount getPersonAccount(Long id);

}
