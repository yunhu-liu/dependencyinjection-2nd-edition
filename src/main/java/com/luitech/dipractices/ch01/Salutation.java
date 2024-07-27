package com.luitech.dipractices.ch01;

public class Salutation {

    private final IMessageWriter messageWriter;

    public Salutation(IMessageWriter messageWriter) {

        if(messageWriter == null) {
            throw new NullPointerException("messageWriter is null");
        }
        this.messageWriter = messageWriter;
    }

    public void exclaim(String message) {
        this.messageWriter.writeMessage(message);
    }
}
