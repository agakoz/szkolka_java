package pl.accenture.szkolka.pp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Krok2Test {
    @Test
    @DisplayName("18 -> true")
    void checkIfAdultTrue() {
        //given
        int age = 18;
        //when age of the adulthood starts from 18
        //then
        assertTrue(Krok2.checkIfAdult(age));
    }

    @Test
    @DisplayName("17 -> false")
    void checkIfAdultFalse() {
        //given
        int age = 17;
        //when age of the adulthood starts from 18
        //then
        assertFalse(Krok2.checkIfAdult(age));
    }

    @Test
    @DisplayName("1 -> january")
    void returnMonthName() {
        //given
        int monthNum = 1;
        String expectedName = "january";
                //when
        String returnedName = Krok2.returnMonthName(monthNum);
        //then
        assertEquals(expectedName, returnedName);
    }
}