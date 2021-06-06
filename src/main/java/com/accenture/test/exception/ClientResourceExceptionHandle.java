package com.accenture.test.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@Configuration
public class ClientResourceExceptionHandle {

    @ExceptionHandler(ClientNotFoundException.class)
    public ResponseEntity<StanderError> resourceNotFound(ClientNotFoundException c, HttpServletRequest request) {
        String error = "Resource Not Found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StanderError err = new StanderError(Instant.now(), status.value(), error, c.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
