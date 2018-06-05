package com.xiaomi.bean;

public class CoachBean {
    private Integer coachid;

    private String coachname;

    private Integer championnumber;

    private Integer teamid;

    private Integer parentid;

    public CoachBean(Integer coachid, String coachname, Integer championnumber, Integer teamid, Integer parentid) {
        this.coachid = coachid;
        this.coachname = coachname;
        this.championnumber = championnumber;
        this.teamid = teamid;
        this.parentid = parentid;
    }

    public CoachBean() {
        super();
    }

    public Integer getCoachid() {
        return coachid;
    }

    public void setCoachid(Integer coachid) {
        this.coachid = coachid;
    }

    public String getCoachname() {
        return coachname;
    }

    public void setCoachname(String coachname) {
        this.coachname = coachname == null ? null : coachname.trim();
    }

    public Integer getChampionnumber() {
        return championnumber;
    }

    public void setChampionnumber(Integer championnumber) {
        this.championnumber = championnumber;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}