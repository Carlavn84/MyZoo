import java.util.LinkedList;

public class UserInterface {

    public void welcomeToTheZoo() {
        System.out.println("Hello there! Welcome to all wonderful zoos in the world!!!");
    }

    public String selectOptionsOfZooMenu() {
        LinkedList<String> setOptionsOfZoo = new LinkedList<>();

        Menu menuOptions = new Menu("Select one of options:");
        setOptionsOfZoo.add("Add zoo");
        setOptionsOfZoo.add("Delete zoo");
        setOptionsOfZoo.add("Visit zoo");
        setOptionsOfZoo.add("Quit");

        for (int i = 1; i <= setOptionsOfZoo.size(); i++) {
            String option = setOptionsOfZoo.get(i - 1);
            menuOptions.addItem(i, option);
        }
        int selectIndex = menuOptions.menu();
        return setOptionsOfZoo.get(selectIndex - 1);
    }

    public String selectOptionsOfAnimalMenu() {
        LinkedList<String> setOptionsOfAnimal = new LinkedList<>();

        Menu menuOptions = new Menu("Select one of options:");

        setOptionsOfAnimal.add("Add animal");
        setOptionsOfAnimal.add("Delete animal");
        setOptionsOfAnimal.add("Quit");

        for (int i = 1; i <= setOptionsOfAnimal.size(); i++) {
            String option = setOptionsOfAnimal.get(i - 1);
            menuOptions.addItem(i, option);
        }
        int selectIndex = menuOptions.menu();
        return setOptionsOfAnimal.get(selectIndex - 1);
    }

    public Zoo selectZoo(LinkedList<Zoo> zoos) {
        Menu zooMenu = new Menu("Select the zoo:");

        for (int i = 1; i <= zoos.size(); i++) {
            Zoo zoo = zoos.get(i - 1);
            zooMenu.addItem(i, zoo.getName());
        }
        int selectIndex = zooMenu.menu();
        Zoo selectedZoo = zoos.get(selectIndex - 1);
        return selectedZoo;
    }

    public Class<? extends Animal> selectAnimalToAddInZoo(LinkedList<Class<? extends Animal>> animals) {
        Menu animalMenu = new Menu("Select the animal you want by entering the according number:");

        for (int i = 1; i <= animals.size(); i++) {
            Class<? extends Animal> clazz = animals.get(i - 1);
            animalMenu.addItem(i, clazz.getSimpleName());
        }

        int selectedIndex = animalMenu.menu();

        if (selectedIndex == 0) {
            System.exit(0);
        }

        Class<? extends Animal> selectedClazz;

        try {
            selectedClazz = animals.get(selectedIndex - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid number! Exit the program.");
            return null;
        }
        return selectedClazz;
    }

    public Animal selectAnimalToRemoveOutOfZoo(LinkedList<Animal> animals) {
        Menu zooMenu = new Menu("Select the animal you want to remove out of the zoo:");

        Animal removedAnimal;
        for (int i = 1; i <= animals.size(); i++) {
            removedAnimal = animals.get(i - 1);
            zooMenu.addItem(i, removedAnimal.getName() + " is a " + removedAnimal.getAnimalType());
        }
        int selectIndex = zooMenu.menu();
        return animals.get(selectIndex - 1);
    }
}



