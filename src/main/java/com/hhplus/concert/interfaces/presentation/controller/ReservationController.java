package com.hhplus.concert.interfaces.presentation.controller;

import com.hhplus.concert.interfaces.presentation.dto.request.ReservationRequestDto;
import com.hhplus.concert.interfaces.presentation.dto.response.ReservationResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ReservationController {

    @PostMapping("/reserve")
    public ResponseEntity<ReservationResponseDto> reserve(@RequestBody ReservationRequestDto dto){
        ReservationResponseDto responseDto = new ReservationResponseDto();
        responseDto.setResult("200");
        responseDto.setMessage("Success");
        ReservationResponseDto.Data data = new ReservationResponseDto.Data();
        data.setReservationId(1L);
        data.setReservationStatus("결제대기");
        responseDto.setData(data);

        return ResponseEntity.ok(responseDto);

    }
}
