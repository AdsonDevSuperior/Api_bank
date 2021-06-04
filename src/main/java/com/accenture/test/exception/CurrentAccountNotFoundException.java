package com.accenture.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CurrentAccountNotFoundException extends Exception {

    public CurrentAccountNotFoundException(int id) {
        super("not found currentAccount with ID" + id);
    }
}
