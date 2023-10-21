package org.example.Model;

import java.util.List;

public class Renter {

    private String firmName;
    private String email;
    private String Iban;
    List<User> users;
    List<Unit> rentedUnits;

    public Renter(String firmName, String email, String iban, List<User> users, List<Unit> rentedUnits) {
        this.firmName = firmName;
        this.email = email;
        Iban = iban;
        this.users = users;
        this.rentedUnits = rentedUnits;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIban() {
        return Iban;
    }

    public void setIban(String iban) {
        Iban = iban;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Unit> getRentedUnits() {
        return rentedUnits;
    }

    public void setRentedUnits(List<Unit> rentedUnits) {
        this.rentedUnits = rentedUnits;
    }
}

