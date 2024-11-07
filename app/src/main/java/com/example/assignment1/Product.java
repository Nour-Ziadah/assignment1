package com.example.assignment1;

public class Product {

    private String name;
    private double price;
    private String description;
    private String category;
    private String skinType;
    private int imageID;
    private String brand;

    public Product(String name, double price, String description, String category, String skinType, int imageID, String brand) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.skinType = skinType;
        this.imageID = imageID;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return name;
    }
}
