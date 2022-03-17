package Animal;

public class Cats extends HomeAnimal{
    public String food;

    public Cats(String name, String breed, String color, String gender, String food) {
        super(name, breed, color, gender);
        this.food = food;
    }

    @Override
    public String toString() {
        return String.format("Name %s, Breed  %s, Color %s, gender %s", name, breed, color, gender);
    }

}
