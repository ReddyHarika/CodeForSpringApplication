package com.account.restapi.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.restapi.shopping.model.Account;
import com.account.restapi.shopping.model.Item;
import com.account.restapi.shopping.repos.ItemRepo;
import com.account.restapi.shopping.repos.ShoppingRep;

@CrossOrigin("*")
@RestController
@RequestMapping("shoppingapi")
public class ShoppingController {

	@Autowired
	private ShoppingRep repo;
	
	@Autowired ItemRepo itemrepo;
	@GetMapping("/accounts")
	public List<Account> getAccounts() {
		return repo.findAll();

	}
	@PostMapping("/accounts")
	public Account addAccount(@RequestBody Account acc) {

		Account returnValue  = repo.save(acc);
		return returnValue;
	}
	@GetMapping("/accounts/{id}")
	public Account getAccountById(@PathVariable Long id) {
		return repo.findById(id).get();
	}
	@PutMapping("/accounts")
	public Account updateAccountDetails(@RequestBody Account account) {
		return repo.save(account);
	}
	@DeleteMapping("/accounts/{id}")
	public ResponseEntity<HttpStatus> deleteAccount(@PathVariable Long id) {
		
			repo.deleteById(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
	}
	

	
	@GetMapping("/items")
	public List<Item> getItems() {
		return itemrepo.findAll();

	}
	@PostMapping("/items")
	public Item addItem(@RequestBody Item acc) {

		Item returnValue  = itemrepo.save(acc);
		return returnValue;
	}
	@GetMapping("/items/{id}")
	public Item getItemById(@PathVariable Long id) {
		return itemrepo.findById(id).get();
	}
	@PutMapping("/items")
	public Item updateItemDetails(@RequestBody Item item) {
		return itemrepo.save(item);
	}
	@DeleteMapping("/items/{id}")
	public ResponseEntity<HttpStatus> deleteItem(@PathVariable Long id) {
		
		itemrepo.deleteById(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
	}
	

}
