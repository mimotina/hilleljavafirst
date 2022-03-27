package animal;

import animal.abstracts.Mouse;

public final class Hamster extends Mouse {
    public String wool;
    private String year;

    public Hamster(String name, String breed, String color, String gender, String wool, String year) {
        super(name, breed, color, gender);
        this.wool= wool;
        this.year = year;
    }
    public void setYear(String year) throws Exception {
        if (null !=year){
        this.year = year;}
        else throw new Exception("Alarm");
    }
    public String getYear(){
        return year;
    }
}
