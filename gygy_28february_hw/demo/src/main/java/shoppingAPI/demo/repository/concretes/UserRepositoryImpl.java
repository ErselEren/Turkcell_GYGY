package shoppingAPI.demo.repository.concretes;

import org.springframework.stereotype.Repository;
import shoppingAPI.demo.entity.User;
import shoppingAPI.demo.repository.abstracts.UserRepository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private List<User> users;

    public UserRepositoryImpl() {
        users = new ArrayList<>();
    }

    @Override
    public String save(User user) {
        users.add(user);
        return "User saved";
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public String update(User user) {
        for (User u : users) {
            if (u.getId().equals(user.getId())) {
                u.setName(user.getName());
                u.setEmail(user.getEmail());
                u.setPassword(user.getPassword());
                return "User updated";
            }
        }
        return "User not found";
    }

    @Override
    public String delete(String id) {
        for (User u : users) {
            if (u.getId().equals(id)) {
                users.remove(u);
                return "User deleted";
            }
        }
        return "User not found";
    }
}
