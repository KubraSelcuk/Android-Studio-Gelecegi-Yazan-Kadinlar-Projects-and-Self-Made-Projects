package com.turkcell.gyk401.models;

public class Yemek {

    private String name;
    private String photo;
    private int kcal;

    public String getName() {
        return name;
    }

    public String getPhoto() {
        return photo;
    }

    public int getKcal() {
        return kcal;
    }

    public Yemek(String name, String photo, int kcal) {
        this.name = name;
        this.photo = photo;
        this.kcal = kcal;
    }
}
