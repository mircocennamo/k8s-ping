package it.k8s.ping.service;

import it.k8s.ping.entity.User;

import java.util.Optional;

public interface UserService {
    Optional<User> getId(Long id);
}
