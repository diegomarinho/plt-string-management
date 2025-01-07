package br.com.api.string.domain.exception;

public class InvalidStringException extends RuntimeException {
    public InvalidStringException(String message) {
        super(message);
    }

    public InvalidStringException(String message, Throwable cause) {
        super(message, cause);
    }
}
