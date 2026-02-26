package Tamagotchi;

public abstract class BaseClass {

    private String name;
    private int energy;


    public BaseClass(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String getName(){
        return this.name;
    }

    public int getEnergy() {
        return this.energy;
    }

    protected abstract String getDetails();


    public String getDescription(){
        return "Name: " + getName() + "Energy level: " + getEnergy() + getDetails();

    }



}

