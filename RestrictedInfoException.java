package com.example.getmesocial.exception;

public class RestrictedInfoException extends Exception{
    @Override
    public String getMessage(){
        return "You got no right to have this info ok? ";
    }
}
