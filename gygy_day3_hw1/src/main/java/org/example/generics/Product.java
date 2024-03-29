package org.example.generics;

public class Product {

    public Product(int id, String name, String description, double price, int stockAmount, String renk) {
        System.out.println("Product constructor 1");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;
    }

    public Product() {
        System.out.println("Product constructor 2");
    }

    private int id;
    private String name;

    private String description;

    private double price;

    private int stockAmount;

    private String renk;

    private String kod;

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getKod() {
        return this.name + this.id;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }









}
