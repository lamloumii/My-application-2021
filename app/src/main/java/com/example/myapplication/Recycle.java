package com.example.myapplication;

public class Recycle {
    String point ;
    String direction ;
    String prix ;
    String date ;
    String reference ;
    String direction1;
    String img;

    public Recycle() {
    }

    public Recycle(String point, String direction, String prix, String date, String reference, String direction1, String img) {
        this.point = point;
        this.direction = direction;
        this.prix = prix;
        this.date = date;
        this.reference = reference;
        this.direction1 = direction1;
        this.img = img;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDirection1() {
        return direction1;
    }

    public void setDirection1(String direction1) {
        this.direction1 = direction1;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
