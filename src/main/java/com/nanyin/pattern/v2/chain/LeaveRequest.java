package com.nanyin.pattern.v2.chain;

/**
 * @author nanyin
 * @class LeaveRequest.java
 * @description 请假请求
 * @create 09:33 2020-03-31
 */
public class LeaveRequest {
    private String name;
    private String date;
    private boolean inProject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isInProject() {
        return inProject;
    }

    public void setInProject(boolean inProject) {
        this.inProject = inProject;
    }

    public LeaveRequest(String name, String date, boolean inProject) {
        this.name = name;
        this.date = date;
        this.inProject = inProject;
    }
}
