package org.example.Model;

import java.util.List;

public class Unit {

    private String name;

    private int unitID;

    private int storyNumber;

    private int surface;

    private List<Bill> bills;

    public Unit(String name, int unitID, int storyNumber, int surface) {
        this.name = name;
        this.unitID = unitID;
        this.storyNumber = storyNumber;
        this.surface = surface;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitID() {
        return unitID;
    }

    public void setUnitID(int unitID) {
        this.unitID = unitID;
    }

    public int getStoryNumber() {
        return storyNumber;
    }

    public void setStoryNumber(int storyNumber) {
        this.storyNumber = storyNumber;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }
}
