import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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

        Menu menu = new Menu();

        userInterface.welcomeToTheZoo();



        while(true){
            zooClub.showZoos();
            menu.menuZoo();
            Scanner input = new Scanner(System.in);
            int inputCode = input.nextInt();

            switch(inputCode){
                case 1:
                    zooClub.addZooWithAName();
                    break;
                case 2:
                    zooClub.removeZoo();
                    break;
                case 3:
                    Zoo zooName = zooClub.visitZoo();
                    zoo.showPets(zooName);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }




        }









        }

    }

