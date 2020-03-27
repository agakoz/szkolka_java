package pl.accenture.szkolka.oo.model;

public class Boat extends Vehicle {
    public static final String START_BOAT= "boat engine started";
    public static final String SAIL =  "I'm sailing";

    @Override
    public String startEngine() {
        return START_BOAT;
    }
    public String sail(){
        return SAIL;
    }
}
