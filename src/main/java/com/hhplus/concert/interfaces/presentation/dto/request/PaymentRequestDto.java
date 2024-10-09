package com.hhplus.concert.interfaces.presentation.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentRequestDto {
    private Long reservationId;
    private int amount;
    private String token;
}
