package com.hhplus.concert.domain.service;

import com.hhplus.concert.common.exception.CustomException;
import com.hhplus.concert.domain.entity.User;
import com.hhplus.concert.domain.entity.WaitingStatus;
import com.hhplus.concert.domain.entity.WaitingToken;
import com.hhplus.concert.domain.repository.TokenRepository;
import com.hhplus.concert.domain.repository.UserRepository;
import com.hhplus.concert.interfaces.presentation.dto.response.TokenResponseDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class TokenService {

    private final TokenRepository tokenRepository;
    private final UserRepository userRepository;

    public TokenService(TokenRepository tokenRepository, UserRepository userRepository) {
        this.tokenRepository = tokenRepository;
        this.userRepository = userRepository;
    }

    public TokenResponseDto createToken(Long userId){
        // 번호표 뽑을 때 신분증 필요없듯 userId 검증은 필요 없을 듯 하다.
        User user = userRepository.findUser(userId).orElseThrow(() -> new CustomException("404","Invalid UserId"));

        String token = UUID.randomUUID().toString() + user.getUserId(); // 토큰 생성

        Integer waitingNumber = generateWaitingNumber();

        LocalDateTime issueTime = LocalDateTime.now();
        LocalDateTime endTime = issueTime.plusMinutes(30); // 30분 후 만료

        WaitingToken waitingToken = WaitingToken.makeWaitingToken(token, WaitingStatus.WAITING,waitingNumber,issueTime,endTime,user);
        WaitingToken saveWaitingToken = tokenRepository.saveToken(waitingToken);

        return new TokenResponseDto(saveWaitingToken.getToken(),saveWaitingToken.getWaitingNumber(), saveWaitingToken.getEndTime());
    }

    private Integer generateWaitingNumber(){
        //현재 대기열에서 마지막 번호 이후의 번호 생성
        return tokenRepository.count() + 1;
    }
}
