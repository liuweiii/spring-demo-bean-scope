package com.example.beans;

/**
 * Created by apple on 2016/12/4.
 */
public class Bean {
    private String name;
    public void setName(String name){
        this.name = name;
    }

    public void out(){
        System.out.println("Bean's name is " + name);
    }
}
