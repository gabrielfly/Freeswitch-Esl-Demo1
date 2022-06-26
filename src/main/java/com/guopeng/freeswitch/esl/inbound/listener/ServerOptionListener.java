package com.guopeng.freeswitch.esl.inbound.listener;

import com.guopeng.freeswitch.esl.inbound.option.ServerOption;

/**
 * <p>ServerOptionListener interface.</p>
 *
 * @author : <a href="mailto:ant.zhou@aliyun.com">zhouhailin</a>
 * @version 1.0.0
 */
public interface ServerOptionListener {

    /**
     * <p>onAdded.</p>
     *
     * @param serverOption a {@link com.guopeng.freeswitch.esl.inbound.option.ServerOption} object.
     */
    void onAdded(ServerOption serverOption);

    /**
     * <p>onRemoved.</p>
     *
     * @param serverOption a {@link com.guopeng.freeswitch.esl.inbound.option.ServerOption} object.
     */
    void onRemoved(ServerOption serverOption);

}

