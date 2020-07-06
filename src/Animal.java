public class Animal {

    public String getAnimalType() {
        return animalType;
    }

    private String animalType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getLegs() {
        return legs;
    }

    private int legs;

    public Animal(String animalType, int legs) {
        this.animalType = animalType;
        this.legs = legs;
    }
}
