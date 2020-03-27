package pl.accenture.szkolka.oo.model;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {


    @org.junit.jupiter.api.Test
    void startEngine() {
        assertEquals(Vehicle.START_VEHICLE, new Vehicle().startEngine());
    }
}