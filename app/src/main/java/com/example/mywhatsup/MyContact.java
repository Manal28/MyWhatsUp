package com.example.mywhatsup;

public class MyContact {

    String name;
    String number;
    int image;

    public MyContact (String name ,String number,int image){
        this.image=image;
        this.name=name;
        this.number=number;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
