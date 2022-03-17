package Animal;

public final class Hamster extends Mouse {
    public String wool;

    public Hamster(String name, String breed, String color, String gender, String wool) {
        super(name, breed, color, gender);
        this.wool= wool;
    }
}
