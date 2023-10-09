import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ConversionTest {

    // testing for normal behavior

    @Test
    @DisplayName("32 farenheit is 0 celcius")
    void farenheitToCelcius(){
        assertEquals(0, Conversion.convertF2C("32"), 0.01); //Observability is the input we pass in, 32, while Controlability is the assert checking the output is 0.
    }

    @Test
    @DisplayName("0 celcius is 32 farenheit")
    void celciusToFarenheit(){
        assertEquals(32, Conversion.convertC2F("0"), 0.01); //Observability is the input we pass in, 0, while Controlability is the assert checking the output is 32.
    }

    @Test
    @DisplayName("12 inches is 30.48 centimeters")
    void inchesToCentimeter(){
        assertEquals(30.48, Conversion.convertIn2Cm("12"), 0.01); //Observability is the input we pass in, 12, while Controlability is the assert checking the output is 30.48.
    }

    @Test
    @DisplayName("30.48 centimeters is 12 inches")
    void centimeterToInches(){
        assertEquals(12, Conversion.convertCm2In("30.48"), 0.01); //Observability is the input we pass in, 30.48, while Controlability is the assert checking the output is 12.
    }

    @Test
    @DisplayName("6 feet is 1.82 meters")
    void feetToMeters(){
        assertEquals(1.82, Conversion.convertF2M("6"), 0.01); //Observability is the input we pass in, 6, while Controlability is the assert checking the output is 1.82.
    }

    @Test
    @DisplayName("1.82 meters is 6 feet")
    void metersToFeet(){
        assertEquals(6, Conversion.convertM2F("1.82"), 0.1); //Observability is the input we pass in, 1.82, while Controlability is the assert checking the output is 6.
    }

    @Test
    @DisplayName("1 mile is 1.6 kilometers")
    void milesToKilometers(){
        assertEquals(1.6, Conversion.convertM2K("1"), 0.01); //Observability is the input we pass in, 1, while Controlability is the assert checking the output is 1.6.
    }

    @Test
    @DisplayName("1.6 kilometers is 1 mile")
    void kilometersToMiles(){
        assertEquals(1, Conversion.convertK2M("1.6"), 0.01); //Observability is the input we pass in, 1.6, while Controlability is the assert checking the output is 0.
    }

    @Test
    @DisplayName("1 gallon is 3.78 liters")
    void gallonsToLiters(){
        assertEquals(3.78, Conversion.convertG2L("1"), 0.01); //Observability is the input we pass in, 1, while Controlability is the assert checking the output is 3.78.
    }

    @Test
    @DisplayName("3.78 liters is 1 gallon")
    void litersToGallons(){
        assertEquals(1, Conversion.convertL2G("3.78"), 0.01); //Observability is the input we pass in, 3.78, while Controlability is the assert checking the output is 1.
    }

    @Test
    @DisplayName("1 ounce is 28.35 grams")
    void ouncesToGrams(){
        assertEquals(28.35, Conversion.convertOz2G("1"), 0.01); //Observability is the input we pass in, 1, while Controlability is the assert checking the output is 28.35.
    }

    @Test
    @DisplayName("28.35 grams is 1 ounce")
    void gramsToOunces(){
        assertEquals(1, Conversion.convertG2Oz("28.35"), 0.01); //Observability is the input we pass in, 28.35, while Controlability is the assert checking the output is 1.
    }

    @Test
    @DisplayName("1 kilogram is 2.20 pounds")
    void kilogramsToPounds(){
        assertEquals(2.20, Conversion.convertK2Lb("1"), 0.01); //Observability is the input we pass in, 1, while Controlability is the assert checking the output is 2.20.
    }

    @Test
    @DisplayName("2.20 pounds is 1 kilogram")
    void poundsToKilograms(){
        assertEquals(1, Conversion.convertLb2K("2.20"), 0.01); //Observability is the input we pass in, 2.20, while Controlability is the assert checking the output is 1.
    }

    @Test
    @DisplayName("1 hour is 3600 seconds")
    void hoursToSeconds(){
        assertEquals(3600, Conversion.convertH2S("1"), 0.01); //Observability is the input we pass in, 1, while Controlability is the assert checking the output is 3600.
    }

    @Test
    @DisplayName("3600 seconds is 1 hour")
    void secondsToHours(){
        assertEquals(1, Conversion.convertS2H("3600"), 0.01); //Observability is the input we pass in, 3600, while Controlability is the assert checking the output is 1.
    }

    /*
     * Testing rounding
     */
    @Test
    @DisplayName("10.0123 rounds to 10.01")
    void testRoundingToHundredthPlace() {
        assertEquals(10.01f, Conversion.RoundFirst("10.0123"), 0.0001); //Observability is the input we pass in, 10.0123, while Controlability is the assert checking the output is 10.01f.
    }

    @Test
    @DisplayName("10.012345 rounds to 10.0123")
    void testRoundingToTenThousandthsPlace() {
        assertEquals(10.0123f, Conversion.RoundBack(10.012345f), 0.000001); //Observability is the input we pass in, 10.012345f, while Controlability is the assert checking the output is 10.0123f.
    }

    /*
     * Testing string handling helper function
     */
    @Test
    @DisplayName("null input defaults to \"0\"")
    void testStringHandlingNullInput() {
        assertEquals("0", Conversion.stringInputHandling(null)); //Observability is the input we pass in, null, while Controlability is the assert checking the output is 0.
    }

    @Test
    @DisplayName("non number inputs default to \"0\"")
    void testStringHandlingNonNumberInput() { //Observability is the inputs we pass in, "$$$", "abcdefg", "", and "\"\"''", while Controlability is the assert checking the outputs are all 0.
        assertEquals("0", Conversion.stringInputHandling("$$$"));
        assertEquals("0", Conversion.stringInputHandling("abcdefg"));
        assertEquals("0", Conversion.stringInputHandling(""));
        assertEquals("0", Conversion.stringInputHandling("\"\"''"));
    }

    /*
     * Testing empty string, positive infinity, negative infinity, a very small number, and a string with symbols on conversion functions
     */
    @ParameterizedTest //Observability is the inputs we pass in, "", "999999999999999", "-999999999999999", "0.00000000000000001", and  ".$ =  // ewq[],\\", while Controlability is the assert checking no function throws an error.
    @DisplayName("conversion functions do not throw a NumberFormatException")
    @ValueSource(strings = {"", "999999999999999", "-999999999999999", "0.00000000000000001", ".$ =  // ewq[],\\"})
    void testForNonFloats(String input){
        assertDoesNotThrow(()->Conversion.convertF2C(input));
        assertDoesNotThrow(()->Conversion.convertC2F(input));
        assertDoesNotThrow(()->Conversion.convertIn2Cm(input));
        assertDoesNotThrow(()->Conversion.convertCm2In(input));
        assertDoesNotThrow(()->Conversion.convertF2M(input));
        assertDoesNotThrow(()->Conversion.convertM2F(input));
        assertDoesNotThrow(()->Conversion.convertM2K(input));
        assertDoesNotThrow(()->Conversion.convertK2M(input));
        assertDoesNotThrow(()->Conversion.convertG2L(input));
        assertDoesNotThrow(()->Conversion.convertL2G(input));
        assertDoesNotThrow(()->Conversion.convertOz2G(input));
        assertDoesNotThrow(()->Conversion.convertG2Oz(input));
        assertDoesNotThrow(()->Conversion.convertK2Lb(input));
        assertDoesNotThrow(()->Conversion.convertLb2K(input));
        assertDoesNotThrow(()->Conversion.convertH2S(input));
        assertDoesNotThrow(()->Conversion.convertS2H(input));
    }

    /*
     * Testing null input on conversion functions
     */
    @Test //Observability is the input we pass in, null, while Controlability is the assert checking no function throws an error.
    @DisplayName("conversion functions do not throw a NullPointerException")
    void testForNullString(){
        assertDoesNotThrow(()->Conversion.convertM2K(null));
        assertDoesNotThrow(()->Conversion.convertF2C(null));
        assertDoesNotThrow(()->Conversion.convertC2F(null));
        assertDoesNotThrow(()->Conversion.convertIn2Cm(null));
        assertDoesNotThrow(()->Conversion.convertCm2In(null));
        assertDoesNotThrow(()->Conversion.convertF2M(null));
        assertDoesNotThrow(()->Conversion.convertM2F(null));
        assertDoesNotThrow(()->Conversion.convertK2M(null));
        assertDoesNotThrow(()->Conversion.convertG2L(null));
        assertDoesNotThrow(()->Conversion.convertL2G(null));
        assertDoesNotThrow(()->Conversion.convertOz2G(null));
        assertDoesNotThrow(()->Conversion.convertG2Oz(null));
        assertDoesNotThrow(()->Conversion.convertK2Lb(null));
        assertDoesNotThrow(()->Conversion.convertLb2K(null));
        assertDoesNotThrow(()->Conversion.convertH2S(null));
        assertDoesNotThrow(()->Conversion.convertS2H(null));
    }

    @Test
    @DisplayName("1 kh/h is 0.62 miles/h")
    void testKmPerHourToMilesPerHour(){
        assertEquals(0.62, Conversion.kmPerHourToMilesPerHour(1));
    }

}
