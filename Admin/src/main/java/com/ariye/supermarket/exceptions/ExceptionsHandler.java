package com.ariye.supermarket.exceptions;

import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ExceptionsHandler {

    @ExceptionHandler
    @ResponseBody
    public ErrorBean toResponse(Throwable throwable, HttpServletResponse response) {

        response.setStatus(600);

        String errorMessage = throwable.getMessage() + (throwable.getCause() != null? throwable.getCause() : "");
        ErrorBean errorBean = new ErrorBean(errorMessage);
        throwable.printStackTrace();

        return errorBean;
    }

}

