package pl.cdv.extended;

public class Main {

    public static void main(String[] args) {
        Human human = new Human("Człowiek");
        SuperHero superMan = new SuperHero("Superman", "flying");
        System.out.println("Power of " +superMan.name + " is " + superMan.superPower);
    }
}
