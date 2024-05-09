package vsu.cs.is.infsysserver.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class GeneralException extends RuntimeException {

    private final HttpStatus status;

    public GeneralException(String message) {
        super(message);
        status = HttpStatus.BAD_REQUEST;
    }

    public GeneralException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
