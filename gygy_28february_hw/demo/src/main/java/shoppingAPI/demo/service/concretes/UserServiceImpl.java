package shoppingAPI.demo.service.concretes;

import org.springframework.stereotype.Service;
import shoppingAPI.demo.entity.User;
import shoppingAPI.demo.repository.abstracts.UserRepository;
import shoppingAPI.demo.service.abstracts.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public String updateUser(User user) {
        return userRepository.update(user);
    }

    @Override
    public String deleteUser(String id) {
        return userRepository.delete(id);
    }
}
