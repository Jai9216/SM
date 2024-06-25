package com.sm.exceptions;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ErrorDetails {
	private String message;
	private String details;
	private LocalDateTime timeStamp;
	
}
