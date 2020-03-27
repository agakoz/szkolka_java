package pl.accenture.szkolka.oo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoatTest {

    @Test
    void startEngine() {
        assertEquals(Boat.START_BOAT, new Boat().startEngine());
    }

    @Test
    void startSailing() {
        assertEquals(Boat.SAIL, new Boat().startSailing());
    }
}