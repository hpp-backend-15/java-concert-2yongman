package com.hhplus.concert.domain.repository;

import com.hhplus.concert.domain.entity.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findUser(Long userId);
}
