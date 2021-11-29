package com.account.restapi.shopping.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.account.restapi.shopping.model.Account;

@Repository
public interface ShoppingRep extends JpaRepository<Account, Long>{

}
