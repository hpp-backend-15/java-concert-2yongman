package com.hhplus.concert.infra.persistance;

import com.hhplus.concert.domain.entity.WaitingToken;
import com.hhplus.concert.domain.repository.TokenRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TokenRepositoryImpl implements TokenRepository {

    private final TokenJpaRepository tokenJpaRepository;

    public TokenRepositoryImpl(TokenJpaRepository tokenJpaRepository) {
        this.tokenJpaRepository = tokenJpaRepository;
    }

    @Override
    public Integer count() {
        return tokenJpaRepository.countWaitingToken();
    }

    @Override
    public WaitingToken saveToken(WaitingToken waitingToken) {
        return tokenJpaRepository.save(waitingToken);
    }
}
