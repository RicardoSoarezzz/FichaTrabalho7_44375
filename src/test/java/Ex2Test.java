import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ex2Test {

    static Ex2 ex;
    @BeforeAll
    public static void startUp(){
        ex = new Ex2();
    }

    @ParameterizedTest
    @ValueSource (ints = { 3, 23, 311, 487, 653, 947})
    void isPrimeTest(int number){
        assertTrue(ex.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource (ints = {32, 64, 2, 20, 30, 26})
    void isEvenTest(int number){
        assertTrue(ex.isEven(number));
    }

    @ParameterizedTest
    @ValueSource (ints = {23, 46, 115, 184, 207, 230})
    void isMultipleTest(int number){
        assertTrue(ex.isMultiple(number,2));
    }
}
