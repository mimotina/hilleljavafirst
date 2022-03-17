package Animal;

public abstract class HomeAnimal {
    String name;
    String breed;
    String color;
    String gender;

    public HomeAnimal(String name, String breed, String color, String gender) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
    }
    public void voice() {
        System.out.println(breed + " miau");
    }
}