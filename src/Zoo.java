import java.util.*;

public class Zoo {

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

    private void showOptions(List<Class<? extends Animal>> animalList) {
        for (int i = 1; i <= animalList.size(); i++) {
            Class<? extends Animal> animalType = animalList.get(i - 1);
            String typeName = animalType.getSimpleName();
            System.out.println(i + "." + typeName);
        }
    }

//    private List<Class<? extends Animal>> makeAnimalList() {
//        List<Class<? extends Animal>> animalList = new ArrayList<>(animalClasses);
//        System.out.println("This is animalList" + animalList);
//        return animalList;
//}


//    private void showOptions(List<Class<? extends Animal>> animalList) {
//        ListIterator<Class<? extends Animal>> iterator = animalList.listIterator();
//
//        while (iterator.hasNext()) {
//
//                System.out.println(iterator.nextIndex() + "." + iterator.next());
//        }
//    }

    private void doEverything(List<Class<? extends Animal>> animalList) {
        Scanner input = new Scanner(System.in);

        LinkedList<Animal> animals = new LinkedList<Animal>();

        while (true) {

            System.out.println("You have " + animals.size() + " pet(s)");

            for (Animal animal : animals) {
                System.out.println(animal.getName() + " " + "is a" + " " + animal.getAnimalType() + " and has" + " " + animal.getLegs() + " " + "leg(s)");
            }


            System.out.println("Which pet do you want to add?");


            Animal animalInput;

            System.out.println("Enter the number:");
            int code = input.nextInt();
            input.nextLine();

            Class<? extends Animal> clazz;

            try {
                clazz = animalList.get(code - 1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid number! You are not very smart. I will just give you a panda.");
                clazz = Panda.class;
            }

            try {
                animalInput = clazz.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw new RuntimeException("Oh oh, something went wrong", e);
            }

            animals.add(animalInput);

            System.out.println("How do you want to call your " + animalInput.getAnimalType() + " ?");
            String nameInput = input.nextLine();
            animalInput.setName(nameInput);
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.showOptions(animalClasses);
        zoo.doEverything(animalClasses);
    }
}
