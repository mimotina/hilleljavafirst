package animal;

import animal.abstracts.Behavior;

public class Children implements Behavior {

 public String childName;
    public Children(String childName){
       this.childName =childName;
    }

    @Override
    public String action() {
        return childName()+" jump";
    }

    @Override
    public String childName() {
        return childName;
    }

  /*  @Override
    public void eat() {
        Behavior.super.eat();
    }*/
}
