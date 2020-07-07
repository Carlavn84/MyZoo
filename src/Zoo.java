import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Zoo {

    private static Set<Class<? extends Animal>> animalClasses;

    static {
        animalClasses = new HashSet();
        animalClasses.add(Cat.class);
        animalClasses.add(Dog.class);
        animalClasses.add(Fish.class);
        animalClasses.add(Spider.class);
        animalClasses.add(Snake.class);
        animalClasses.add(Panda.class);
    }

    private void OptionList() {
        for (Class animalClass : animalClasses) {
            String animalNameClass = animalClass.getSimpleName();

            switch (animalNameClass) {
                case "Cat":
                    System.out.println("1. Cat");
                    break;
                case "Dog":
                    System.out.println("2. Dog");
                    break;
                case "Fish":
                    System.out.println("3. Fish");
                    break;
                case "Spider":
                    System.out.println("4. Spider");
                    break;
                case "Snake":
                    System.out.println("5. Snake");
                    break;
                case "Panda":
                    System.out.println("6. Panda");
                    break;
                default:
                    return;
            }
        }
    }

    private void AddPet() {
        Scanner input = new Scanner(System.in);

        LinkedList<Animal> animals = new LinkedList<Animal>();

        int amountOfPets = 0;

        System.out.println("You have" + " " + amountOfPets + " " + "pet(s)");

        while (true) {
            System.out.println("Which pet do you want to add?");

            OptionList();

            Animal animalInput;

            System.out.println("Enter the number:");
            int code = input.nextInt();
            input.nextLine();

            switch (code) {
                case 1:
                    animalInput = new Cat();
                    break;
                case 2:
                    animalInput = new Dog();
                    break;
                case 3:
                    animalInput = new Fish();
                    break;
                case 4:
                    animalInput = new Spider();
                    break;
                case 5:
                    animalInput = new Snake();
                    break;
                case 6:
                    animalInput = new Panda();
                    break;
                default:
                    return;
            }

            animalInput.getAnimalType();

            animals.add(animalInput);

            amountOfPets += 1;

            System.out.println("How do you want to call your" + " " + animalInput.getAnimalType() + " " + "?");
            String nameInput = input.nextLine();
            animalInput.setName(nameInput);

            System.out.println("You have " + " " + amountOfPets + " " + "pet(s)");

            for (Animal animal : animals) {
                System.out.println(animal.getName() + " " + "is a" + " " + animalInput.getAnimalType() + " and has" + " " + animal.getLegs() + " " + "leg(s)");
            }
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.AddPet();
    }
}

