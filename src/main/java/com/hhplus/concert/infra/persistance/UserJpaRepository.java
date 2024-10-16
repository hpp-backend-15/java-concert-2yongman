package com.hhplus.concert.infra.persistance;

import com.hhplus.concert.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserJpaRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserId(Long userId);

}
