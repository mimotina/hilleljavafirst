import Animal.Cats;

public class Main {
    public static void main(String[] args) {
        Cats cat = new Cats("Liza", "british", "grey", "female");
        Cats cat1 = new Cats("Liza", "british", "grey", "female") ;
        cat.voice();
        System.out.println(cat);
        System.out.println(cat.equals(cat1));
    }
}
