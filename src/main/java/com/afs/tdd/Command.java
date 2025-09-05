package com.afs.tdd;

public enum Command {
    M('M'),
    L('L'),
    R('R'),
    B('B');

    private final char command;

    Command(char command) {
        this.command = command;
    }

    public char getCommand() {
        return command;
    }

}
