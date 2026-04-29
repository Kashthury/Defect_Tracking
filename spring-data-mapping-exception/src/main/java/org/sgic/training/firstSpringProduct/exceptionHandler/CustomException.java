package org.sgic.training.firstSpringProduct.exceptionHandler;

public class CustomException extends Exception{
    String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    CustomException(String message){
        super(message);
    }

}
