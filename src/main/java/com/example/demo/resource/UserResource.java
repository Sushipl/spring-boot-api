package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> result = repository.findAll();
		return ResponseEntity.ok(result);
		}
	
	 @GetMapping(value = "/{id}")
	    public ResponseEntity<User> findById(@PathVariable Long id) {
	        User user = repository.findById(id).get();
	        return ResponseEntity.ok(user);
	 }
	 @PostMapping
	    public ResponseEntity<User> insert(@RequestBody User user) {
	        user = repository.save(user);
	        return ResponseEntity.ok(user);
	    }
	 @DeleteMapping(value = "/{id}")
	    public ResponseEntity<Void> delete(@PathVariable Long id) {
	        repository.deleteById(id);
	        return ResponseEntity.noContent().build();
	   }
	 @PutMapping(value = "/{id}")
	    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user) {
	        user.setId(id);
	        user = repository.save(user);
	        return ResponseEntity.ok(user);
	    }

}
