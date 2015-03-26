import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

public class PalindromeTest {

    @Test
    public void isPalindrome_String() {
        String str = "alula";
        assertThat(Palindrome.isPalindrome(str)).isTrue();
    }

    @Test
    public void isNotAPalindrome_String() {
        String str = "momM";
        assertThat(Palindrome.isPalindrome(str)).isFalse();
    }

    @Test
    public void isPalindrome_Integer() {
        Integer value = 9009;
        assertThat(Palindrome.isPalindrome(value.toString())).isTrue();
    }

    @Test
    public void isNotAPalindrome_Integer() {
        Integer value = 90099;
        assertThat(Palindrome.isPalindrome(value)).isFalse();
    }

    @Test
    public void isNotAPalindrome_NullString() {
        String str = null;
        assertThat(Palindrome.isPalindrome(str)).isFalse();
    }

    @Test
    public void isNotAPalindrome_NullInteger() {
        Integer value = null;
        assertThat(Palindrome.isPalindrome(value)).isFalse();
    }

    @Test
    public void findPalindromeInRange() {
        List<Result> results = Palindrome.findPalindrome(100, 999);
        assertThat(results).extracting("x", "y", "product").contains(
                tuple(101, 101, 10201),
                tuple(111, 111, 12321),
                tuple(121, 121, 14641),
                tuple(202, 202, 40804),
                tuple(212, 212, 44944),
                tuple(264, 264, 69696),
                tuple(307, 307, 94249),
                tuple(836, 836, 698896));
    }
}
