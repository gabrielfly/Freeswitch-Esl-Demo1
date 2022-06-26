package com.guopeng.freeswitch.esl.exception;


public class InboundClientException extends RuntimeException {
    /**
     * <p>Constructor for InboundClientException.</p>
     *
     * @param message a {@link java.lang.String} object.
     */
    public InboundClientException(String message) {
        super(message);
    }

    /**
     * <p>Constructor for InboundClientException.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param cause   a {@link java.lang.Throwable} object.
     */
    public InboundClientException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * <p>Constructor for InboundClientException.</p>
     *
     * @param cause a {@link java.lang.Throwable} object.
     */
    public InboundClientException(Throwable cause) {
        super(cause);
    }
}

