package com.user.userTask.controller;

import com.user.userTask.model.User;
import com.user.userTask.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("")
public class UserController {

    @Autowired
    private UserService userService;

    // Get All Users
    @GetMapping("/user")
    public List<User> getUser() {
       // System.out.println("getting user!");
        return this.userService.getUser();
    }

    // Get User by ID
    @GetMapping("/user/{courseId}")
    public User getCourse(@PathVariable String courseId) {
        return this.userService.getUser(Long.parseLong(courseId));
    }

    // Create New User
    @PostMapping("/user/add")
    public User addNewUser(@RequestBody User user) {
        // System.out.println("work"+ user);
        return this.userService.addUser(user);
    }

    // Update User
    @PutMapping("user/update")
    public User upsateUser(@RequestBody User user) {
        return this.userService.updateUser(user);
    }

    // Delete User
    @DeleteMapping("user/delete/{userId}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userId) {
        try {
            this.userService.deleteUser(Long.parseLong(userId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
