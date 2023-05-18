package com.pemrogramanbergerak.ujiantengahsemester;

public class Seller {
    String sellername, sellerchat;
    int sellerlogo;

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
    }

    public String getSellerchat() {
        return sellerchat;
    }

    public void setSellerchat(String sellerchat) {
        this.sellerchat = sellerchat;
    }

    public int getSellerlogo() {
        return sellerlogo;
    }

    public void setSellerlogo(int sellerlogo) {
        this.sellerlogo = sellerlogo;
    }

    public Seller(String sellername, String sellerchat, int sellerlogo) {
        this.sellername = sellername;
        this.sellerchat = sellerchat;
        this.sellerlogo = sellerlogo;


    }
}
