package com.example.getmesocial.resource;

import com.example.getmesocial.model.User;
import com.example.getmesocial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

       /* @GetMapping("/user")


    public User getUser() {
        return userService.getUser();

    }

    @GetMapping("/allUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/(userId)")
    public User getuserById(@PathVariable("userId") int userId) {
        return userService.getUserById(userId);
    }

    @PutMapping("/user/(userId)")
    public User updateUser(@PathVariable("userId") int userId, @RequestBody User user) {
        return userService.updateUser(userId, user);
    }
    @DeleteMapping("/user")
    public User deleteUser(@RequestParam(name = "userId")int userId){
        return userService.deleteUser(userId);
    }

        */
}

