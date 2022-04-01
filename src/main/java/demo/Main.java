package demo;
import animal.Cats;
import animal.Children;
import animal.Dogs;
import animal.Hamster;


public class Main {
    public static void main(String[] args) throws Exception {
        Cats cat = new Cats("Liza", "british", "grey", "female", "Sheba");
        Dogs dog = new Dogs("Baron", "german", "brown", "male", 56);
        Hamster hamster = new Hamster("Rex", "djungarik", "white", "male", "has wool", "one month");
        cat.voice();
        cat.printName();
        System.out.println(dog.action());
        hamster.eatcorn();

        Children child = new Children("Tom");
        child.eat();
        System.out.println(child.action());


        System.out.println(hamster.getYear()+" new year");
        String newYear = "2 months";
        if (!hamster.getYear().equals(newYear)) hamster.setYear(newYear);
        System.out.println(hamster.getYear());

    }
}
