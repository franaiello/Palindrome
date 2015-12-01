import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

public class PalindromeTest {

    @Test
    public void isPalindrome_String() {
        String str = "alula";
        assertThat(Palindrome.isPalindrome(str)).isTrue();
        assertThat(Palindrome2.isPalindrome(str)).isTrue();
    }


    @Test
    public void isPalindrome_StringCaseInsensitive() {
        String str = "moM";
        assertThat(Palindrome.isPalindrome(str)).isTrue();
        assertThat(Palindrome2.isPalindrome(str)).isTrue();
    }

    @Test
    public void switchingString() {
        String one="one";
        String two="twenty";
        String[] array = Palindrome.switchingStrings(one, two);
        assertThat(array[0]).isEqualTo("twenty");
        assertThat(array[1]).isEqualTo("one");
    }

    @Test
    public void findLargestInteger() {
        int result = Palindrome.findLargestInt(new int[] {-1, -3, 9,1,3,6,3,8});
        assertThat(result).isEqualTo(9);
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
