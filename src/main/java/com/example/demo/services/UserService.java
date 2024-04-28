package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.exception.ResourceNotFoundException;

@Service
public class UserService {
	
	private final UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> findAll() {
		return null;
	}
	
	public Optional<User> findById(Long userId) throws Exception {
        try {
            return userRepository.findById(userId);
        } catch (ResourceNotFoundException e) {
            throw new Exception("User with ID " + userId + " not found");
        }
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public void delete(Long userId) throws Exception {
        try {
            userRepository.deleteById(userId);
        } catch (ResourceNotFoundException e) {
            
            throw new Exception("User with ID " + userId + " not found");
        }
    }

    public User update(User user) throws Exception {
        try {
            return userRepository.save(user);
        } catch (ResourceNotFoundException e) {
            
            throw new Exception("User with ID " + user.getId() + " not found");
        }
    }
}
