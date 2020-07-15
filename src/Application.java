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

        ZooClub zooClub = new ZooClub();

        Menu menuZoo = new Menu("ZOO");

        userInterface.welcomeToTheZoo();
        while (true) {
            zooClub.addZooWithAName();
            LinkedList<Zoo> zoos = zooClub.getZoos();
            Zoo selectedZoo = userInterface.selectZoo(zoos);

            zooClub.visitZoo(selectedZoo);


        }
    }
}



