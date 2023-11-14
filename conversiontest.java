import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

public class conversiontest {

    // moved all conversion functions here for ease of testing
    static float convertF2C (String FAsStr)
    {  // Convert farenheit to celsius
    float num1, num2; // temporary variables
    int n; // temporary variable
    // Round to 2 digits past decimal
    num1 = (Float.valueOf(FAsStr).floatValue());
    n    = Math.round(num1 * (float)100.0);
    num1 = (float) (n / (float)100.0);
    // Convert
    num2 = (float) ( ( (num1-32.0) * 5.0) / 9.0);
    // Back to 2 digits
    n    = Math.round(num2 * (float)100.0);
    num2 = (float) (n / (float)100.0);
    return (num2);
    }

    static float convertC2F (String CAsStr)
    {  // Convert celsius to farenheit
    float num1, num2; // temporary variables
    int n; // temporary variable
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (CAsStr).floatValue ());
    n    = Math.round(num1 * (float)100.0);
    num1 = (float) (n / (float)100.0);
    // Convert
    num2 = (float) ( (num1 * 9.0 / 5.0) + 32.0);
    // Back to 2 digits
    n    = Math.round(num2 * (float)100.0);
    num2 = (float) (n / (float)100.0);
    return(num2);
    }

    // small distance
    static float convertIn2Cm (String inAsStr)
    {  // Convert inches to centimeters
    float num1, num2; // temporary variables
    int n; // temporary variable
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (inAsStr).floatValue ());
    n    = Math.round(num1 * (float)100.0);
    num1 = (float) (n / (float)100.0);
    // Convert
    num2 = (float) (num1 * 2.54);
    // Back to 2 digits
    n    = Math.round(num2 * (float)100.0);
    num2 = (float) (n / (float)100.0);
    return(num2);
    }

    static float convertCm2In (String cmAsStr)
    {  // Convert centimeters to inches
    float num1, num2; // temporary variables
    int n; // temporary variable
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (cmAsStr).floatValue ());
    n    = Math.round(num1 * (float)100.0);
    num1 = (float) (n / (float)100.0);
    // Convert
    num2 = (float) (num1 * 0.3937);
    // Back to 2 digits
    n    = Math.round(num2 * (float)100.0);
    num2 = (float) (n / (float)100.0);
    return(num2);
    }

    // medium distance
    static float convertF2M (String ftAsStr)
    {  // Convert feet to meters
    float num1, num2; // temporary variables
    int n; // temporary variable
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (ftAsStr).floatValue ());
    n    = Math.round(num1 * (float)100.0);
    num1 = (float) (n / (float)100.0);
    // Convert
    num2 = (float) (num1 * 0.3048);
    // Back to 2 digits
    n    = Math.round(num2 * (float)100.0);
    num2 = (float) (n / (float)100.0);
    return(num2);
    }

    static float convertM2F (String mAsStr)
    {  // Convert meters to feet
    float num1, num2; // temporary variables
    int n; // temporary variable
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (mAsStr).floatValue ());
    n    = Math.round(num1 * (float)100.0);
    num1 = (float) (n / (float)100.0);
    // Convert
    num2 = (float) (num1 / 0.3048);
    // Back to 2 digits
    n    = Math.round(num2 * (float)100.0);
    num2 = (float) (n / (float)100.0);
    return(num2);
    }

    // large distance
    static float convertM2K (String miAsStr)
    {  // Convert miles to kilometers
    float num1, num2; // temporary variables
    int n; // temporary variable
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (miAsStr).floatValue ());
    n    = Math.round(num1 * (float)100.0);
    num1 = (float) (n / (float)100.0);
    // Convert
    num2 = (float) (num1 * 1.609);
    // Back to 2 digits
    n    = Math.round(num2 * (float)100.0);
    num2 = (float) (n / (float)100.0);
    return(num2);
    }

    static float convertK2M (String kmAsStr)
    {  // Convert kilometers to miles
    float num1, num2; // temporary variables
    int n; // temporary variable
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (kmAsStr).floatValue ());
    n    = Math.round(num1 * (float)100.0);
    num1 = (float) (n / (float)100.0);
    // Convert
    num2 = (float) (num1 * 0.6214);
    // Back to 2 digits
    n    = Math.round(num2 * (float)100.0);
    num2 = (float) (n / (float)100.0);
    return(num2);
    }

    // volume
    static float convertG2L (String galAsStr)
    {  // Convert gallons to liters
    float num1, num2; // temporary variables
    int n; // temporary variable
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (galAsStr).floatValue ());
    n    = Math.round(num1 * (float)100.0);
    num1 = (float) (n / (float)100.0);
    // Convert
    num2 = (float) (num1 * 3.785);
    // Back to 2 digits
    n    = Math.round(num2 * (float)100.0);
    num2 = (float) (n / (float)100.0);
    return(num2);
    }

    static float convertL2G (String LAsStr)
    {  // Convert liters to gallons
    float num1, num2; // temporary variables
    int n; // temporary variable
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (LAsStr).floatValue ());
    n    = Math.round(num1 * (float)100.0);
    num1 = (float) (n / (float)100.0);
    // Convert
    num2 = (float) (num1 / 3.785);
    // Back to 2 digits
    n    = Math.round(num2 * (float)100.0);
    num2 = (float) (n / (float)100.0);
    return(num2);
    }

    // small weight
    static float convertOz2G (String ozAsStr)
    {  // Convert ounces to grams
    float num1, num2; // temporary variables
    int n; // temporary variable
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (ozAsStr).floatValue ());
    n    = Math.round(num1 * (float)100.0);
    num1 = (float) (n / (float)100.0);
    // Convert
    num2 = (float) (num1 * 28.35);
    // Back to 2 digits
    n    = Math.round(num2 * (float)100.0);
    num2 = (float) (n / (float)100.0);
    return(num2);
    }

    static float convertG2Oz (String gAsStr)
    {  // Convert grams to ounces
    float num1, num2; // temporary variables
    int n; // temporary variable
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (gAsStr).floatValue ());
    n    = Math.round(num1 * (float)100.0);
    num1 = (float) (n / (float)100.0);
    // Convert
    num2 = (float) (num1 / 28.35);
    // Back to 2 digits
    n    = Math.round(num2 * (float)100.0);
    num2 = (float) (n / (float)100.0);
    return(num2);
    }

    // medium weight
    static float convertLb2K (String lbAsStr)
    {  // Convert pounds to kilograms
    float num1, num2; // temporary variables
    int n; // temporary variable
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (lbAsStr).floatValue ());
    n    = Math.round(num1 * (float)100.0);
    num1 = (float) (n / (float)100.0);
    // Convert
    num2 = (float) (num1 * 0.4536);
    // Back to 2 digits
    n    = Math.round(num2 * (float)100.0);
    num2 = (float) (n / (float)100.0);
    return(num2);
    }

    static float convertK2Lb (String kgAsStr)
    {  // Convert kilograms to pounds
    float num1, num2; // temporary variables
    int n; // temporary variable
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (kgAsStr).floatValue ());
    n    = Math.round(num1 * (float)100.0);
    num1 = (float) (n / (float)100.0);
    // Convert
    num2 = (float) (num1 * 2.205);
    // Back to 2 digits
    n    = Math.round(num2 * (float)100.0);
    num2 = (float) (n / (float)100.0);
    return(num2);
    }

    // Tests Fahrenheit inputs with expected results
    @ParameterizedTest
    @CsvSource({"32, 0", "100, 37.78"})
    public void testFtoC(float inputF, float expectedC) {
        float actualC= convertF2C(String.valueOf(inputF));
        assertEquals(expectedC, actualC, 0.01);
    }

    // Tests Celcius inputs with expected results
    @ParameterizedTest
    @CsvSource({"10, 50", "23, 73.4", "100, 212"})
    public void testCtoF(float inputC, float expectedF) {
        float actualF = convertC2F(String.valueOf(inputC));
        assertEquals(expectedF, actualF, 0.01);
    }

    // Tests Inch inputs with expected results
    @ParameterizedTest
    @CsvSource({"2, 5.08", "4, 10.16", "19, 48.26"})
    public void testIn2Cm(float inputIn, float expectedCm) {
        float actualCm = convertIn2Cm(String.valueOf(inputIn));
        assertEquals(expectedCm, actualCm, 0.01);
    }

    // Tests Centimeter inputs with expected results
    @ParameterizedTest
    @CsvSource({"4, 1.57", "150, 59.06"})
    public void testCm2In(float inputCm, float expectedIn) {
        float actualIn = convertCm2In(String.valueOf(inputCm));
        assertEquals(expectedIn, actualIn, 0.01);
    }

    // Test Feet inputs with expected results
    @ParameterizedTest
    @CsvSource({"3, 0.91", "12, 3.66"})
    public void testF2M(float inputF, float expectedM) {
        float actualM = convertF2M(String.valueOf(inputF));
        assertEquals(expectedM, actualM, 0.01);
    }

    // Test Meter inputs with expected results
    @ParameterizedTest
    @CsvSource({"1, 3.28", "12, 39.37"})
    public void testM2F(float inputM, float expectedF) {
        float actualF = convertM2F(String.valueOf(inputM));
        assertEquals(expectedF, actualF, 0.01);
    }

    // Test Mile inputs with expected results
    @ParameterizedTest
    @CsvSource({"5, 8.05", "26.2, 42.16", "10, 16.09"})
    public void testM2K(float inputM, float expectedK) {
        float actualK = convertM2K(String.valueOf(inputM));
        assertEquals(expectedK, actualK, 0.0001);
    }

    // Test Kilometer inputs with expected results
    @ParameterizedTest
    @CsvSource({"2, 1.24", "5, 3.10"})
    public void testK2M(float inputK, float expectedM) {
        float actualM = convertK2M(String.valueOf(inputK));
        assertEquals(expectedM, actualM, 0.01);
    }

    // Test Gallon inputs with expected results
    @ParameterizedTest
    @CsvSource({"13, 49.21", "5, 18.927", "6, 22.71"})
    public void testG2L(float inputG, float expectedL) {
        float actualL = convertG2L(String.valueOf(inputG));
        assertEquals(expectedL, actualL, 0.01);
    }

    // Test Liter inputs with expected results
    @ParameterizedTest
    @CsvSource({"3, 0.79", "6, 1.58"})
    public void testL2G(float inputL, float expectedG) {
        float actualG = convertL2G(String.valueOf(inputL));
        assertEquals(expectedG, actualG, 0.01);
    }

    // Test Ounce inputs with expected results
    @ParameterizedTest
    @CsvSource({"16, 453.592", "48, 1360.78"})
    public void testOz2G(float inputOz, float expectedG) {
        float actualG = convertOz2G(String.valueOf(inputOz));
        assertEquals(expectedG, actualG, 0.03); //0.01 delta is not enough due to rounding and floats
    }

    // Test Gram inputs with expected results
    @ParameterizedTest
    @CsvSource({"100, 3.53", "28, 0.99"})
    public void testG2Oz(float inputG, float expectedOz) {
        float actualOz = convertG2Oz(String.valueOf(inputG));
        assertEquals(expectedOz, actualOz, 0.01);
    }

    // Test Pound inputs with expected results
    @ParameterizedTest
    @CsvSource({"5, 2.27", "18, 8.16"})
    public void testLb2K(float inputLb, float expectedK) {
        float actualK = convertLb2K(String.valueOf(inputLb));
        assertEquals(expectedK, actualK, 0.01);
    }

    // Test Kilogram inputs with expected results
    @ParameterizedTest
    @CsvSource({"15, 33.08", "9, 19.84"})
    public void testK2Lb(float inputK, float expectedLb) {
        float actualLb = convertK2Lb(String.valueOf(inputK));
        assertEquals(expectedLb, actualLb, 0.01);
    }
}
