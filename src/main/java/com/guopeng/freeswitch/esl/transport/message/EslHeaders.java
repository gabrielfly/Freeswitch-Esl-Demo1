package com.guopeng.freeswitch.esl.transport.message;


public class EslHeaders {

    /**
     * Standard ESL header names.
     * <p>
     * Note this enum will need to be kept in synch with any new headers introduced on the server side.
     *
     * @author : <a href="mailto:ant.zhou@aliyun.com">zhouhailin</a>
     */
    public enum Name {
        /*
         *  Minor optimization - put most often used headers at the top for fastest resolution
         *  in static fromLiteral().
         */

        /**
         * {@code "Content-Type"}
         */
        CONTENT_TYPE("Content-Type"),
        /**
         * {@code "Content-Length"}
         */
        CONTENT_LENGTH("Content-Length"),
        /**
         * {@code "Reply-Text"}
         */
        REPLY_TEXT("Reply-Text"),
        /**
         * {@code "Job-UUID"}
         */
        JOB_UUID("Job-UUID"),
        /**
         * {@code "Socket-Mode"}
         */
        SOCKET_MODE("Socket-Mode"),
        /**
         * {@code "CONTROL"}
         */
        CONTROL("CONTROL"),
        ;

        private final String literal;

        Name(String literal) {
            this.literal = literal;
        }

        public static Name fromLiteral(String literal) {
            for (Name name : values()) {
                if (name.literal.equalsIgnoreCase(literal)) {
                    return name;
                }
            }

            return null;
        }

        public String literal() {
            return literal;
        }
    }

    /**
     * Some common ESL header values. These are provided as a convenience for commonly used values.
     * <p>
     * This values are not coded as an enum to allow for the very large range of possible values,
     * since they are just Strings.
     *
     * @author : <a href="mailto:ant.zhou@aliyun.com">zhouhailin</a>
     */
    public static final class Value {
        /**
         * {@code "+OK"}
         */
        public static final String OK = "+OK";
        /**
         * {@code "auth/request"}
         */
        public static final String AUTH_REQUEST = "auth/request";
        /**
         * {@code "api/response"}
         */
        public static final String API_RESPONSE = "api/response";
        /**
         * {@code "command/reply"}
         */
        public static final String COMMAND_REPLY = "command/reply";
        /**
         * {@code "text/event-plain"}
         */
        public static final String TEXT_EVENT_PLAIN = "text/event-plain";
        /**
         * {@code "text/event-xml"}
         */
        public static final String TEXT_EVENT_XML = "text/event-xml";
        /**
         * {@code "text/disconnect-notice"}
         */
        public static final String TEXT_DISCONNECT_NOTICE = "text/disconnect-notice";
        /**
         * {@code "-ERR invalid"}
         */
        public static final String ERR_INVALID = "-ERR invalid";

        private Value() {
        }
    }
}

