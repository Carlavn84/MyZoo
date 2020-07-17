import java.util.Collections;
import java.util.LinkedList;

public class Application {

    private static LinkedList<Class<? extends Animal>> animalClasses;

    static {
        animalClasses = new LinkedList();
        animalClasses.add(Cat.class);
        animalClasses.add(Dog.class);
        animalClasses.add(Fish.class);
        animalClasses.add(Spider.class);
        animalClasses.add(Snake.class);
        animalClasses.add(Panda.class);
        Collections.shuffle(animalClasses);
    }

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        UserInterface userInterface = new UserInterface();

        ZooClub zooClub = new ZooClub();

        Menu menuZoo = new Menu("ZOO");


        userInterface.welcomeToTheZoo();

        while (true) {
            zooClub.getZoos();
            zooClub.showZoos();
            String selectOption = userInterface.selectOptionsOfZoo();

            switch (selectOption) {
                case "Add zoo":
                    zooClub.addZooWithAName();
                    break;

                case "Delete zoo":
                    Zoo selectedZooForDelete = userInterface.selectZoo(zooClub.getZoos());
                    zooClub.removeZoo(selectedZooForDelete);
                   break;

                case "Visit zoo":
                    Zoo selectedZooForVisit = userInterface.selectZoo(zooClub.getZoos());
                    zooClub.visitZoo(selectedZooForVisit);
                    String selectOptionOfAnimals = userInterface.selectOptionsOfAnimal();

                    switch (selectOptionOfAnimals) {
                        case "Add animal":
                            selectedZooForVisit.createPets(userInterface.selectAnimalToAddInZoo(animalClasses));
                            break;

                        case "Delete animal":
                            System.out.println(selectedZooForVisit.getAnimals());
                          Animal removedAnimal = userInterface.selectAnimalToRemoveOutOfZoo(selectedZooForVisit.getAnimals());
                          selectedZooForVisit.removeAnimal(removedAnimal);
                         System.out.println(selectedZooForVisit.getAnimals());
                            break;

                        case "Quit":
                            break;
                    }
            }
        }
    }
}



