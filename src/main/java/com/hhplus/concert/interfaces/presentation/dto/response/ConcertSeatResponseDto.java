package com.hhplus.concert.interfaces.presentation.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConcertSeatResponseDto {
    private Long id;
    private String seatNumber;
    private String seatStatus;
    private int seatPrice;

    public ConcertSeatResponseDto(Long id, String seatNumber, String seatStatus, int seatPrice) {
        this.id = id;
        this.seatNumber = seatNumber;
        this.seatStatus = seatStatus;
        this.seatPrice = seatPrice;
    }
}
