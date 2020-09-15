package shelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    VirtualPetShelter underTest;
    VirtualPet pet1;
    VirtualPet pet2;

    @BeforeEach
    public void setUp(){
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("Maya","Stinky", 4,4,4);
        pet2 = new VirtualPet("Elena","Good Dog",4,4,4);
    }
    @Test
    public void addingNewPet(){
        underTest.add("PetName", pet1);
        VirtualPet findingPet = underTest.findPet("Maya");
        assertEquals(findingPet, pet1);
    }
    @Test
    public void addingSecondNewPetAndShowingAllPets(){
        underTest.add("PetName", pet1);
        underTest.add("PetName", pet2);
        Collection<VirtualPet> allPets = underTest.getAllPets();
        assertThat(allPets, containsInAnyOrder(pet1,pet2));
    }
    @Test
    public void removingAPet(){
        underTest.add( "pet1", pet1);
        underTest.add("PetName", pet2);
        underTest.remove("pet1");
        VirtualPet findingPet = underTest.findPet("Maya");
        assertEquals(findingPet,null);
    }
    @Test
    public void feedAllMethodWillDecreaseHungerForAll(){
        underTest.add("PetName", pet1);
        underTest.add("PetName", pet2);
        underTest.feedAll();
        assertEquals(pet1.getHunger(), 2);
        assertEquals(pet2.getThirst(),2);
    }
    @Test
    public void giveWaterAllMethodWillDecreaseThirstForAll(){
        underTest.add("PetName", pet1);
        underTest.add("PetName", pet2);
        underTest.giveWaterAll();
        assertEquals(pet1.getThirst(), 4);
        assertEquals(pet2.getThirst(),3);
    }
    @Test
    public void playWithMethodWillDecreaseBoredom(){
        underTest.add("PetName", pet1);
        underTest.playWith(pet1.getName());
        assertEquals(pet1.getBoredom(), 2);
    }
    @Test
    public void tickMethodWillIncreaseAllVariables(){
        underTest.add("PetName", pet1);
        underTest.tick();
        assertEquals(pet1.getBoredom(), 5);
        assertEquals(pet1.getHunger(), 5);
        assertEquals(pet1.getThirst(),5);
    }
}
