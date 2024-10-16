package com.hhplus.concert.infra.persistance;

import com.hhplus.concert.domain.entity.User;
import com.hhplus.concert.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository userJpaRepository;

    public UserRepositoryImpl(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    @Override
    public Optional<User> findUser(Long userId) {
        return userJpaRepository.findByUserId(userId);
    }
}
