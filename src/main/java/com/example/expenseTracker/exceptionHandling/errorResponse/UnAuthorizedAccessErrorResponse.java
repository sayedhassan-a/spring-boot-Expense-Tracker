package com.example.expenseTracker.exceptionHandling.errorResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnAuthorizedAccessErrorResponse {
    private int status;
    private String message;
    private LocalDateTime timeStamp;
}
