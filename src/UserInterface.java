import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public LinkedList<Zoo> zoos = new LinkedList<Zoo>();


    void welcomeToTheZoo() {
        System.out.println("Hello there! Welcome to all wonderful zoos in the world!!!");
    }

    void showZoos() {
        for (Zoo zoo : zoos) {
            boolean listIsEmpty = zoos.isEmpty();
            if (listIsEmpty == true) {
                System.out.println("There is no zoo at the moment.");
            } else {
                System.out.println(zoo.getName());
            }
        }
    }

    void showMenuZoo() {
        System.out.println("1. Add zoo");
        System.out.println("2. Delete zoo");
        System.out.println("3. Visit zoo");
        System.out.println("4. Quit");

    }

    List<Zoo> addZooWithAName() {
        Scanner zooNameInput = new Scanner(System.in);
        Zoo zoo = new Zoo();
        System.out.println("Add a name for your zoo");
        String zooName = zooNameInput.nextLine();
        zoo.addName(zooName);
        zoos.add(zoo);
        return zoos;

    }

    List<Zoo> removeZoo(Zoo zoo) {

        if (!zoos.contains(zoo)) {
            System.out.println("The zoo does not exit");
        } else {
            zoos.remove(zoo);
            return zoos;
        }
        return zoos;
    }
}
