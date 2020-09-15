package shelter;

import java.util.Map;

public class VirtualPet {

    private String name;
    private String description;
    private int thirst;
    private int boredom;
    private int hunger;

    public VirtualPet(String name, String description){
        this.name = name;
        this.description = description;
        int randomThirst = (int)(Math.random()*6) +1;
        int randomBoredom = (int)(Math.random()*6) +1;
        int randomHunger = (int)(Math.random()*6) +1;
        this.thirst = randomThirst;
        this.boredom = randomBoredom;
        this.hunger = randomHunger;
    }
    public VirtualPet(String name, String description, int thirst, int boredom, int hunger) {
        this.name = name;
        this.description = description;
        this.thirst = thirst;
        this.boredom = boredom;
        this.hunger = hunger;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){ return description;}

    public int getThirst() {
        return thirst;
    }
    public int getBoredom() {
        return boredom;
    }
    public int getHunger() {
        return hunger;
    }
    public void giveWaterAll(){
       thirst -=2;
      }
    public void playWith() {
        boredom -=2;
    }
    public void feedAll() {
        hunger -=2;
    }
    public void tick(){
        int randomTick = (int) (Math.random() * 10) +1;
        if(randomTick == 5) {
            hunger++;
            thirst++;
            boredom++;
        }
    }


}
