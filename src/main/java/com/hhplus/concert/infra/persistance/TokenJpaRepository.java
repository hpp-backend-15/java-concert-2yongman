package com.hhplus.concert.infra.persistance;

import com.hhplus.concert.domain.entity.WaitingToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TokenJpaRepository extends JpaRepository<WaitingToken,Long> {

    @Query("SELECT COUNT(T) FROM WaitingToken T WHERE T.status = 'WAITING'")
    Integer countWaitingToken();
}
