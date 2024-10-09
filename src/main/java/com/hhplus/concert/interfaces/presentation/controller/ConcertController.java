package com.hhplus.concert.interfaces.presentation.controller;

import com.hhplus.concert.common.exception.CustomException;
import com.hhplus.concert.interfaces.presentation.dto.response.ConcertDateResponseDto;
import com.hhplus.concert.interfaces.presentation.dto.response.ConcertSeatResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ConcertController {
    @GetMapping("/{concertId}/concert-dates")
    public ResponseEntity<List<ConcertDateResponseDto>> getConcertDates(@PathVariable Long concertId, @RequestParam String token){
        if (token == null || token.isEmpty()){
            throw new CustomException("401", "Expired token");
        }
        ConcertDateResponseDto dto = new ConcertDateResponseDto();
        dto.setId(1L);
        dto.setConcertDate("2024-10-10");
        ConcertDateResponseDto dto1 = new ConcertDateResponseDto();
        dto.setId(2L);
        dto.setConcertDate("2024-10-10");
        List<ConcertDateResponseDto> dateResponseDtos = new ArrayList<>(List.of(dto,dto1));

        return ResponseEntity.ok(dateResponseDtos);

    }

    @GetMapping("/{concertDateId}/concert-seat")
    public ResponseEntity<List<ConcertSeatResponseDto>> getConcertSeatInfo(@PathVariable Long concertDateId, @RequestParam String token){
        if (token.isEmpty() || concertDateId == null){
            throw new CustomException("401", "expired Token");
        }
        ConcertSeatResponseDto dto = new ConcertSeatResponseDto(1L,"5A","미배정",1000);
        ConcertSeatResponseDto dto2 = new ConcertSeatResponseDto(2L,"7A","미배정",1000);
        List<ConcertSeatResponseDto> dtos = new ArrayList<>(List.of(dto,dto2));

        return ResponseEntity.ok(dtos);
    }
}
