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

        Application application = new Application();
        Zoo zoo = new Zoo();

        UserInterface userInterface = new UserInterface();

        userInterface.startTheGame();

        while (true) {


            userInterface.showOptions(animalClasses);

            Class animal = userInterface.addPet(animalClasses);

            Animal pet = zoo.createPets(animal);

            List animals = application.addPetsToZoo(pet);

            zoo.showPets(animals );

        }
    }

    private List<Animal> addPetsToZoo(Animal animal) {
        LinkedList<Animal> pets = new LinkedList<Animal>();
        pets.add(animal);
        return pets;
    }
}

