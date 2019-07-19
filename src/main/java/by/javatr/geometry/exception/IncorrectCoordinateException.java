package by.javatr.geometry.exception;

public class IncorrectCoordinateException extends Exception {
    public IncorrectCoordinateException() {
    }

    public IncorrectCoordinateException(String message) {
        super(message);
    }

    public IncorrectCoordinateException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectCoordinateException(Throwable cause) {
        super(cause);
    }
}
