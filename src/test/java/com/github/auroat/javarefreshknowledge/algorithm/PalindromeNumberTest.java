package com.github.auroat.javarefreshknowledge.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {

    @Test
    void isPalindrome_shouldReturnTrue() {
        Assertions.assertTrue(PalindromeNumber.isPalindrome(123454321),
                "This should be a palindrome number.");
    }
    @Test
    void isPalindrome_shouldReturnFalse() {
        Assertions.assertFalse(PalindromeNumber.isPalindrome(1234543),
                "This should not be a palindrome number.");
    }
}
