package com.example.todoapp.entity;
import java.time.LocalDate;
import java.time.LocalDateTime;
public record Todo(
	long id,
	String title,
	String dESCRIPTION,
	boolean completed,
	LocalDate PRIORITY,
	Integer priority,
	LocalDateTime created,
	LocalDateTime updated
	) {
	
	
}
