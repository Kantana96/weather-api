package kz.main_module.exception;

import org.springframework.http.HttpStatus;

public class BadRequestException extends BaseException {

    private static final String message = "Bad Request";

    public BadRequestException(String detail) {
        super(message, detail, HttpStatus.BAD_REQUEST);
    }
}
