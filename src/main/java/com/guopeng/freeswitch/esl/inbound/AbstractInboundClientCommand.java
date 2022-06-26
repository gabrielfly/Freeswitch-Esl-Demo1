package com.guopeng.freeswitch.esl.inbound;


import com.guopeng.freeswitch.esl.helper.CommandHelper;
import com.guopeng.freeswitch.esl.inbound.option.InboundClientOption;

import java.util.List;
import java.util.Map;

import static com.guopeng.freeswitch.esl.constant.Constants.*;


abstract class AbstractInboundClientCommand extends AbstractInboundClient {

    private static final String EMPTY = "";

    private final boolean debugEnabled = log.isDebugEnabled();

    AbstractInboundClientCommand(InboundClientOption option) {
        super(option);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String answer(String addr, String uuid) {
        String command = CommandHelper.cmd(UUID_ANSWER).arg(uuid).toString();
        if (debugEnabled) {
            log.debug("answer addr : {}, command : {}", addr, command);
        }
        return sendAsyncApiCommand(addr, command, EMPTY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String bridge(String addr, String uuid, String otherUuid) {
        String command = CommandHelper.cmd(UUID_BRIDGE).arg(uuid).arg(otherUuid).toString();
        if (debugEnabled) {
            log.debug("bridge addr : {}, command : {}", addr, command);
        }
        return sendAsyncApiCommand(addr, command, EMPTY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String broadcast(String addr, String uuid, String path, String smf) {
        String command = CommandHelper.cmd(UUID_BROADCAST).arg(uuid).arg(path).arg(smf).toString();
        if (debugEnabled) {
            log.debug("broadcast addr : {}, command : {}", addr, command);
        }
        return sendAsyncApiCommand(addr, command, EMPTY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String break0(String addr, String uuid, boolean all) {
        String command = CommandHelper.cmd(UUID_BREAK).arg(uuid).arg(all ? "all" : null).toString();
        if (debugEnabled) {
            log.debug("break0 addr : {}, command : {}", addr, command);
        }
        return sendAsyncApiCommand(addr, command, EMPTY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String hold(String addr, String smf, String uuid, boolean display) {
        String command = CommandHelper.cmd(UUID_HOLD).arg(smf).arg(uuid).arg(display ? "all" : EMPTY).toString();
        if (debugEnabled) {
            log.debug("hold addr : {}, command : {}", addr, command);
        }
        return sendAsyncApiCommand(addr, command, EMPTY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> getVar(String addr, String uuid, String var) {
        String command = CommandHelper.cmd(UUID_GETVAR).arg(uuid).arg(var).toString();
        if (debugEnabled) {
            log.debug("getVar addr : {}, command : {}", addr, command);
        }
        return sendSyncApiCommand(addr, command, EMPTY).getBodyLines();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String setVar(String addr, String uuid, String var, String val) {
        String command = CommandHelper.cmd(UUID_SETVAR).arg(uuid).arg(var).arg(val).toString();
        if (debugEnabled) {
            log.debug("setVar addr : {}, command : {}", addr, command);
        }
        return sendAsyncApiCommand(addr, command, EMPTY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String multiSetVar(String addr, String uuid, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return EMPTY;
        }
        StringBuilder command = new StringBuilder("uuid_setvar_multi " + uuid + " ");
        map.forEach((key, value) -> command.append(key).append("=").append(value).append(";"));
        command.deleteCharAt(command.length() - 1);
        if (debugEnabled) {
            log.debug("multiSetVar addr : {}, command : {}", addr, command);
        }
        return sendAsyncApiCommand(addr, command.toString(), EMPTY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String record(String addr, String uuid, String action, String path, int limit) {
        String command = CommandHelper.cmd(UUID_RECORD).arg(uuid).arg(action).arg(path).arg(limit < 1 ? null : String.valueOf(limit)).toString();
        if (debugEnabled) {
            log.debug("record addr : {}, command : {}", addr, command);
        }
        return sendAsyncApiCommand(addr, command, EMPTY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String transfer(String addr, String uuid, String smf, String dest, String dialplan, String context) {
        String command = CommandHelper.cmd(UUID_TRANSFER).arg(uuid).arg(smf).arg(dest).arg(dialplan).arg(context).toString();
        if (debugEnabled) {
            log.debug("transfer addr : {}, command : {}", addr, command);
        }
        return sendAsyncApiCommand(addr, command, EMPTY);
    }
}

