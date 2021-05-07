package zoo;

import animals.Animal;
import areas.Entrance;
import areas.Habitat;
import areas.IArea;
import dataStructures.ICashCount;


import java.util.ArrayList;
import java.util.HashMap;

public class Zoo implements IZoo{
    private HashMap<Integer, IArea> areas;
    private int numAreas;

    public Zoo(){
        numAreas = 0;
        areas = new HashMap<>();
        areas.put(0, new Entrance());
        numAreas++;
    }

    @Override
    public int addArea(IArea area) {
        int id = numAreas;
        areas.put(id, area);
        numAreas++;
        return id;
    }

    @Override
    public void removeArea(int areaId) {
        areas.remove(areaId);
    }

    @Override
    public IArea getArea(int areaId) {
        return areas.get(areaId);
    }

    @Override
    public byte addAnimal(int areaId, Animal animal) {
        if (!(isArea(areaId))){
            return Codes.NOT_A_HABITAT;
        }
        if (!(isHabitat(areaId))){
            return Codes.NOT_A_HABITAT;
        }

        Habitat habitat = (Habitat) areas.get(areaId);

        return habitat.addAnimal(animal);
    }

    public boolean isArea(int areaId){
        return areas.get(areaId) != null;

    }

    public boolean isHabitat(int areaId){
        return areas.get(areaId) instanceof Habitat;
    }

    @Override
    public void connectAreas(int fromAreaId, int toAreaId) {

    }

    @Override
    public boolean isPathAllowed(ArrayList<Integer> areaIds) {
        return false;
    }

    @Override
    public ArrayList<String> visit(ArrayList<Integer> areaIdsVisited) {
        return null;
    }

    @Override
    public ArrayList<Integer> findUnreachableAreas() {
        return null;
    }

    @Override
    public void setEntranceFee(int pounds, int pence) {

    }

    @Override
    public void setCashSupply(ICashCount coins) {

    }

    @Override
    public ICashCount getCashSupply() {
        return null;
    }

    @Override
    public ICashCount payEntranceFee(ICashCount cashInserted) {
        return null;
    }
}
