package com.tala.poc.demo.controller;

import com.tala.poc.demo.exception.ResourceNotFoundException;
import com.tala.poc.demo.model.User;
import com.tala.poc.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    //get(retrieve) all the records of users
    @GetMapping("load")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //get(retrieve) record of one user by its user_id
    @GetMapping("load/{user_id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "user_id") Integer user_id)
            throws ResourceNotFoundException {
        User user = userRepository.findById(user_id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + user_id));
        return ResponseEntity.ok().body(user);
    }

    //add user in table
    @PostMapping("load")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    //update record of user
    @PutMapping("load/{user_id}")
    public ResponseEntity<User> updateUser(@PathVariable(value = "user_id") Integer user_id,
                                              @RequestBody User userDetails) throws ResourceNotFoundException {
        User user = userRepository.findById(user_id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + user_id));

        user.setAge(userDetails.getAge());
        user.setName(userDetails.getName());
        user.setSalary(userDetails.getSalary());
        user.setLoan_amount(userDetails.getLoan_amount());

        final User updatedUser = userRepository.save(user);
        return ResponseEntity.ok(updatedUser);
    }

    //delete record of specific user
    @DeleteMapping("load/{user_id}")
    public Map<String, Boolean> deleteUser(@PathVariable(value = "user_id") Integer user_id)
            throws ResourceNotFoundException {
        User user = userRepository.findById(user_id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + user_id));

        userRepository.delete(user);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}
