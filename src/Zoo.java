import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Zoo {

    private LinkedList<Animal> animals = new LinkedList<Animal>();

    private String zooName;

    public Zoo() {
    }

    public String getName() {
        return this.zooName;
    }

    public void setName(String name) {
        this.zooName = name;
    }


    public Class<? extends Animal> addPet(List<Class<? extends Animal>> animalList) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the according number for adding your pet. Else press 0 to quit the game:");
        int code = input.nextInt();
        input.nextLine();

        if (code == 0) {
            System.exit(0);
        }

        Class<? extends Animal> clazz;

        try {
            clazz = animalList.get(code - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid number! Exit the program.");
            return null;
        }
        return clazz;
    }

    public void createPets(Class<? extends Animal> pet) {
        Scanner input = new Scanner(System.in);

        Animal animal;

        try {
            animal = pet.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Oh oh, something went wrong", e);
        }

        animals.add(animal);
        String nameInput;
        String animalType = pet.getSimpleName();

        System.out.println("How do you want to call your " + animalType + " ?");
        nameInput = input.nextLine();
        animal.setName(nameInput);
    }

    public void deletePets() {
        Scanner petNameInput = new Scanner(System.in);

        System.out.println("Which pet do you want to delete?");
        String petNameToDelete = petNameInput.nextLine();
        for (Animal animal : animals) {
            String nameOfPet = animal.getName();
            if (nameOfPet.equals(petNameToDelete)) {
                animals.remove(animal);
                System.out.println("Successful delete a pet");
            } else {
                System.out.println("The pet does not exit");
            }
        }
    }

    public void showPets() {
        for (Animal animal : animals) {
            System.out.println("There are  " + animals.size() + " pet(s) in the " + zooName);
            System.out.println(animal.getName() + " " + "is a" + " " + animal.getAnimalType() + " and has" + " " + animal.getLegs() + " " + "leg(s)");
        }
    }
}

