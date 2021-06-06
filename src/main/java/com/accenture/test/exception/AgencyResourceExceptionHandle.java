package com.accenture.test.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@Configuration
public class AgencyResourceExceptionHandle {

    @ExceptionHandler(AgencyNotFoundException.class)
    public ResponseEntity<StanderError> notFoundError(AgencyNotFoundException a, HttpServletRequest request) {
        String error = "Resource Not Found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StanderError err = new StanderError(Instant.now(), status.value(), error, a.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
