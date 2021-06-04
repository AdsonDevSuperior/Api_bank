package com.accenture.test.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Operation {

    TRANSFER("transfer"),
    WITHDRAW("withdraw"),
    DEPOSIT("deposit");

    private String description;
}
