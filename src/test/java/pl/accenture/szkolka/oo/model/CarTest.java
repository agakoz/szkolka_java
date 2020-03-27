package pl.accenture.szkolka.oo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void startEngine() {
        assertEquals(Car.START_CAR, new Car().startEngine());
    }

    @Test
    void drive() {
        assertEquals(Car.DRIVE, new Car().drive());
    }
}