import java.util.LinkedList;
import java.util.List;


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

    public Class<? extends Animal> selectAnimal(List<Class<? extends Animal>> animalList) {
        Menu animalMenu = new Menu("Animals Menu");
        for (int i = 0; i <= animalList.size(); i++) {
            Class<? extends Animal> clazz = animalList.get(i - 1);
            animalMenu.addItem(i, clazz.getSimpleName());
        }

        System.out.println("Select the animal you want by entering the according number:");
        int selectedIndex = animalMenu.menu();

        if (selectedIndex == 0) {
            System.exit(0);
        }

        Class<? extends Animal> selectedClazz;

        try {
            selectedClazz  = animalList.get(selectedIndex - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid number! Exit the program.");
            return null;
        }
        return selectedClazz;
    }
}



