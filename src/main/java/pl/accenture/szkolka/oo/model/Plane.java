package pl.accenture.szkolka.oo.model;

public class Plane extends Vehicle {
    public static final String START_PLANE = "plane engine started";
    public static final String FLY =  "I'm flying";

    @Override
    public String startEngine() {
        return START_PLANE;
    }
    public String fly(){
        return FLY;
    }
}
