import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Zoo {

    private LinkedList<Animal> animals = new LinkedList<Animal>();

    private String zooName;

    public Zoo() {
    }

    public String getName() {
        return this.zooName;
    }

    public void setName(String name) {
        this.zooName = name;
    }

  public List<Animal> getAnimals(){
        return  this.animals;
  }

      public void createPets(Class<? extends Animal> pet) {
        Scanner input = new Scanner(System.in);

        Animal animal;

        try {
            animal = pet.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Oh oh, something went wrong", e);
        }

        animals.add(animal);

        String nameInput;
        String animalType = pet.getSimpleName();

        System.out.println("How do you want to call your " + animalType + " ?");
        nameInput = input.nextLine();
        animal.setName(nameInput);

    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);

    }
}

