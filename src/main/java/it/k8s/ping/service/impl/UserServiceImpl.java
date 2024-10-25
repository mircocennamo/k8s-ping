package it.k8s.ping.service.impl;

import it.k8s.ping.entity.User;
import it.k8s.ping.repository.UserRepository;
import it.k8s.ping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Optional<User> getId(Long id) {
        return userRepository.findById(id);
    }
}
