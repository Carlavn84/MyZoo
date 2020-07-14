import java.util.List;
import java.util.Scanner;


public class UserInterface {

    public void welcomeToTheZoo() {
        System.out.println("Hello there! Welcome to all wonderful zoos in the world!!!");

    }


    public void showOptions(List<Class<? extends Animal>> animalList) {
        System.out.println("Which pet do you want to add?");

        for (int i = 1; i <= animalList.size(); i++) {
            Class<? extends Animal> animalType = animalList.get(i - 1);
            String typeName = animalType.getSimpleName();
            System.out.println(i + "." + typeName);
        }
    }

    public void selectMenuZoo(){
        ZooClub zooClub = new ZooClub();

        Zoo zoo = new Zoo();
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

                zoo.showPets(zooClub.visitZoo());
                break;
            case 0:
                System.exit(0);
                break;
        }
    }





}
