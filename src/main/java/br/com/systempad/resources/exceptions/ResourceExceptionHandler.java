package br.com.systempad.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(DataBaseException.class)
	public ResponseEntity<StandartError> database(DataBaseException e, HttpServletRequest request){
	      HttpStatus status = HttpStatus.BAD_REQUEST;

	      StandartError error = new StandartError();
	      error.setTimestamp(Instant.now());
	      error.setStatus(status.value());
	      error.setError("Database exception");
	      error.setMessage(e.getMessage());
	      error.setPath(request.getRequestURI());
	      return ResponseEntity.status(status).body(error);
	}
}
