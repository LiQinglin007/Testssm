package com.xiaomi.bean;

public class ChampionteamBean {
    private Integer teamid;

    private String teamname;

    public ChampionteamBean(Integer teamid, String teamname) {
        this.teamid = teamid;
        this.teamname = teamname;
    }

    public ChampionteamBean() {
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
}