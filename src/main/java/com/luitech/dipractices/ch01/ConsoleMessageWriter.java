package com.luitech.dipractices.ch01;

public class ConsoleMessageWriter implements IMessageWriter {

    public void writeMessage(final String message) {
        System.out.println(message);
    }
}
