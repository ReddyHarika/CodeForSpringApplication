package com.account.restapi.shopping.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.account.restapi.shopping.model.Item;

public interface ItemRepo extends JpaRepository<Item, Long>{

}
