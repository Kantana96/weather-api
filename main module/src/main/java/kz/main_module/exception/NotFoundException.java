package kz.main_module.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends BaseException{

    private static final String message = "Entity not found";

    public NotFoundException(String detail) {
        super(message, detail, HttpStatus.NOT_FOUND);
    }
}
