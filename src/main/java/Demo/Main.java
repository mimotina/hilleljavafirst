package Demo;

import Animal.Cats;
import Animal.Dogs;
import Animal.Hamster;

public class Main {
    public static void main(String[] args) {
        Cats cat = new Cats("Liza", "british", "grey", "female", "Sheba");
        Dogs dog = new Dogs("Baron", "german", "brown", "male", 56);
        Hamster hamster = new Hamster("Rex", "djungarik", "white", "male", "has wool");
        cat.voice();
        dog.voice();
        hamster.eatcorn();
        hamster.voice();

    }
}
