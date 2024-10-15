package com.hhplus.concert.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class WaitingToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long waitingTokenId;

    @Column
    private String token;

    @Column
    private WaitingStatus status;

    @Column
    private Integer waitingNumber;

    @Column
    private LocalDateTime issueTime;

    @Column
    private LocalDateTime endTime;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
