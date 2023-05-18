package com.pemrogramanbergerak.ujiantengahsemester;

public class Item {
    String itemname, itemprice;
    int itemimage;

    public Item(String name, String price, int image) {
        this.itemname = name;
        this.itemprice = price;
        this.itemimage = image;
    }

    public String getName() {

        return itemname;
    }

    public void setName(String name) {
        this.itemname = name;
    }

    public String getPrice() {

        return itemprice;
    }

    public void setPrice(String price) {

        this.itemprice = price;
    }

    public int getImage() {

        return itemimage;
    }

    public void setImage(int image) {

        this.itemimage = image;
    }
}
