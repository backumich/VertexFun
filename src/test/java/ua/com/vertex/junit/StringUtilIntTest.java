package ua.com.vertex.junit;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;


public class StringUtilIntTest {

    StringUtilInt underTest;

    @Before
    public void setUp() {
        underTest = new StringUtil();
    }

    @Test
    public void testThatEmptyStringIsPalindrome() throws Exception {
        System.out.println("Test regarding palindrome has started");
        boolean result = underTest.isPalindrome("");

        assert result : "Empty string should be palindrome";
    }

    @Test
    public void testThatRealPalindromeIsPalindrome() throws Exception {
        System.out.println("Test regarding palindrome has started");
        boolean result = underTest.isPalindrome("AmoreRoma");

        assert result : "AmoreRoma should be palindrome";
    }

    @Test
    public void testWrongStringIsNotPalindrome() throws Exception {
        System.out.println("Test regarding palindrome has started");
        boolean result = underTest.isPalindrome("Not a Palindrome");


        assertFalse("Wrong string should NOT be a palindrome", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullInPalindrome() throws Exception {
        System.out.println("Test regarding palindrome has started");
        boolean result = underTest.isPalindrome(null);

        assert !result : "Null NOT be a palindrome";
    }

    @Ignore("Not yet implemented")
    @Test
    public void revertString() throws Exception {
        System.out.println("reverseString Test is started ");

    }

}