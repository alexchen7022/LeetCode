import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeNumberTest {

    private final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    void isPalindrome() {
        int n = 121;
        assertEquals(true, palindromeNumber.isPalindrome(n));
        ;

    }
}
