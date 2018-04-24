package com.example.a16004798.p02holidays;

public class holiday {
    private String holsName;
    private int image;
    private String date;
    private String desc;

    public holiday(String holsName, int image, String date, String desc) {
        this.holsName = holsName;
        this.image = image;
        this.date = date;
        this.desc = desc;
    }

    public String getHolsName() {
        return holsName;
    }

    public void setHolsName(String holsName) {
        this.holsName = holsName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
