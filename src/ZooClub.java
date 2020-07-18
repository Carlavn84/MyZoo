import java.util.LinkedList;
import java.util.Scanner;

public class ZooClub {
    private LinkedList<Zoo> zoos = new LinkedList<Zoo>();

    public ZooClub() {
    }

    public LinkedList<Zoo> getZoos() {
        return zoos;
    }

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
        System.out.print("Add a name for your zoo: ");
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

    public void removeZoo(Zoo zoo) {
        zoos.remove(zoo);

    }

    public void visitZoo(Zoo zoo) {
        System.out.println(zoo.getName() + "  has  " + zoo.getAnimals().size() + " pet(s)");
        for (Animal animal : zoo.getAnimals()) {
            System.out.println(animal.getName() + " " + "is a" + " " + animal.getAnimalType() + " and has" + " " + animal.getLegs() + " " + "leg(s)");
        }
    }
}

