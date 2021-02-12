package com.example.gyklogin.models;

public class Haber {

    public Haber(String adi, String url, String logo) {
        this.adi = adi;
        this.url = url;
        this.logo = logo;
    }

    public String getAdi() {
        return adi;
    }

    public String getUrl() {
        return url;
    }

    public String getLogo() {
        return logo;
    }

    String adi;
    String url;
    String logo;

}
