package com.hhplus.concert.interfaces.presentation.controller;


import com.hhplus.concert.common.exception.CustomException;
import com.hhplus.concert.interfaces.presentation.dto.request.PaymentRequestDto;
import com.hhplus.concert.interfaces.presentation.dto.response.PayResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PaymentController {

    @PostMapping("/pay")
    public ResponseEntity<PayResponseDto> pay(@RequestBody PaymentRequestDto requestDto){
        if (requestDto.getToken() == null || requestDto.getToken().isEmpty()){
            throw new CustomException("401", "Expired token");
        }
        PayResponseDto responseDto = new PayResponseDto();
        responseDto.setResult("200");
        responseDto.setMessage("Success");
        PayResponseDto.Data data = new PayResponseDto.Data();
        data.setPaymentId(1L);
        data.setPaymentDate("2024-10-10");
        responseDto.setData(data);
        return ResponseEntity.ok(responseDto);
    }
}
