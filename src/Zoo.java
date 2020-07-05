import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Zoo {
    private static void AddPet() {
        Scanner input = new Scanner(System.in);

        Map<String, Animal> map = new Hashtable<String, Animal>();

        int amountOfPets = 0;

        System.out.println("You have" + " " + amountOfPets + " " + "pet(s)");

        while (amountOfPets >= 0) {
            System.out.println("Which pet do you want to add?");

            System.out.println("1.Cat\n2.Dog\n3.Fish\n4.Spider\n5.Snake\n6.Panda\n0.Quit program");

            Animal animalInput = new Animal();

            System.out.println("Enter the number:");
            int code = input.nextInt();
            animalInput.name = input.nextLine();

            switch (code) {
                case 1:
                    animalInput.animalType = "cat";
                    amountOfPets += 1;
                    animalInput.legs = 4;
                    map.put(animalInput.animalType, animalInput);
                    break;
                case 2:
                    animalInput.animalType = "dog";
                    amountOfPets += 1;
                    animalInput.legs = 4;
                    map.put(animalInput.animalType, animalInput);
                    break;
                case 3:
                    animalInput.animalType = "fish";
                    amountOfPets += 1;
                    animalInput.legs = 0;
                    map.put(animalInput.animalType, animalInput);

                    break;
                case 4:
                    animalInput.animalType = "spider";
                    amountOfPets += 1;
                    animalInput.legs = 8;
                    map.put(animalInput.animalType, animalInput);
                    break;
                case 5:
                    animalInput.animalType = "snake";
                    amountOfPets += 1;
                    animalInput.legs = 0;
                    map.put(animalInput.animalType, animalInput);
                    break;
                case 6:
                    animalInput.animalType = "panda";
                    amountOfPets += 1;
                    animalInput.legs = 4;
                    map.put(animalInput.animalType, animalInput);
                    break;
                default:
                    return;
            }


            System.out.println("How do you want to call your" + " " + animalInput.animalType + "?");
            String nameInput = input.nextLine();
            animalInput.name = nameInput;

            System.out.println("You have " + " " + amountOfPets + " " + "pet(s)");

            for (Map.Entry<String, Animal> entry : map.entrySet()) {
                Animal animal = entry.getValue();
                System.out.println(animal.name + " " + "is a" + " " + animal.animalType + " and has" + " " + animal.legs + " " + "leg(s)");
            }

        }
    }

    public static void main(String[] args) {

        AddPet();


    }
}

