package com.ariye.supermarket.exceptions;

public class ErrorBean {

    private String errorMessage;


    public ErrorBean(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorBean() {
    }

    public String getErrorMessage() {
        return errorMessage;
    }


}
