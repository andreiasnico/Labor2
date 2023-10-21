package org.example.Model;

import java.util.Date;

public class Counter {

    private int counterID;

    private Date checkingDate;

    private CounterTypes type;

    private double pricePerUnit;

    public int getCounterID() {
        return counterID;
    }

    public void setCounterID(int counterID) {
        this.counterID = counterID;
    }

    public Date getCheckingDate() {
        return checkingDate;
    }

    public void setCheckingDate(Date checkingDate) {
        this.checkingDate = checkingDate;
    }

    public CounterTypes getType() {
        return type;
    }

    public void setType(CounterTypes type) {
        this.type = type;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
