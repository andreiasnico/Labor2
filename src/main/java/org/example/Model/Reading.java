package org.example.Model;

public class Reading {

    private Counter counter;

    private Bill bill;

    private int volumeReading;


    public double calculatePrice(){
        return this.volumeReading * this.counter.getPricePerUnit();
    }
}
