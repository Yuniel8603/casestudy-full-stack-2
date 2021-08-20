package net.codejava.user_module.service;

import net.codejava.user_module.entity.User;
import net.codejava.user_module.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> litar() {
        return (List<User>) userRepository.findAll();

    }
    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
