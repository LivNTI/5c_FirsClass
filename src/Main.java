public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Drink drink1 = new Drink();

        drink1.name = "coca cola";
        drink1.flavour = "cola";
        drink1.volume = 330;

        System.out.println(drink1.name + " tastes like " + drink1.flavour + " and is " + drink1.volume + " ml");


        Drink drink2 = new Drink();
        drink2.name = "Fanta";
        drink2.flavour = "oranges";
        drink2.volume = 1500;

        System.out.println(drink2.name + " tastes like " + drink2.flavour + " and is " + drink2.volume + " ml");

        drink1.volume = drink1.volume - 30;
        System.out.println("You drink 30 ml from " + drink1.name + " there is " + drink1.volume + " left");

        drink2.takeADrink();


    }
}