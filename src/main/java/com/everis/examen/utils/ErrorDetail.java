package com.everis.examen.utils;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorDetail {
	private String message;
	private Instant datetime;
}