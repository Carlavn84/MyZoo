import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Zoo {

    Animal createPets(Class<? extends Animal> animal) {
        Scanner input = new Scanner(System.in);

        LinkedList<Animal> pets = new LinkedList<Animal>();

        Animal animalInput;

        try {
            animalInput = animal.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Oh oh, something went wrong", e);
        }

        pets.add(animalInput);
        String nameInput;
        String animalType = animal.getSimpleName();

        System.out.println("How do you want to call your " + animalType + " ?");
        nameInput = input.nextLine();
        animalInput.setName(nameInput);

        return animalInput;
    }

//    List<Animal> addPetsToZoo(Animal animal) {
//        LinkedList<Animal> pets = new LinkedList<Animal>();
//
//        pets.add(animal);
//        System.out.println("TETSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
//        return pets;
//    }

    void showPets(List<Animal> animals) {
        System.out.println("You have " + animals.size() + " pet(s)");

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " " + "is a" + " " + animal.getAnimalType() + " and has" + " " + animal.getLegs() + " " + "leg(s)");
        }
    }
}
