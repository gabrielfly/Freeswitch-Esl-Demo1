package com.guopeng.freeswitch.esl.util;



import java.net.InetSocketAddress;
import java.net.SocketAddress;

/**
 * <p>RemotingUtil class.</p>
 *
 * @author : <a href="mailto:ant.zhou@aliyun.com">zhouhailin</a>
 * @version 1.0.0
 */
public class RemotingUtil {

    /**
     * private constructor
     */
    private RemotingUtil() {
    }

    /**
     * <p>socketAddress2String.</p>
     *
     * @param addr a {@link java.net.SocketAddress} object.
     * @return a {@link java.lang.String} object.
     */
    public static String socketAddress2String(final SocketAddress addr) {
        InetSocketAddress inetSocketAddress = (InetSocketAddress) addr;
        return inetSocketAddress.getAddress().getHostAddress() +
                ":" +
                inetSocketAddress.getPort();
    }
}

