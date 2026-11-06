// creazione sottoclasse Dish

public class Dish extends Product{

    // attributi classe Dish
    private String ingredients;

    
    // costruttore completo classe Dish
    public Dish(String name, double price, String ingredients){

        super(name, price);
        this.ingredients = ingredients;

    }


    // getter & setter attributi Dish

    public String getIngredients(){
        return ingredients;
    }

    public void setIngredients(String ingredients){
        this.ingredients = ingredients;
    }

}
