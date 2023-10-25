import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFizzBuzz {
    @Test
    public void testPlay() {
        String expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz ";
        Assertions.assertEquals(expected, play(15));
    }

    public static String play(int num1) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= num1; i++) {
            if (i % 15 == 0) {
                result.append("FizzBuzz ");
            } else if (i % 3 == 0) {
                result.append("Fizz ");
            } else if (i % 5 == 0) {
                result.append("Buzz ");
            } else {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }
}
