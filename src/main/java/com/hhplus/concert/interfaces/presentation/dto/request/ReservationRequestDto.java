package com.hhplus.concert.interfaces.presentation.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationRequestDto {
    private String token;
    private Long concertDateId;
    private Long concertSeatId;
    private Long userId;
}
