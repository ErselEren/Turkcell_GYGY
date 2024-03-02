package shoppingAPI.demo.repository.abstracts;

import shoppingAPI.demo.entity.User;
import java.util.List;

public interface UserRepository {

    String save(User user);

    List<User> findAll();

    String update(User user);

    String delete(String id);
}
