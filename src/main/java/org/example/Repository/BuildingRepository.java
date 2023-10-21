package org.example.Repository;

import org.example.Model.Building;

public class BuildingRepository implements InMemoryRepository<Building>{
    @Override
    public boolean save(Building object) {
        return false;
    }

    @Override
    public boolean delete(Building object) {
        return false;
    }

    @Override
    public boolean find(int id) {
        return false;
    }
}
