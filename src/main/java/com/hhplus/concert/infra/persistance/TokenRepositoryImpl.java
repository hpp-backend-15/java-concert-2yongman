package com.hhplus.concert.infra.persistance;

import com.hhplus.concert.domain.repository.TokenRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TokenRepositoryImpl implements TokenRepository {

    private final TokenJpaRepository tokenJpaRepository;

    public TokenRepositoryImpl(TokenJpaRepository tokenJpaRepository) {
        this.tokenJpaRepository = tokenJpaRepository;
    }

    @Override
    public Long count() {
        return tokenJpaRepository.countWaitingToken();
    }
}
