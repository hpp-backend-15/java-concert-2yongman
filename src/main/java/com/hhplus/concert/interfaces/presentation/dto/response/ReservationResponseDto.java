package com.hhplus.concert.interfaces.presentation.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ReservationResponseDto {
    private String result;
    private String message;
    private Data data;

    @Getter @Setter
    public static class Data{
        private Long reservationId;
        private String reservationStatus;

    }
}
