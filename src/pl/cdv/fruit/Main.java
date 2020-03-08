package pl.cdv.fruit;

public class Main {

    public static void main(String[] args) {

        Fruit apple = new Apple("japko");
        Fruit pineapple = new Pineapple("ananas");
        Fruit strawberry = new Strawberry("truskawka");

        Fruit [] fruits = {apple, pineapple, strawberry};

        for ( Fruit fruit : fruits)
        {
            System.out.println(fruit.getName());

        }

        }

}

