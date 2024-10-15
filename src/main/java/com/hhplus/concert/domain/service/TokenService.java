package com.hhplus.concert.domain.service;

import com.hhplus.concert.domain.repository.TokenRepository;
import com.hhplus.concert.interfaces.presentation.dto.response.TokenResponseDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class TokenService {

    private TokenRepository tokenRepository;

    public TokenService(TokenRepository tokenRepository) {
        this.tokenRepository = tokenRepository;
    }

//    public TokenResponseDto createToken(Long userId){
//        // 번호표 뽑을 때 신분증 필요없듯 userId 검증은 필요 없을 듯 하다.
//        String token = UUID.randomUUID().toString(); // 토큰 생성
//
//        Long waitingNumber = generateWaitingNumber();
//
//        LocalDateTime issueTime = LocalDateTime.now();
//        LocalDateTime endTime = issueTime.plusMinutes(30); // 30분 후 만료
//
//
//
//    }

    private Long generateWaitingNumber(){
        //현재 대기열에서 마지막 번호 이후의 번호 생성
        return tokenRepository.count() + 1;
    }
}
