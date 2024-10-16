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
    @JoinColumn(name = "user")
    private User user;

    public WaitingToken(String token, WaitingStatus status, Integer waitingNumber, LocalDateTime issueTime, LocalDateTime endTime, User user) {
        this.token = token;
        this.status = status;
        this.waitingNumber = waitingNumber;
        this.issueTime = issueTime;
        this.endTime = endTime;
        this.user = user;
    }

    public static WaitingToken makeWaitingToken(String token, WaitingStatus status, Integer waitingNumber, LocalDateTime issueTime, LocalDateTime endTime, User user) {
        return new WaitingToken(token, status, waitingNumber, issueTime, endTime, user);
    }
}
