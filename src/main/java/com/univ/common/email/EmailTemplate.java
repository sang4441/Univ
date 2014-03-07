package com.univ.common.email;

/**
 * Created by kimsanghwan on 3/6/2014.
 */
public class EmailTemplate {
    protected int fromId;
    protected int toId;
    protected String toEmail;
    protected String subject;

    public EmailTemplate() {
    }

    public EmailTemplate(int fromId, String toEmail) {
        this.fromId = fromId;
        this.toEmail = toEmail;
    }

    public EmailTemplate(int fromId, int toId, String subject) {
        this.fromId = fromId;
        this.toId = toId;
        this.subject = subject;
    }

    public EmailTemplate(int fromId, String toEmail, String subject) {
        this.fromId = fromId;
        this.toEmail = toEmail;
        this.subject = subject;
    }

    public EmailTemplate(int fromId, int toId, String toEmail, String subject) {
        this.fromId = fromId;
        this.toId = toId;
        this.toEmail = toEmail;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getToId() {
        return toId;
    }

    public void setToId(int toId) {
        this.toId = toId;
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
