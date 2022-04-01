package animal;

import animal.abstracts.HomeAnimal;

public class Cats extends HomeAnimal {
    public String food;


    public Cats(String name, String breed, String color, String gender, String food) {
        super(name, breed, color, gender);
        this.food = food;
    }
    public void voice() {
        System.out.println(getBreed() + " miau");
    }
public void printName (){
    System.out.println(getName());
}

    @Override
    public String action() {
        return null;
    }
}
