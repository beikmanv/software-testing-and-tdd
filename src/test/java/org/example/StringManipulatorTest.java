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

//    @Test
//    void isPalindrome() {
//    }
}