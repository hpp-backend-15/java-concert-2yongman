package com.hhplus.concert.interfaces.presentation.controller;

import com.hhplus.concert.common.exception.CustomException;
import com.hhplus.concert.domain.service.TokenService;
import com.hhplus.concert.interfaces.presentation.dto.request.TokenRequestDto;
import com.hhplus.concert.interfaces.presentation.dto.response.TokenResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TokenController {

    private final TokenService tokenService;

    public TokenController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("/token")
    public ResponseEntity<TokenResponseDto> createToken(@RequestBody TokenRequestDto dto){
        try {
            return ResponseEntity.ok(tokenService.createToken(dto.getUserId()));
        } catch (Exception e){
            throw new CustomException("500","Internal server error");
        }
    }



}
