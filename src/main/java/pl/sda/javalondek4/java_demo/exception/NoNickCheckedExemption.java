package pl.sda.javalondek4.java_demo.exception;

public class NoNickCheckedExemption extends Exception {
    public NoNickCheckedExemption() {
    }

    public NoNickCheckedExemption(String message) {
        super(message);
    }

    public NoNickCheckedExemption(String message, Throwable cause) {
        super(message, cause);
    }

    public NoNickCheckedExemption(Throwable cause) {
        super(cause);
    }

    public NoNickCheckedExemption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
