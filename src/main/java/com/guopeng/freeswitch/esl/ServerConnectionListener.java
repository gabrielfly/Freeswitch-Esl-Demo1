package com.guopeng.freeswitch.esl;



import com.guopeng.freeswitch.esl.inbound.option.ServerOption;


public interface ServerConnectionListener {

    /**
     * <p>onOpened.</p>
     *
     * @param serverOption a {@link com.guopeng.freeswitch.esl.inbound.option.ServerOption} object.
     */
    void onOpened(ServerOption serverOption);

    /**
     * <p>onClosed.</p>
     *
     * @param serverOption a {@link com.guopeng.freeswitch.esl.inbound.option.ServerOption} object.
     */
    void onClosed(ServerOption serverOption);

}

