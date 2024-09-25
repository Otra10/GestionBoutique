package com.example.data.entites;

public class Client {
    private int id;
    private String surname;
    private String telephone;
    private String address;


    public Client(int id , String surname, String telephone, String address) {
        this.id = id;
        this.surname = surname;
        this.telephone = telephone;
        this.address = address;

    }

    public Client(String surname2, String telephone2, String address2, boolean hasAccount, double d) {
        //TODO Auto-generated constructor stub
    }

    // Getters et Setters
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

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

}
