package com.example.shoppingappproductui;

public class Data {

    int image;
    String amount;
    String brand;
    int rating;

    public Data(int image, String amount, String brand, int rating) {
        this.image = image;
        this.amount = amount;
        this.brand = brand;
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
