package Tamagotchi;

public class Steen extends BaseClass {
    private int cry;

    public Steen(String name, int energy, int cry){
        super(name, energy);
        this.cry = cry;
    }


    @Override
    protected String getDetails() {
        return " | Crying time: " + cry;
    }
}
