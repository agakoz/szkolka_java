package pl.accenture.szkolka.oo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @Test
    void startEngine() {
        assertEquals(Plane.START_PLANE, new Plane().startEngine());
    }

    @Test
    void fly() {
        assertEquals(Plane.FLY, new Plane().fly());
    }
}