package com.accenture.test.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@Configuration
public class CurrentAccountResourceExceptionHandle {

    @ExceptionHandler(CurrentAccountNotFoundException.class)
    public ResponseEntity<StanderError> resourceNotFound(CurrentAccountNotFoundException e, HttpServletRequest request) {
        String error = "Resource Not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StanderError err = new StanderError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
