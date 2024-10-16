package com.hhplus.concert.interfaces.presentation.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TokenResponseDto {

    private String token;
    private Integer waitingNumber;
    private LocalDateTime endTime;

    public TokenResponseDto(String token, Integer waitingNumber, LocalDateTime endTime) {
        this.token = token;
        this.waitingNumber = waitingNumber;
        this.endTime = endTime;
    }
}
