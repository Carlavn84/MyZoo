import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Zoos {
    public LinkedList<Zoo> zoos = new LinkedList<Zoo>();
    public LinkedList<Animal> animals = new LinkedList<Animal>();
    public String nameOfZoo;
    Zoo zoo = new Zoo();
    Animal animal;

    void showZoos() {

        boolean listIsEmpty = zoos.isEmpty();
        if (listIsEmpty == true) {
            System.out.println("There is no zoo at the moment.");
        } else {
            System.out.println(zoo.getName());
        }
    }

    List<Zoo> addZooWithAName() {
        Scanner zooNameInput = new Scanner(System.in);

        System.out.println("Add a name for your zoo");
        String zooName = zooNameInput.nextLine();
        for (Zoo availableZoo : zoos) {
            String nameOfZooInZoos = availableZoo.getName();
            if (zooName.equals(nameOfZooInZoos)) {
                System.out.println("The zoo already exits. Use another name!");

            } else {
                zoo.setName(zooName);
                zoos.add(zoo);
            }
        }
        return zoos;
    }


    List<Zoo> removeZoo() {
        Scanner zooNameInput = new Scanner(System.in);

        System.out.println("Which zoo do you want to delete?");
        String zooNameToDelete = zooNameInput.nextLine();

        for (Zoo zoo : zoos) {
            String name = zoo.getName();
            if (name.equals(zooNameToDelete)) {
                System.out.println("Successfully remove!");
                zoos.remove(zoo);
            } else {
                System.out.println("The zoo does not exit");
            }
        }
        return zoos;
    }

    void visitZoo() {
        Scanner zooNameInput = new Scanner(System.in);

        System.out.println("Which zoo do you want to visit?");
        String zooNameToVisit = zooNameInput.nextLine();

            String nameOfZoo = zoo.getName();
            if (!zooNameToVisit.equals(nameOfZoo)) {
                System.out.println("The zoo does not exits");

            }
            else {
                System.out.println("There are  " + animals.size() + " pet(s) in the " + nameOfZoo + " zoo");
                System.out.println(animal.getName() + " " + "is a" + " " + animal.getAnimalType() + " and has" + " " + animal.getLegs() + " " + "leg(s)");
                System.out.println("TETSTSTTSTST");
            }
        }

    Class<? extends Animal> addPet(List<Class<? extends Animal>> animalList) {
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

    List<Animal> createPets(Class<? extends Animal> animal) {
        Scanner input = new Scanner(System.in);

        Animal animalInput;

        try {
            animalInput = animal.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Oh oh, something went wrong", e);
        }

        animals.add(animalInput);
        String nameInput;
        String animalType = animal.getSimpleName();

        System.out.println("How do you want to call your " + animalType + " ?");
        nameInput = input.nextLine();
        animalInput.setName(nameInput);
        return animals;
    }

    List<Animal> deletePets() {
        Scanner petNameInput = new Scanner(System.in);

        System.out.println("Which pet do you want to delete?");
        String petNameToDelete = petNameInput.nextLine();

        String nameOfPet = animal.getName();
        if (nameOfPet.equals(petNameToDelete)) {
            animals.remove(animal);
        } else {
            System.out.println("The pet does not exit");
        }
        System.out.println("Sucessfully delete a pet");
        return animals;
    }

    void showPets() {
        System.out.println("There are  " + animals.size() + " pet(s) in the " + nameOfZoo + " zoo");
        System.out.println(animal.getName() + " " + "is a" + " " + animal.getAnimalType() + " and has" + " " + animal.getLegs() + " " + "leg(s)");
        System.out.println("TETSTSTTSTST");
    }
}
