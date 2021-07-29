import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;
    @BeforeEach
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }
    @Test
    public void testNumber() {
        int number = 1;
        String numberReturned = fizzBuzz.play(number);
        assertEquals("1", numberReturned);
    }
    @Test
    public void testFizz() {
        int number = 3;
        String numberReturned = fizzBuzz.play(number);
        assertEquals("fizz", numberReturned);
    }
    @Test
    public void testFizzDivisibleBy3() {
        int number = 6;
        String numberReturned = fizzBuzz.play(number);
        assertEquals("fizz", numberReturned);
    }
    @Test
    public void testBuzz() {
        int number = 5;
        String numberReturned = fizzBuzz.play(number);
        assertEquals("buzz", numberReturned);
    }
    @Test
    public void testFizzBuzz() {
        int number = 15;
        String numberReturned = fizzBuzz.play(number);
        assertEquals("fizzbuzz", numberReturned);
    }
    @Test
    public void testFizzBuzzDivisibleBy15() {
        int number = 30;
        String numberReturned = fizzBuzz.play(number);
        assertEquals("fizzbuzz", numberReturned);
    }
}
