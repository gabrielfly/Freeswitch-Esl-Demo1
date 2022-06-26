package com.guopeng.freeswitch.esl.inbound.listener;



import com.guopeng.freeswitch.esl.inbound.handler.InboundChannelHandler;
import com.guopeng.freeswitch.esl.transport.event.EslEvent;

public interface ChannelEventListener {

    /**
     * <p>onChannelActive.</p>
     *
     * @param remoteAddr            a {@link java.lang.String} object.
     * @param inboundChannelHandler a {@link com.guopeng.freeswitch.esl.inbound.handler.InboundChannelHandler} object.
     */
    void onChannelActive(String remoteAddr, InboundChannelHandler inboundChannelHandler);

    /**
     * <p>onChannelClosed.</p>
     *
     * @param remoteAddr a {@link java.lang.String} object.
     */
    void onChannelClosed(String remoteAddr);

    /**
     * <p>handleAuthRequest.</p>
     *
     * @param remoteAddr            a {@link java.lang.String} object.
     * @param inboundChannelHandler a {@link com.guopeng.freeswitch.esl.inbound.handler.InboundChannelHandler} object.
     */
    void handleAuthRequest(String remoteAddr, InboundChannelHandler inboundChannelHandler);

    /**
     * <p>handleEslEvent.</p>
     *
     * @param remoteAddr a {@link java.lang.String} object.
     * @param event      a {@link com.guopeng.freeswitch.esl.transport.event.EslEvent} object.
     */
    void handleEslEvent(String remoteAddr, EslEvent event);

    /**
     * <p>handleDisconnectNotice.</p>
     *
     * @param remoteAddr a {@link java.lang.String} object.
     */
    void handleDisconnectNotice(String remoteAddr);
}

