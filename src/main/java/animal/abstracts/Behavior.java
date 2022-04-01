package animal.abstracts;

public interface Behavior {

    String action();
    String childName();
    default void eat(){
        System.out.println(childName()+" eat");
    }
}
