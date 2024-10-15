package com.hhplus.concert.domain.entity;

public enum WaitingStatus {

    WAITING // 대기 중인 상태.
    ,IN_PROGRESS // 콘서트 예약이 가능한 상태.
    ,COMPLETE // 콘서트 예약이 완료된 상태
    ,EXPIRED // 콘서트 예약을 하지 않거나 토큰 발급 시간이 만료된 상태.
}
