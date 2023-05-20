package com.yirmak.mycitybook;

import java.io.Serializable;

public class Cityy implements Serializable {

    String name;
    String city;
    int image;

    public Cityy(String name, String city, int image) {
        this.name = name;
        this.city = city;
        this.image = image;
    }

}
