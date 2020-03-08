package pl.cdv.fruit;

public class Fruit {

    String fruitName;

    public Fruit(String fruitName) {

        this.fruitName = fruitName;
    }

    protected String getName() {

        return fruitName;

    }
}
