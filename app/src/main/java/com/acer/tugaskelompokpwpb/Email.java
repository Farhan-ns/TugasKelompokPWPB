package com.acer.tugaskelompokpwpb;

public class Email {
    private String from, subject, content, receivedTime;

    public Email(String from, String subject, String content, String receivedTime) {
        this.from = from;
        this.subject = subject;
        this.content = content;
        this.receivedTime = receivedTime;
    }

    public String getFrom() {
        return from;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public String getReceivedTime() {
        return receivedTime;
    }
}
