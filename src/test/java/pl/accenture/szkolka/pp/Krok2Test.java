package pl.accenture.szkolka.pp;

import io.github.netmikey.logunit.api.LogCapturer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Krok2Test {
    @RegisterExtension
    LogCapturer logs = LogCapturer.create().captureForType(Krok2.class);

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

    @Test
    @DisplayName("8 -> 8 9 10")
    void showAllNumbersUpToTen() {
        Krok2.showAllNumbersUpToTen(8);
        logs.assertContains("8");
        logs.assertContains("9");
        logs.assertContains("10");

    }

    @Test
    @DisplayName("Kratka -> Kr")
    void cutStringTillFirsLetterA() {
        //given
        String wordToCut = "Kratka";
        String expectedWord = "Kr";
        //when
        String returnedWord = Krok2.cutStringBeforeFirsLetterA(wordToCut);
        //then
        assertEquals(expectedWord, returnedWord);

    }

    @Test
    @DisplayName("2,7,2 -> 2,2")
    void cutSevenFromList() {
        //given
        List<Integer> listToChange = new ArrayList<>();
        listToChange.add(2);
        listToChange.add(7);
        listToChange.add(2);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(2);
        //when
        List<Integer> returnedList = Krok2.cutSevenFromList(listToChange);
        //then
        assertEquals(expectedList, returnedList);
    }

    @Test
    void logAll() {
        //given
        String [] toLog = new String[]{"one", "two"};
        Krok2.logAll(toLog);
        logs.assertContains("one");
        logs.assertContains("two");

    }

    @Test
    void logAllFromTables() {
        //given
        Integer[][][] testTable = {
                {
                        {1, 2}, {3, 4}
                },
                {
                        {5, 6}, {7, 8}
                }
        };
        String expectedString = "1-2-3-4-5-6-7-8";
        //when
        Krok2.logAllFromTables(testTable);
        //then
        logs.assertContains(expectedString);
    }
}