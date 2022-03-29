package animal.abstracts;


public abstract class HomeAnimal {
    private String name;
    String breed;
    String color;
    String gender;

    public HomeAnimal(String name, String breed, String color, String gender) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
    }

    public void action() {
        System.out.println(name + " run");
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}