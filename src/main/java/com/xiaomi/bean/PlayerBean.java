package com.xiaomi.bean;

public class PlayerBean {
    private Integer playerid;

    private String playername;

    private String playerposition;

    private Integer playernumber;

    private Integer teamid;

    private Integer championnumber;

    public PlayerBean(Integer playerid, String playername, String playerposition, Integer playernumber, Integer teamid, Integer championnumber) {
        this.playerid = playerid;
        this.playername = playername;
        this.playerposition = playerposition;
        this.playernumber = playernumber;
        this.teamid = teamid;
        this.championnumber = championnumber;
    }

    public PlayerBean() {
        super();
    }

    public Integer getPlayerid() {
        return playerid;
    }

    public void setPlayerid(Integer playerid) {
        this.playerid = playerid;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername == null ? null : playername.trim();
    }

    public String getPlayerposition() {
        return playerposition;
    }

    public void setPlayerposition(String playerposition) {
        this.playerposition = playerposition == null ? null : playerposition.trim();
    }

    public Integer getPlayernumber() {
        return playernumber;
    }

    public void setPlayernumber(Integer playernumber) {
        this.playernumber = playernumber;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public Integer getChampionnumber() {
        return championnumber;
    }

    public void setChampionnumber(Integer championnumber) {
        this.championnumber = championnumber;
    }
}