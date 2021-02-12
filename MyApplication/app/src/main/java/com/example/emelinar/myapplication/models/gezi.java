package com.example.emelinar.myapplication.models;

public class gezi {

    private String yazi;
    private String foto;
    private String gezi;

    public String getyazi() {
        return yazi;
    }

    public String getfoto() {
        return foto;
    }

    public String getgezi() {
        return gezi;
    }

    public gezi(String yazi, String foto, String gezi) {
        this.yazi = yazi;
        this.foto = foto;
        this.gezi = gezi;
    }

}
