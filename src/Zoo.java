import java.util.LinkedList;
import java.util.Scanner;

public class Zoo {
    private static <animalInput> void AddPet() {
        Scanner input = new Scanner(System.in);

        LinkedList<Animal> animals = new LinkedList<Animal>();

        int amountOfPets = 0;

        System.out.println("You have" + " " + amountOfPets + " " + "pet(s)");

        while (true) {
            System.out.println("Which pet do you want to add?");

            System.out.println("1.Cat\n2.Dog\n3.Fish\n4.Spider\n5.Snake\n6.Panda\n0.Quit program");

            Animal animalInput;

            System.out.println("Enter the number:");
            int code = input.nextInt();
            input.nextLine();

            switch (code) {
                case 1:
                    animalInput = new Animal("cat", 4);
                    break;
                case 2:
                    animalInput = new Animal("dog", 4);
                    break;
                case 3:
                    animalInput = new Animal("fish", 0);
                    break;
                case 4:
                    animalInput = new Animal("spider", 8);
                    break;
                case 5:
                    animalInput = new Animal("snake", 0);
                    break;
                case 6:
                    animalInput = new Animal("panda", 4);
                    break;
                default:
                    return;
            }

            animals.add(animalInput);

            amountOfPets += 1;

            System.out.println("How do you want to call your" + " " + animalInput.getAnimalType() + "?");
            String nameInput = input.nextLine();
            animalInput.setName(nameInput);

            System.out.println("You have " + " " + amountOfPets + " " + "pet(s)");

            for (Animal animal : animals) {
                System.out.println(animal.getName() + " " + "is a" + " " + animal.getAnimalType() + " and has" + " " + animal.getLegs() + " " + "leg(s)");
            }
        }
    }

    public static void main(String[] args) {

        AddPet();
    }
}

