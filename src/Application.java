import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Application {

    private static List<Class<? extends Animal>> animalClasses;

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

        Zoos zoos = new Zoos();

        userInterface.welcomeToTheZoo();

        while (true) {
            userInterface.showMenuZoo();
            zoos.showZoos();
            zoos.addZooWithAName();
zoos.visitZoo();
userInterface.showMenuAnimal();
userInterface.showOptions(animalClasses);

Class animal = zoos.addPet(animalClasses);
zoos.createPets(animal);
//            zoos.showZoos();




        }

    }
}
