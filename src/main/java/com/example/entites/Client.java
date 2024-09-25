package com.example.entites;

public class Client {
    private String surname;
    private String telephone;
    private String address;
    private boolean hasAccount;
    private double totalDebt;

    public Client(String surname, String telephone, String address, boolean hasAccount, double totalDebt) {
        this.surname = surname;
        this.telephone = telephone;
        this.address = address;
        this.hasAccount = hasAccount;
        this.totalDebt = totalDebt;
    }

    // Getters et Setters
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isHasAccount() {
        return hasAccount;
    }

    public void setHasAccount(boolean hasAccount) {
        this.hasAccount = hasAccount;
    }

    public double getTotalDebt() {
        return totalDebt;
    }

    public void setTotalDebt(double totalDebt) {
        this.totalDebt = totalDebt;
    }
}
