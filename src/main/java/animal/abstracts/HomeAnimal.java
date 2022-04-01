package animal.abstracts;


public abstract class HomeAnimal {
    private String name;
    private String breed;
    private String color;
    private String gender;

    public HomeAnimal(String name, String breed, String color, String gender) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public abstract String action();

}