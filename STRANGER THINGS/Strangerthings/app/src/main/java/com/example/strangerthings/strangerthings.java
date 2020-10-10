package com.example.strangerthings;

import java.io.Serializable;

public class strangerthings implements Serializable {
    public strangerthings(String name, int image, String actorname, int actorage) {
        this.name = name;
        this.image = image;
        this.actorname = actorname;
        this.actorage = actorage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getActorname() {
        return actorname;
    }

    public void setActorname(String actorname) {
        this.actorname = actorname;
    }

    public int getActorage() {
        return actorage;
    }

    public void setActorage(int actorage) {
        this.actorage = actorage;
    }

    private String name;
    private  int image;
    private String actorname;
    private int actorage;


}
