package com.appyy.recyclerviewdemo;

import android.widget.ImageView;

public class contactModel {

    int img;
    String name , number;

    public  contactModel(int img,String name,String number){
        this.name = name;
        this.number = number;
        this.img = img;
    }

    public  contactModel(String name,String number){
        this.name = name;
        this.number = number;

    }


}
