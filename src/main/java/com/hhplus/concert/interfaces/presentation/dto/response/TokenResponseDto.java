package com.hhplus.concert.interfaces.presentation.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenResponseDto {

    private String token;
    private Long waitingNumber;
    private String endTime;

    public TokenResponseDto(String token, Long waitingNumber, String endTime) {
        this.token = token;
        this.waitingNumber = waitingNumber;
        this.endTime = endTime;
    }
}
