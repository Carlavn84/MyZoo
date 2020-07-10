import java.util.List;
import java.util.Scanner;

public class UserInterface {
    void welcomeToGame() {
        System.out.println("Hello there! Welcome to the San Diego Zoo!!!");
    }

    void showOptions(List<Class<? extends Animal>> animalList) {
        System.out.println("Which pet do you want to add?");

        for (int i = 1; i <= animalList.size(); i++) {
            Class<? extends Animal> animalType = animalList.get(i - 1);
            String typeName = animalType.getSimpleName();
            System.out.println(i + "." + typeName);
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
}
