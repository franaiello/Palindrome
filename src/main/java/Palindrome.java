import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        if(str == null) {
            return false;
        }

        for (int i = 0, j = str.length() - 1; i <j; i++, j--) {
            Character c = str.toLowerCase().charAt(i);
            Character c2 = str.toLowerCase().charAt(j);

            if (!c.equals(c2)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(Integer value) {
        if(value == null) {
            return false;
        }

        String str = value.toString();
        for (int i = 0, j = str.length() - 1; i <j; i++, j--) {
            Character c = str.toLowerCase().charAt(i);
            Character c2 = str.toLowerCase().charAt(j);

            if (!c.equals(c2)) {
                return false;
            }
        }

        return true;
    }

    public static List<Result> findPalindrome(int from, int to) {
        List<Result> list = new ArrayList<Result>();

        for (int x=from, y=from; x<=to && y<=to; x++, y++) {
            Integer product = x * y;
            if(isPalindrome(product.toString())) {
                //System.out.println("x: " + x + "y: "+y + "product: " + product);
                Result result = getResult(x, y, product);
                list.add(result);
            }
        }

        return list;
    }

    private static Result getResult(int x, int y, Integer product) {
        Result result = new Result();
        result.x = x;
        result.y = y;
        result.setProduct(product);
        return result;
    }
}
