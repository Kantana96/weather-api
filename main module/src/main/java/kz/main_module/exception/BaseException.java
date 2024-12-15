package kz.main_module.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

@Data
@EqualsAndHashCode(callSuper = true)
public abstract class BaseException extends Exception {
    private final HttpStatus httpStatus;
    private final String detail;
    public BaseException(String message, String detail, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
        this.detail = detail;
    }
}
