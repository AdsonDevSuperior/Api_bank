package com.accenture.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AgencyNotFoundException extends Exception {

    public AgencyNotFoundException(int id) {
        super("Not found agency with ID" + id);
    }
}
