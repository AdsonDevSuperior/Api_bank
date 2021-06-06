package com.accenture.test.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;

@Builder
@AllArgsConstructor
@Data
public class StanderError {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd 'T' HH:mm:ss 'Z'", timezone = "GMT")
    private Instant timesTamp;
    private Integer status;
    private String error;
    private String message;
    private String path;


}
