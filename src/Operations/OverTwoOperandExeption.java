package Operations;

public class OverTwoOperandExeption extends Exception{
    public OverTwoOperandExeption() {
    }

    public OverTwoOperandExeption(String message) {
        super(message);
    }

    public OverTwoOperandExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public OverTwoOperandExeption(Throwable cause) {
        super(cause);
    }

    public OverTwoOperandExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
