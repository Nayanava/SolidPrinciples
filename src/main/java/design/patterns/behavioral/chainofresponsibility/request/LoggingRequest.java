package design.patterns.behavioral.chainofresponsibility.request;
/**
 * @author nayanava
 */

import java.io.*;

public class LoggingRequest {
    private String message;
    private Exception exception;
    private LogLevel logLevel;

    public LoggingRequest(String message, Exception exception, LogLevel logLevel) {
        this.message = message;
        this.exception = exception;
        this.logLevel = logLevel;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }
}
