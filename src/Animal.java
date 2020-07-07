public abstract class Animal {

    private String name;
    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return this.legs;
    }

    public abstract String getAnimalType();
}

