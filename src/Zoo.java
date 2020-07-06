import java.util.LinkedList;
import java.util.Scanner;

public class Zoo {

    private static void OptionList() {
        String[] options = {"Quit the program", "Cat", "Dog", "Fish", "Spider", "Snake", "Panda",};

        for (int i = 0; i < options.length; i++) {
            System.out.println(i + "." + options[i + 0]);
        }
    }

    private static void AddPet() {
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

        AddPet();
    }
}

