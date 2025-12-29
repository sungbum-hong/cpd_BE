package com.codiyoung.cpd.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ErrorResponse {

    private final int status;

    private final String message;

    private final LocalDateTime timestamp;

    public ErrorResponse(int status, String message) {

        this.status = status;
        this.message = message;
        this.timestamp = LocalDateTime.now();

    }

}
