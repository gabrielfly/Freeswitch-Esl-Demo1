package com.guopeng.freeswitch.esl;


import com.guopeng.freeswitch.esl.transport.event.EslEvent;

/**
 * <p>IEslEventListener interface.</p>
 *
 * @author : <a href="mailto:ant.zhou@aliyun.com">zhouhailin</a>
 * @version 1.0.0
 */
public interface IEslEventListener {

    /**
     * Signal of a server initiated event.
     *
     * @param addr  addr
     * @param event as an {@link com.guopeng.freeswitch.esl.transport.event.EslEvent}
     */
    void eventReceived(String addr, EslEvent event);

    /**
     * Signal of an event containing the result of a client requested background job.  The Job-UUID will
     * be available as an event header of that name.
     *
     * @param addr  addr
     * @param event as an {@link com.guopeng.freeswitch.esl.transport.event.EslEvent}
     */
    void backgroundJobResultReceived(String addr, EslEvent event);

}

