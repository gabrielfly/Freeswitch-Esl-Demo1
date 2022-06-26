package com.guopeng.freeswitch.esl.inbound.listener;


import java.util.List;


public interface EventListener {

    /**
     * <p>addEvents.</p>
     *
     * @param list a {@link java.util.List} object.
     */
    void addEvents(List<String> list);

    /**
     * <p>cancelEvents.</p>
     */
    void cancelEvents();

}


