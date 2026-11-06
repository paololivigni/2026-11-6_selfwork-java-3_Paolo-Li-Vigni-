// creazione classe Restaurant

public class Restaurant {

    // attributi Restaurant
    private String name;
    private String address;
    private String city;
    private Dish[] dishes;
    private Drink[] drinks;
    private int dishCount;
    private int drinkCount;

    // costruttore Restaurant
    public Restaurant(String name, String address, String city, int maxDishes, int maxDrinks){

        this.name = name;
        this.address = address;
        this.city = city;
        this.dishes = new Dish[maxDishes];
        this.drinks = new Drink[maxDrinks];
        this.dishCount = 0;
        this.drinkCount = 0;

    }

    // getter & setter attributi classe Restaurant

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void addDish(Dish dish) {
        if (dishCount < dishes.length) {
            dishes[dishCount] = dish;
            dishCount++;
        } else {
            System.out.println("Spazio piatti esaurito: " + dish.getName() + " non aggiunto");
        }
    }

    public void addDrink(Drink drink) {
        if (drinkCount < drinks.length) {
            drinks[drinkCount] = drink;
            drinkCount++;
        } else {
            System.out.println("Spazio drink esaurito: " + drink.getName() + " non aggiunto");
        }
    }

    public void stampaMenu() {
        System.out.println(name);

        System.out.println("Piatti:");
        for (int i = 0; i < dishCount; i++) {
            System.out.println(dishes[i].getName() + " - " + dishes[i].getPrice() + " €");
        }

        System.out.println("Drink:");
        for (int i = 0; i < drinkCount; i++) {
            System.out.println(drinks[i].getName() + " - " + drinks[i].getPrice() + " €");
        }
    }
}


