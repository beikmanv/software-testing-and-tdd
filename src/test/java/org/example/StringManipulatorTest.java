package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
/*
todo:
 */

    @Test
    @DisplayName("returns reversed string when passed a string")
    void testReverseString() {
//        Arrange
        String inputString = "hello";
        String outputString = "olleh";

//        Act
        StringManipulator stringManipulator = new StringManipulator();
        String result = stringManipulator.reverseString(inputString);

//        Assert
        assertEquals(outputString, result);

    }

    @Test
    @DisplayName("returns true when initial string is equal to reversed sting")
    void testIsPalindrome() {
//        Arrange
        String inputString2 = "level";

//        Act
        StringManipulator stringManipulator = new StringManipulator();
        Boolean result = stringManipulator.isPalindrome(inputString2);

//        Assert
        assertEquals(true, result);
    }

    @Test
    @DisplayName("returns false when initial string is not equal to reversed sting")
    void testIsPalindromeFalse() {
//        Arrange
        String inputString3 = "hello";

//        Act
        StringManipulator stringManipulator = new StringManipulator();
        Boolean result = stringManipulator.isPalindrome(inputString3);

//        Assert
        assertEquals(false, result);
    }
}