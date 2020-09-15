package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> pets = new HashMap<>();

    public Collection<VirtualPet> getAllPets() {
        return pets.values();
    }
    public VirtualPet findPet(String petName){
        return pets.get(petName);
    }
    public void add(String name, VirtualPet petToAdd){
        pets.put(name, petToAdd);
    }

    public void remove(String name){ pets.remove(name); }

    public void giveWaterAll() {
        for (VirtualPet giveWater : pets.values()){
            giveWater.giveWaterAll();
        }
    }
    public void playWith(String petName) {
        VirtualPet playWith = findPet(petName);
        playWith.playWith();
    }
    public void feedAll() {
        for(VirtualPet feed : pets.values())
           feed.feedAll();
    }
    public void tick(){
        for (VirtualPet tick : pets.values()){
            tick.tick();
        }
    }
    }

