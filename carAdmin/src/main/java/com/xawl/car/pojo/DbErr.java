package com.xawl.car.pojo;

import java.util.Date;

public class DbErr {
    private Date date;

    private String message;

    private String jClass;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getjClass() {
        return jClass;
    }

    public void setjClass(String jClass) {
        this.jClass = jClass == null ? null : jClass.trim();
    }
}