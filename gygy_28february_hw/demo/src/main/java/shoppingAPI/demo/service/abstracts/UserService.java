package shoppingAPI.demo.service.abstracts;

import shoppingAPI.demo.entity.User;

import java.util.List;

public interface UserService {

    String registerUser(User user);

    List<User> getAll();

    String updateUser(User user);

    String deleteUser(String id);

}
