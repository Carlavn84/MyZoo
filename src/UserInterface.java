import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    void welcomeToTheZoo() {
        System.out.println("Hello there! Welcome to all wonderful zoos in the world!!!");
    }

    void showMenuZoo() {
        System.out.println("1. Add zoo");
        System.out.println("2. Delete zoo");
        System.out.println("3. Visit zoo");
        System.out.println("0. Quit");

    }

    void showMenuAnimal() {
        System.out.println("1. Add animal");
        System.out.println("2. Delete animal");
                System.out.println("0. Quit");

    }

    void showOptions(List<Class<? extends Animal>> animalList) {
        System.out.println("Which pet do you want to add?");

        for (int i = 1; i <= animalList.size(); i++) {
            Class<? extends Animal> animalType = animalList.get(i - 1);
            String typeName = animalType.getSimpleName();
            System.out.println(i + "." + typeName);
        }
    }





}
