package com.guopeng.freeswitch.esl.helper;

public class CommandHelper {

    private StringBuilder builder = new StringBuilder();

    private CommandHelper(String cmd) {
        builder.append(cmd);
    }

    public static CommandHelper cmd(String cmd) {
        return new CommandHelper(cmd);
    }

    public CommandHelper arg(String arg) {
        builder.append(" ").append(arg);
        return this;
    }

    public CommandHelper arg(boolean arg) {
        builder.append(" ").append(arg);
        return this;
    }

    public CommandHelper arg(int arg) {
        builder.append(" ").append(arg);
        return this;
    }

    public CommandHelper arg(long arg) {
        builder.append(" ").append(arg);
        return this;
    }

    @Override
    public String toString() {
        return builder.toString();
    }

}
