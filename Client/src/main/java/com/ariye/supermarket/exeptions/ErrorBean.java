package com.ariye.supermarket.exeptions;

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
