public class Drink {
    // Attributes
    String name;
    String flavour;
    float volume;

    public void takeADrink() {
        volume = volume - 30;
        System.out.println("There is now " + volume + " ml left of the " + name);
    }

}
