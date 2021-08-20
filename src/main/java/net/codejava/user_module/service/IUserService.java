package net.codejava.user_module.service;

import net.codejava.user_module.entity.User;

import java.util.List;

public interface IUserService {
    public List<User> litar();
    public void saveUser(User user);
}
