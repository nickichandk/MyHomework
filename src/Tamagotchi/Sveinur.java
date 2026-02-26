package Tamagotchi;

public class Sveinur extends BaseClass {
    private int hit;

    public Sveinur(String name, int energy, int hit){
        super(name, energy);
        this.hit = hit;
    }


    @Override
    protected String getDetails() {
        return " | Hit points " + hit;
    }


}
