import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("unit test")
class ConversionTest {

    // testing for normal behavior

    @Test
    @DisplayName("32 farenheit is 0 celcius")
    void farenheitToCelcius(){
        assertEquals(0, Conversion.convertF2C("32"), 0.01);
    }

    @Test
    @DisplayName("0 celcius is 32 farenheit")
    void celciusToFarenheit(){
        assertEquals(32, Conversion.convertC2F("0"), 0.01);
    }

    @Test
    @DisplayName("12 inches is 30.48 centimeters")
    void incheToCentimeter(){
        assertEquals(30.48, Conversion.convertIn2Cm("12"), 0.01);
    }

    @Test
    @DisplayName("30.48 centimeters is 12 inches")
    void centimeterToInche(){
        assertEquals(12, Conversion.convertCm2In("30.48"), 0.01);
    }

    @Test
    @DisplayName("6 feet is 1.82 meters")
    void feetToMeter(){
        assertEquals(1.82, Conversion.convertF2M("6"), 0.01);
    }

    @Test
    @DisplayName("1.82 meters is 6 feet")
    void meterToFeet(){
        assertEquals(6, Conversion.convertM2F("1.82"), 0.1);
    }

    @Test
    @DisplayName("1 mile is 1.6 kilometers")
    void mileToKilometer(){
        assertEquals(1.6, Conversion.convertM2K("1"), 0.01);
    }

    @Test
    @DisplayName("1.6 kilometers is 1 mile")
    void kilometerToMile(){
        assertEquals(1, Conversion.convertK2M("1.6"), 0.01);
    }

    @Test
    @DisplayName("1 gallon is 3.78 liters")
    void gallonToLiter(){
        assertEquals(3.78, Conversion.convertG2L("1"), 0.01);
    }

    // testing for emptyString and Null inputs

    @Test
    @DisplayName("empty string and null input won't break the program")
    void emptyStringAndNullCheck(){
        assertDoesNotThrow(()->Conversion.convertF2C(null));
        assertDoesNotThrow(()->Conversion.convertF2C(""));
        assertDoesNotThrow(()->Conversion.convertC2F(null));
        assertDoesNotThrow(()->Conversion.convertC2F(""));
        assertDoesNotThrow(()->Conversion.convertIn2Cm(null));
        assertDoesNotThrow(()->Conversion.convertIn2Cm(""));
        assertDoesNotThrow(()->Conversion.convertCm2In(null));
        assertDoesNotThrow(()->Conversion.convertCm2In(""));
        assertDoesNotThrow(()->Conversion.convertF2M(null));
        assertDoesNotThrow(()->Conversion.convertF2M(""));
        assertDoesNotThrow(()->Conversion.convertM2F(null));
        assertDoesNotThrow(()->Conversion.convertM2F(""));
        assertDoesNotThrow(()->Conversion.convertM2K(null));
        assertDoesNotThrow(()->Conversion.convertM2K(""));
        assertDoesNotThrow(()->Conversion.convertK2M(null));
        assertDoesNotThrow(()->Conversion.convertK2M(""));
        assertDoesNotThrow(()->Conversion.convertG2L(null));
        assertDoesNotThrow(()->Conversion.convertG2L(""));
    }
}
