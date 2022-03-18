package com.epam.training;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author Herman Kulik
 */
public class Event {
    private final DateFormat dateFormat;
    private Date date;
    private String msg;
    private int id = new Random().nextInt(10);

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Event(Date date, DateFormat dateFormat) {
        this.dateFormat = dateFormat;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + dateFormat.format(date) +
                '}';
    }

    public String getMsg() {
        return msg;
    }


    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }
}
