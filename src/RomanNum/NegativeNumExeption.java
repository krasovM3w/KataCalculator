package RomanNum;

public class NegativeNumExeption extends Exception{
    public NegativeNumExeption() {
    }

    public NegativeNumExeption(String message) {
        super(message);
    }

    public NegativeNumExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeNumExeption(Throwable cause) {
        super(cause);
    }

    public NegativeNumExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
