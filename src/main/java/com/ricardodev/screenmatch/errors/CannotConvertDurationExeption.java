package com.ricardodev.screenmatch.errors;

public class CannotConvertDurationExeption extends RuntimeException {
    private String message;

    public CannotConvertDurationExeption(String messsage) {
        this.message = messsage;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
