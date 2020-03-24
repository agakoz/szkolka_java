package pl.accenture.szkolka.pp;

public class ZadaniaIndywidualne {
    // DONE 1 zadeklaruj zmienne z typami prostymi występującymi z Javie
    //stałoprzecinkowe
    public static byte myByte = 1;
    public static short myShort = 2;
    public static int myInteger = 3;
    public static long myLong = 4;
    //zmiennoprzecinkowe
    public static float myFloat = 5;
    public static double myDouble = 6.6;
    //znakowy
    public static char myChar = 7;
    //logiczny
    public static boolean myBool = true;

    // TODO 2 zadeklaruj metody zwracające te zmienne
    public static byte getMyByte() {
        return myByte;
    }

    public static short getMyShort() {
        return myShort;
    }

    public static int getMyInteger() {
        return myInteger;
    }

    public static long getMyLong() {
        return myLong;
    }

    public static float getMyFloat() {
        return myFloat;
    }

    public static double getMyDouble() {
        return myDouble;
    }

    public static char getMyChar() {
        return myChar;
    }

    public static boolean isMyBool() {
        return myBool;
    }
    // TODO 3 utwórz testy dla metod z punktu 2

    // TODO 4 utwórz metodę void wypisującą do loggera "Hello"

    // TODO 5 utwórz metodę void wypisującą do loggera "Hello " + przekazany do metody argument (string)

    // TODO 6 utwórz metodę zwracającą  "Hello " + przekazany do metody argument (string)

    /*
            TODO 7 utwórz testy dla metod z punktów 4-6 dla testowania logowanych wartości, użyj
            https://github.com/netmikey/logunit
     */
}
