package com.ust.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers ()
    {
        return userService.getAllUsers();
    }

    @GetMapping ("/{id}")
    public Optional<User> getUserById(@PathVariable Long id)
    {
        return userService.getUserById(id);
    }
    @PostMapping
    public User saveUser(@RequestBody User user)
    {
        return userService.saveUser(user);
    }
    @PutMapping("/{id}")
    public User updateUser (@PathVariable Long id , @RequestBody User updatedUser)
    {
        return userService.updateUser(id, updatedUser);
    }
    @DeleteMapping("/{id}")
    public void deleteUser (@PathVariable Long id)
    {
         userService.deleteUser(id);
    }
}
