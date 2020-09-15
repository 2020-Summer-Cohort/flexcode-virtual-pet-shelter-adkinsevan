package shelter;

import java.util.Collection;
import java.util.Scanner;
import java.util.SortedMap;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        System.out.println("Thank you for volunteering with Barely Used Pets");

        VirtualPetShelter myShelter = new VirtualPetShelter();

        Scanner input = new Scanner(System.in);

            myShelter.add("Maya", new VirtualPet("Maya","The little dog with big attitude"));
            myShelter.add("Elena", new VirtualPet("Elena", "She's here, she's relaxed, and she loves everyone"));
            myShelter.add("Singer", new VirtualPet("Singer", "The vocal cat who will not stop asking you for food"));
            myShelter.add("Tyson", new VirtualPet("Tyson", "He's named after the chicken brand, he kind of looks like a chicken nugget"));

        System.out.println("Here are the pets we have:");
        System.out.println();
        Collection<VirtualPet> pets = myShelter.getAllPets();

        for (VirtualPet pet : pets){
            System.out.println((pet.getName()) + ": " + pet.getDescription() + "\n" +
                    "\t" + "Thirst|| " + pet.getThirst() +
                    "\t" + "Boredom|| " + pet.getBoredom() +
                    "\t" + "Hunger|| " + pet.getHunger());
        }
        System.out.println();
        System.out.println("What would you like to work on?");
        System.out.println();
        System.out.println("1: Give the pets some water");
        System.out.println("2: Play with the pets");
        System.out.println("3: Feed the pets");
        System.out.println("4: Help a pet get adopted");
        System.out.println("5: Take in new pets");
        System.out.println("6: Go home for today");
        String playerOption = input.nextLine();

        while (!playerOption.equals("6")){
          if (playerOption.equals("1")){
            myShelter.giveWaterAll();
            myShelter.tick();
          }
          else if (playerOption.equals("2")){
              System.out.println("Which pet would you like to play with?");
              for (VirtualPet pet: pets){
                  System.out.println((pet.getName()));
              }
              String petOption = input.nextLine();
              myShelter.playWith(petOption);
              myShelter.tick();
          }
          else if (playerOption.equals("3")){
              myShelter.feedAll();
              myShelter.tick();
          }
          else if(playerOption.equals("4")){
              System.out.println("Who is ready for adoption?");
              for (VirtualPet pet: pets) {
                  System.out.println((pet.getName()));
              }
                  String petOption = input.nextLine();
                  myShelter.getAllPets();
                  myShelter.remove(petOption);
                  myShelter.tick();
              }
          else if(playerOption.equals("5")){
              System.out.println("We have a new pet, what would you like to name it?");
              String name = input.nextLine();
              System.out.println("Please give a description of our new pet!");
              String description = input.nextLine();
              myShelter.add(name, new VirtualPet(name, description));
              myShelter.tick();
          }
          myShelter.tick();

          for (VirtualPet pet : pets){
              System.out.println((pet.getName()) + ": " + pet.getDescription() + "\n" +
                      "\t" + "Thirst|| " + pet.getThirst() +
                      "\t" + "Boredom|| " + pet.getBoredom() +
                      "\t" + "Hunger|| " + pet.getHunger());
          }
          System.out.println();
          System.out.println("What would you like to work on?");
          System.out.println();
          System.out.println("1: Give the pets some water");
          System.out.println("2: Play with the pets");
          System.out.println("3: Feed the pets");
          System.out.println("4: Help a pet get adopted");
          System.out.println("5: Take in new pets");
          System.out.println("6: Go home for today");
          playerOption = input.nextLine();
      }
        System.out.println("We'll see you again sometime!");




















    }
}
