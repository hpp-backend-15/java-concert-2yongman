package com.hhplus.concert.interfaces.presentation.controller;

import com.hhplus.concert.common.exception.CustomException;
import com.hhplus.concert.interfaces.presentation.dto.response.AmountResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AmountController {

    @GetMapping("/{userId}/amount")
    public ResponseEntity<AmountResponseDto> getAmount(@PathVariable Long userId){
        if (userId == null ) throw new CustomException("400", "Invalid userId");
        AmountResponseDto amountResponseDto = new AmountResponseDto();
        amountResponseDto.setAmount(10000);
        return ResponseEntity.ok(amountResponseDto);
    }

    @PatchMapping("/{userId}/amount/charge")
    public ResponseEntity<AmountResponseDto> chargeAmount(@PathVariable Long userId){
        if (userId == null ) throw new CustomException("400", "Invalid userId");
        AmountResponseDto amountResponseDto = new AmountResponseDto();
        amountResponseDto.setAmount(10000);
        return ResponseEntity.ok(amountResponseDto);
    }
}
