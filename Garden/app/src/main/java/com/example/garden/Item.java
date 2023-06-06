package com.example.garden;

public class Item {
    private String name; // Nazwa nasiona
    private int imageResId; // Identyfikator zasobu obrazka nasiona
    private double price; // Cena nasiona

    public Item(String name, int imageResId, double price) {
        this.name = name;
        this.imageResId = imageResId;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public double getPrice() {
        return price;
    }
}
