package com.guopeng.freeswitch.esl.inbound.option;


public enum ConnectState {
    /**
     * 初始化状态
     */
    INIT,
    /**
     * 正在连接
     */
    CONNECTING,
    /**
     * 连接失败
     */
    FAILED,
    /**
     * 连接成功
     */
    CONNECTED,
    /**
     * 认证成功
     */
    AUTHED,
    /**
     * 认证失败
     */
    AUTHED_FAILED,
    /**
     * 正在关闭连接
     */
    CLOSING,
    /**
     * 连接已关闭
     */
    CLOSED,
    /**
     * 应用已停止
     */
    SHUTDOWN
}
