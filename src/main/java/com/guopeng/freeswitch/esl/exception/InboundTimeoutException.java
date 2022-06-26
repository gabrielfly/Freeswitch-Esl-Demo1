package com.guopeng.freeswitch.esl.exception;

public class InboundTimeoutException extends InboundClientException {
    /**
     * <p>Constructor for InboundTimeoutExcetion.</p>
     *
     * @param message a {@link java.lang.String} object.
     */
    public InboundTimeoutException(String message) {
        super(message);
    }

    /**
     * <p>Constructor for InboundTimeoutExcetion.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param cause   a {@link java.lang.Throwable} object.
     */
    public InboundTimeoutException(String message, Throwable cause) {
        super(message, cause);
    }
}
