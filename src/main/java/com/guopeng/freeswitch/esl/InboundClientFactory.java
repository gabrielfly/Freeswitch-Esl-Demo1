package com.guopeng.freeswitch.esl;


import com.guopeng.freeswitch.esl.exception.InboundClientException;
import com.guopeng.freeswitch.esl.inbound.NettyInboundClient;
import com.guopeng.freeswitch.esl.inbound.option.InboundClientOption;


class InboundClientFactory {

    private InboundClient inboundClient = null;

    private InboundClientFactory() {
    }

    static InboundClientFactory getInstance() {
        return InboundClientFactoryInstance.INSTANCE;
    }

    synchronized InboundClient newInboundClient(InboundClientOption option) {
        if (inboundClient == null) {
            inboundClient = new NettyInboundClient(option == null ? new InboundClientOption() : option);
            return inboundClient;
        }
        throw new InboundClientException("InboundClient has been created already, instance : [" + inboundClient + "]!");
    }

    InboundClient getInboundClient() {
        if (inboundClient == null) {
            throw new InboundClientException("InboundClient is null, you must be create it first.");
        }
        return inboundClient;
    }

    private static class InboundClientFactoryInstance {
        private static final InboundClientFactory INSTANCE = new InboundClientFactory();
    }

}

