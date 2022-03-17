package Animal;

public abstract class Mouse extends HomeAnimal{
    public Mouse(String name, String breed, String color, String gender) {
        super(name, breed, color, gender);
    }

    public void eatcorn(){
        System.out.println(name+" eat corn");
    }
}
