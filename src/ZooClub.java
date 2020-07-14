import java.util.LinkedList;
import java.util.Scanner;

public class ZooClub {
    private LinkedList<Zoo> zoos = new LinkedList<Zoo>();

    public void showZoos() {
        boolean listIsEmpty = zoos.isEmpty();
        if (listIsEmpty) {
            System.out.println("There is no zoo at the moment.");
        } else {
            for (int i = 1; i <= zoos.size(); i++) {
                Zoo zoo = zoos.get(i - 1);
                String zooName = zoo.getName();
                System.out.println(i + "." + zooName);
            }
        }
    }

    public void addZooWithAName() {
        System.out.println("Add a name for your zoo");
        Scanner zooNameInput = new Scanner(System.in);
        String zooName = zooNameInput.nextLine();
        Zoo zoo = new Zoo();

        for (Zoo availableZoo : zoos) {
            String nameOfZooInZoos = availableZoo.getName();
            if (zooName.equals(nameOfZooInZoos)) {
                System.out.println("The zoo already exits. Use another name!");
                return;

            }
        }
        zoo.setName(zooName);
        zoos.add(zoo);
    }

    public void removeZoo() {
        Scanner zooNameInput = new Scanner(System.in);

        System.out.println("Which zoo do you want to delete?");
        String zooNameToDelete = zooNameInput.nextLine();

        zoos.removeIf(zoo -> zoo.getName().equals(zooNameToDelete));
    }

    public void visitZoo() {
        Scanner zooCodeNameInput = new Scanner(System.in);
        int code = zooCodeNameInput.nextInt();

        System.out.println("Select which zoo do you want to visit?");

        Zoo zoo;

        try {
            zoo = zoos.get(code - 1);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid number! Exit the program.");

        }

    }
}
