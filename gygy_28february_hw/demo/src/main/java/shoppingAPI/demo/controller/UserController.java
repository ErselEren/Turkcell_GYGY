package shoppingAPI.demo.controller;

import org.springframework.web.bind.annotation.*;
import shoppingAPI.demo.entity.User;
import shoppingAPI.demo.service.abstracts.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserController() {
    }

    @PostMapping
    public String register(@RequestBody User user)
    {
        return userService.registerUser(user);
    }

    @GetMapping
    public List<User> getUsers()
    {
        return userService.getAll();
    }

    @PutMapping
    public String updateUSer(@RequestBody User user)
    {
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id)
    {
        return userService.deleteUser(id);
    }




}
