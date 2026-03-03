package com.krzpro.generator;

import java.sql.Time;
import java.time.LocalDateTime;

public class Log {
    private String ip;
    private LocalDateTime timestamp;
    private Action action;
    private Status status;

    public Log(String ip, LocalDateTime timestamp, Action action, Status status) {
        this.ip = ip;
        this.timestamp = timestamp;
        this.action = action;
        this.status = status;
    }

    @Override
    public String toString() {
        return timestamp + " " + ip + " " + action + " " + status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

