package com.example.data.entites;

public class Article {
    private String name;
    private int stockQuantity;

    public Article(String name, int stockQuantity) {
        this.name = name;
        this.stockQuantity = stockQuantity;
    }

    // Getters et Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
