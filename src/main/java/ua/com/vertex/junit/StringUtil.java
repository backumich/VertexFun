package ua.com.vertex.junit;

/**
 * Created by sweet_home on 25.03.17.
 */
public class StringUtil implements StringUtilInt {
    @Override
    public boolean isPalindrome(String suspect) {
        if (suspect == null) {
            throw new IllegalArgumentException("Chumachechiy chely?");
        }
        return suspect.equalsIgnoreCase(reverseString(suspect));
    }

    @Override
    public String reverseString(String toReverse) {
        return new StringBuilder(toReverse).reverse().toString();
    }
}
