package pl.accenture.szkolka.pp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Krok2 {
    private static final Logger LOG = Logger.getLogger("pl.accenture.szkolka.pp.Krok2");

    // Wszystkie implementacje - razem z testami JUnit
// Done 1 zaimplementuj metodę z uzyciem if
    public static boolean checkIfAdult(int age) {
        if (age >= 18) return true;
        else return false;

    }
// done 2 zaimplementuj metodę z uzyciem switch

    public static String returnMonthName(int monthNum) {
        switch (monthNum) {
            case 1:
                return "january";

            case 2:
                return "february";

            case 3:
                return "march";

            case 4:
                return "april";

            case 5:
                return "may";

            case 6:
                return "june";

            case 7:
                return "july";

            case 8:
                return "august";

            case 9:
                return "september";

            case 10:
                return "october";

            case 11:
                return "november";

            case 12:
                return "december";

            default:
                return "error";


        }
    }


    // done 2 zaimplementuj metodę z uzyciem (do) while
    public static void showAllNumbersUpToTen(int number) {
        do {
            LOG.log(Level.INFO, Integer.toString(number));
            number++;
        } while (number <= 10);
    }

    // done 3 zaimplementuj metodę z uzyciem for i break
    public static String cutStringBeforeFirsLetterA(String sentWord) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < sentWord.length(); i++) {
            if (sentWord.toUpperCase().charAt(i) == 'A') break;

            newString.append(sentWord.toString().charAt(i));
        }
        return newString.toString();

    }
// done 4 zaimplementuj metodę z uzyciem foreach i continue

    public static List<Integer> cutSevenFromList(List<Integer> listToBeChanged) {
        List<Integer> newList = new ArrayList<>();
        for (int num : listToBeChanged) {
            if(num == 7) continue;
            newList.add(num);
        }
        return newList;
    }

// done 5 Zaimplementuj dowolną metodę przyjmującą jako parametr vararg
    public static void logAll(String ... toLog){
        for (String info : toLog) {
            LOG.log(Level.INFO, info);
        }
    }
/*
        TODO 6 Zaimplementuj w metodę, która przeiteruje po poniższych tablicach i zaloguje wartości (przykład poniżej):
          1-2-3-4-5-6-7-8
          ...{
                {
                    {1,2}, {3,4}
                },
                {
                    {5,6}, {7,8}
                }
            };
 */
}
