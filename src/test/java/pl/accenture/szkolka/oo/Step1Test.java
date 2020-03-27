package pl.accenture.szkolka.oo;

import org.junit.jupiter.api.Test;
import pl.accenture.szkolka.oo.model.*;

import static org.junit.jupiter.api.Assertions.*;

class Step1Test {

    @Test
    void runVehicle() {
        //given
        String expectedCar = Car.START_CAR + Step1.COMA_SEPARATOR + Car.DRIVE;
        String expectedBoat = Boat.START_BOAT + Step1.COMA_SEPARATOR + Boat.SAIL;
        //when
        String givenCar = Step1.runVehicle(new Car());
        String givenBoat = Step1.runVehicle(new Boat());
        //then
        assertEquals(expectedCar, givenCar);
        assertEquals(expectedBoat, givenBoat);
    }

    @Test
    void runAllVehicles() {
        //given
        String expected = Step1.runVehicle(Step1.VEHICLE_LIST[0])
                + Step1.COMA_SEPARATOR + Step1.runVehicle(Step1.VEHICLE_LIST[1])
                + Step1.COMA_SEPARATOR + Step1.runVehicle(Step1.VEHICLE_LIST[2]);
        //when
        String given = Step1.runAllVehicles(Step1.VEHICLE_LIST);
        //then
        assertEquals(expected, given);
    }


}