package com.comp.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comp.app.entity.Account;

@Repository("accountDao")
public interface AccountDao extends JpaRepository<Account, Long>{


}
