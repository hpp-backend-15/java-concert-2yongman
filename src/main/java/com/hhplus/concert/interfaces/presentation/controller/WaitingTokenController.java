package com.hhplus.concert.interfaces.presentation.controller;

import com.hhplus.concert.common.exception.CustomException;
import com.hhplus.concert.interfaces.presentation.dto.request.TokenRequestDto;
import com.hhplus.concert.interfaces.presentation.dto.response.TokenResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WaitingTokenController {

    @PostMapping("/token")
    public ResponseEntity<TokenResponseDto> createToken(@RequestBody TokenRequestDto dto){
        try {
            return ResponseEntity.ok(new TokenResponseDto("12a3a45a",30L,"2024-10-09T12:00:00"));
        } catch (IllegalArgumentException e){
            throw new CustomException("400", "invalid userId");
        } catch (Exception e){
            throw new CustomException("500","Internal server error");
        }
    }



}
