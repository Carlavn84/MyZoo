import java.util.List;
import java.util.Scanner;

public class UserInterface {
//    String codeExitGame;
boolean stayInGame;


    String createCodeForExitTheGame() {
        System.out.println("Press Q to exit the game when you want anytime");
        Scanner exitCode = new Scanner(System.in);
        String codeExitGame = exitCode.nextLine();
//        exitCode.nextLine();
        return codeExitGame ;
    }

    boolean exitTheGame(String exitCode) {


        if (exitCode == "q") {
            stayInGame = false;
        }
        else if (exitCode != "q") {
            System.out.println("The exit code is not correct. Q is the correct one. Else continue the game");
            stayInGame = true;
        }

    return stayInGame;
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

        System.out.println("Enter the number:");
        int code = input.nextInt();
        input.nextLine();

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