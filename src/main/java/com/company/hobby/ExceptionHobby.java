package com.company.hobby;

public class ExceptionHobby extends Exception {
    public ExceptionHobby() {
    }

    public ExceptionHobby(String message) {
        super(message);
    }

    public ExceptionHobby(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionHobby(Throwable cause) {
        super(cause);
    }

    public ExceptionHobby(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
