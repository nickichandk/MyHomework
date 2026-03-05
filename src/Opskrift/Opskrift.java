package Opskrift;

public class Opskrift {

    private String title;
    private String ingredienser;
    private String fremgansmåde;
    private String kategori;


    public Opskrift(String title, String ingredienser, String fremgansmåde, String kategori){
        this.title = title;
        this.ingredienser = ingredienser;
        this.fremgansmåde = fremgansmåde;
        this.kategori = kategori;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(){
        this.title = title;
    }

    public String getIngredienser(){
        return ingredienser;
    }

    public void setIngredienser(){
        this.ingredienser = ingredienser;
    }

    public String getFremgansmåde(){
        return fremgansmåde;
    }

    public void setFremgansmåde(){
        this.fremgansmåde = fremgansmåde;
    }

    public String getKategori(){
        return kategori;
    }


    @Override
    public String toString(){
        return "Title: " + title + " | Ingredienser: " + ingredienser + " | Fremgangsmåde: " + fremgansmåde + " | Kategori " + kategori;
    }









}
