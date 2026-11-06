public class App {
    public static void main(String[] args) throws Exception {

        // creazione istanza oggetto di classe Restaurant
        Restaurant montezemolo = new Restaurant("Montezemolo", "piazza Unità d'Italia", "Palermo", 2, 2);

        // stampa info istanza oggetto di classe Restaurant
        System.out.println("Ristorante " + montezemolo.getName() + ", " + montezemolo.getAddress() + ", " + montezemolo.getCity()+ ".");

        montezemolo.addDish(new Dish("Pizza Margherita", 8.5, "pomodoro, mozzarella, basilico"));
        montezemolo.addDish(new Dish("Pasta Carbonara", 5.0, "Spaghetti, uova, guanciale, pecorino, pepe"));

        montezemolo.addDrink(new Drink("Acqua", 2.0));
        montezemolo.addDrink(new Drink("Birra", 4.5));

        montezemolo.stampaMenu();

    }
}
