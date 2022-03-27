package animal;

import animal.abstracts.HomeAnimal;

public class Dogs extends HomeAnimal {
    public int Size;

    public Dogs(String name, String breed, String color, String gender, int Size) {
        super(name, breed, color, gender);
        this.Size = Size;
    }

}
