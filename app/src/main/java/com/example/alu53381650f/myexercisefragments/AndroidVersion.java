package com.example.alu53381650f.myexercisefragments;

import java.io.Serializable;

public class AndroidVersion implements Serializable{
    private String versionName;
    private String versionNumber;
    private int image;
    private String text;

    public String getVersionName() {
        return versionName;
    }
    public void setVersionName(String name) {
        versionName = name;
    }
    public String getVersionNumber() {
        return  versionNumber;
    }
    public void setVersionNumber(String num) {
        versionNumber = num;
    }
    public int getImage() {
        return image;
    }
    public void setImage(int img) {
        image = img;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
