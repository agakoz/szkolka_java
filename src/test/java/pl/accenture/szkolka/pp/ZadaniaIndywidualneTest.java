package pl.accenture.szkolka.pp;

import io.github.netmikey.logunit.api.LogCapturer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.*;

class ZadaniaIndywidualneTest {
    @RegisterExtension
    LogCapturer logs = LogCapturer.create().captureForType(ZadaniaIndywidualne.class);

    // TODO 3 utwórz testy dla metod z punktu 2
    @Test
    void getMyByte() {
        //given static variable of a type byte in a class
            var givenValue = ZadaniaIndywidualne.myByte;
        //when
            var returnedValue = ZadaniaIndywidualne.getMyByte();
        //then
        assertEquals(givenValue, returnedValue);
    }

    @Test
    void getMyShort() {
        //given static variable of a type short in a class
        var givenValue = ZadaniaIndywidualne.myShort;
        //when method get returns the value of the variable
        var returnedValue = ZadaniaIndywidualne.getMyShort();
        //then
        assertEquals(givenValue, returnedValue);
    }
    @Test
    void getMyInteger(){
        //given static variable of a type integer in a class
        var givenValue = ZadaniaIndywidualne.myInteger;
        //when method get returns the value of the variable
        var returnedValue = ZadaniaIndywidualne.getMyInteger();
        //then
        assertEquals(givenValue, returnedValue);
    }

    @Test
    void getMyLong(){
        //given static variable of a type integer in a class
        var givenValue = ZadaniaIndywidualne.myLong;
        //when method get returns the value of the variable
        var returnedValue = ZadaniaIndywidualne.getMyLong();
        //then
        assertEquals(givenValue, returnedValue);
    }
    @Test
    void getMyFloat(){
        //given static variable of a type integer in a class
        var givenValue = ZadaniaIndywidualne.myFloat;
        //when method get returns the value of the variable
        var returnedValue = ZadaniaIndywidualne.getMyFloat();
        //then
        assertEquals(givenValue, returnedValue);
    }

    @Test
    void getMyDouble(){
        //given static variable of a type integer in a class
        var givenValue = ZadaniaIndywidualne.myDouble;
        //when method get returns the value of the variable
        var returnedValue = ZadaniaIndywidualne.getMyDouble();
        //then
        assertEquals(givenValue, returnedValue);
    }

    @Test
    void getMyChar(){
        //given static variable of a type integer in a class
        var givenValue = ZadaniaIndywidualne.myChar;
        //when method get returns the value of the variable
        var returnedValue = ZadaniaIndywidualne.getMyChar();
        //then
        assertEquals(givenValue, returnedValue);
    }

    @Test
    void isMyBool(){
        //given static variable of a type integer in a class
        var givenValue = ZadaniaIndywidualne.myBool;
        //when method get returns the value of the variable
        var returnedValue = ZadaniaIndywidualne.isMyBool();
        //then
        assertEquals(givenValue, returnedValue);
    }

    @Test
    void hello() {
        //given
        String shouldDisplay = "Hello";
        //when
        ZadaniaIndywidualne.hello();
        // then
        logs.assertContains(shouldDisplay);

    }

    @Test
    @DisplayName("Lukasz -> Hello Lukasz")
    void helloZImieniem() {
        // given
        var name = "Lukasz";
        // when
        ZadaniaIndywidualne.hello(name);
        // then
        logs.assertContains("Hello Lukasz");
    }

    @Test
    @DisplayName("Agata -> Hello Agata")
    void returnHello() {
        // given
        String shouldReturn = "Hello Agata";
        String name = "Agata";
        // when
        String returnedValue = ZadaniaIndywidualne.returnHello(name);
        // then
        assertEquals(shouldReturn, returnedValue);
    }
}