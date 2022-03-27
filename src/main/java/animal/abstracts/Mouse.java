package animal.abstracts;

import animal.abstracts.HomeAnimal;

public abstract class Mouse extends HomeAnimal {
    public Mouse(String name, String breed, String color, String gender) {
        super(name, breed, color, gender);
    }

    public void eatcorn(){
        System.out.println(getName()+" eat corn");
    }
}
