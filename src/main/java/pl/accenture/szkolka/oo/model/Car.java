package pl.accenture.szkolka.oo.model;

public class Car extends Vehicle {
    public static final String START_CAR = "car engine started";
    public static final String DRIVE = "I'm driving";

    @Override
    public String startEngine() {
        return START_CAR;
    }

    public String drive(){
        return DRIVE;
    }
}
