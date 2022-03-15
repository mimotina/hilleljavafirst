package Animal;

import java.util.Objects;

public class Cats {
    String name;
    String breed;
    String color;
    String gender;

    public Cats(String name, String breed, String color, String gender){
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gender=  gender;
    }
    public Cats(){}

    public void voice(){
        System.out.println("It have voice");
    }

    @Override
    public String toString() {
        return String.format("Name %s, Breed  %s, Color %s, gender %s", name, breed, color, gender);
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cats cats = (Cats) o;
        return Objects.equals(name, cats.name) && Objects.equals(breed, cats.breed) && Objects.equals(color, cats.color) && Objects.equals(gender, cats.gender);
    }


}
