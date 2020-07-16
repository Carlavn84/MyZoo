import java.util.LinkedList;


public class UserInterface {


    public void welcomeToTheZoo() {
        System.out.println("Hello there! Welcome to all wonderful zoos in the world!!!");

    }

    public String selectOptionsOfZoo() {
        LinkedList<String> setOptions = new LinkedList<>();

        Menu menuOptions = new Menu("Select option:");
        setOptions.add("Add zoo");
        setOptions.add("Delete zoo");
        setOptions.add("Visit zoo");
        setOptions.add("Quit");

        for (int i = 1; i <= setOptions.size(); i++) {
            String option = setOptions.get(i - 1);
            menuOptions.addItem(i, option);
        }

        int selectIndex = menuOptions.menu();
        String selectedOption = setOptions.get(selectIndex - 1);
        return selectedOption;
    }

    public String selectOptionsOfAnimal() {
        LinkedList<String> setOptionsOfAnimals = new LinkedList<>();

        Menu menuOptions = new Menu("Select one of options:");

        setOptionsOfAnimals.add("Add animal");
        setOptionsOfAnimals.add("Delete animal");
        setOptionsOfAnimals.add("Quit");

        for (int i = 1; i <= setOptionsOfAnimals.size(); i++) {
            String option = setOptionsOfAnimals.get(i - 1);
            menuOptions.addItem(i, option);
        }

        int selectIndex = menuOptions.menu();
        String selectedOption = setOptionsOfAnimals.get(selectIndex - 1);
        return selectedOption;
    }

    public Zoo selectZoo(LinkedList<Zoo> zoos) {
        Menu zooMenu = new Menu("ZOOS MENU");

        for (int i = 1; i <= zoos.size(); i++) {
            Zoo zoo = zoos.get(i - 1);
            zooMenu.addItem(i, zoo.getName());
        }
        System.out.println("Select the zoo you want by entering the according number:");

        int selectIndex = zooMenu.menu();
        Zoo selectedZoo = zoos.get(selectIndex - 1);
        return selectedZoo;
    }

    public Class<? extends Animal> selectAnimal(LinkedList<Class<? extends Animal>> animals) {
        Menu animalMenu = new Menu("ANIMALS MENU");
        for (int i = 1; i <= animals.size(); i++) {
            Class<? extends Animal> clazz = animals.get(i - 1);
            animalMenu.addItem(i, clazz.getSimpleName());
        }

        System.out.println("Select the animal you want by entering the according number:");
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
}



