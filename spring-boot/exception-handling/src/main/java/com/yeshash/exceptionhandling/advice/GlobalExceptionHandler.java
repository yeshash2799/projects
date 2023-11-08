package com.yeshash.exceptionhandling.advice;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.yeshash.exceptionhandling.exception.UserNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        Map<String, String> errorMap = new HashMap<String, String>();

        e.getFieldErrors().forEach(error -> {
            errorMap.put(error.getField(), error.getDefaultMessage());
        });

        return errorMap;
    }

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> userNotFoundExceptionhandler(UserNotFoundException e) {
        Map<String, String> errorMap = new HashMap<String, String>();

        errorMap.put("message", e.getMessage());
        errorMap.put("status", "BAD_REQUEST");

        return errorMap;
    }
}
