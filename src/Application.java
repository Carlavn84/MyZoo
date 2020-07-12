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

        Menu menuZoo = new Menu("zoo");

        while (true){



            menuZoo.addItem();
            menuZoo.deleteItem();
            menuZoo.visitItem();
            menuZoo.quitGame();

            userInterface.showZoos();
      userInterface.addZooWithAName();

            userInterface.showZoos();
            System.out.println("Remove a zoo");

//            Zoo zoo1 = new Zoo();
//
//userInterface.removeZoo(zoo1)


        }




        }
    }


