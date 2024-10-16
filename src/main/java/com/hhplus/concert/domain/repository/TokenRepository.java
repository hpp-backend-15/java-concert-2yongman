package com.hhplus.concert.domain.repository;

import com.hhplus.concert.domain.entity.WaitingToken;

public interface TokenRepository {

    Integer count();

    WaitingToken saveToken(WaitingToken waitingToken);
}
