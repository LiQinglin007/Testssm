package com.xiaomi.bean;

public class TeamBean {
    private Integer teamid;

    private String teamname;

    private Byte teamage;

    private Integer championnumber;

    private String ballhall;

    private Integer toalmatch;

    private Integer victorynumber;

    public TeamBean(Integer teamid, String teamname, Byte teamage, Integer championnumber, String ballhall, Integer toalmatch, Integer victorynumber) {
        this.teamid = teamid;
        this.teamname = teamname;
        this.teamage = teamage;
        this.championnumber = championnumber;
        this.ballhall = ballhall;
        this.toalmatch = toalmatch;
        this.victorynumber = victorynumber;
    }

    public TeamBean() {
        super();
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname == null ? null : teamname.trim();
    }

    public Byte getTeamage() {
        return teamage;
    }

    public void setTeamage(Byte teamage) {
        this.teamage = teamage;
    }

    public Integer getChampionnumber() {
        return championnumber;
    }

    public void setChampionnumber(Integer championnumber) {
        this.championnumber = championnumber;
    }

    public String getBallhall() {
        return ballhall;
    }

    public void setBallhall(String ballhall) {
        this.ballhall = ballhall == null ? null : ballhall.trim();
    }

    public Integer getToalmatch() {
        return toalmatch;
    }

    public void setToalmatch(Integer toalmatch) {
        this.toalmatch = toalmatch;
    }

    public Integer getVictorynumber() {
        return victorynumber;
    }

    public void setVictorynumber(Integer victorynumber) {
        this.victorynumber = victorynumber;
    }
}