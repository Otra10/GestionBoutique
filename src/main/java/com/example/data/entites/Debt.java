package com.example.data.entites;

import java.util.Date;

public class Debt {
    private Date date;
    private double amount;
    private double amountPaid;
    private double remainingAmount;
    private Client client;

    public Debt(Date date, double amount, double amountPaid, double remainingAmount, Client client) {
        this.date = date;
        this.amount = amount;
        this.amountPaid = amountPaid;
        this.remainingAmount = remainingAmount;
        this.client = client;
    }

    // Getters et Setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
