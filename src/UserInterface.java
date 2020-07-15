import java.util.LinkedList;
import java.util.Scanner;


public class UserInterface {

    public void welcomeToTheZoo() {
        System.out.println("Hello there! Welcome to all wonderful zoos in the world!!!");

    }

    public Zoo selectZoo(LinkedList<Zoo> zoos) {
        Menu zooMenu = new Menu("ZOO MENU");
        for (int i = 1; i <= zoos.size(); i++) {
            Zoo zoo = zoos.get(i - 1);
            zooMenu.addItem(i, zoo.getName());
        }
        System.out.println("Select the zoo you want by entering the according number:");
        int selectIndex = zooMenu.menu();
        Zoo selectedZoo = zoos.get(selectIndex - 1);
        return selectedZoo;
    }


//    public void showOptions(List<Class<? extends Animal>> animalList) {
//        System.out.println("Which pet do you want to add?");
//
//        for (int i = 1; i <= animalList.size(); i++) {
//            Class<? extends Animal> animalType = animalList.get(i - 1);
//            String typeName = animalType.getSimpleName();
//            System.out.println(i + "." + typeName);
//        }
//    }

    public void showOptionsToVisitZoo(LinkedList<Zoo> zoos) {
        Scanner zooCodeNameInput = new Scanner(System.in);

        System.out.println("Select which zoo do you want to visit?");
        for (int i = 1; i <= zoos.size(); i++) {
            Zoo zoo = zoos.get(i - 1);
            String zooName = zoo.getName();
            System.out.println(i + "." + zooName);

        }

//        int code = zooCodeNameInput.nextInt();
//
//        Zoo zoo = new Zoo();
//
//
//        try {
//            zoo = zoos.get(code - 1);
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Invalid number! Exit the program.");
//        }
//
//        System.out.println("There are  " + zoo.showZoo().size() + " pet(s) in the " + zoo.getName());
//
//        for (Animal animal : zoo.showZoo()) {
//            System.out.println(animal.getName() + " " + "is a" + " " + animal.getAnimalType() + " and has" + " " + animal.getLegs() + " " + "leg(s)");
//        }

    }
}
