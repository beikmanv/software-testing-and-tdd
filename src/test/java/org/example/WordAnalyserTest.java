package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WordAnalyserTest {

    @Test
    @DisplayName("return longest string from a sting sentence")
    void testFindLongestWord(){
//        Arrange
        String inputString3 = "This is a fairly boring sentence.";
        ArrayList<String> outputString = new ArrayList<>();
        outputString.add("sentence");

//        Act
        WordAnalyser wordAnalyser = new WordAnalyser();
        ArrayList<String> result = wordAnalyser.findLongestWords(inputString3);

//        Assert
        assertEquals(outputString, result);
    }

    @Test
    @DisplayName("return several longest strings from a string sentence")
    void testFindLongestWords(){
//        Arrange
        String inputString4 = "This is a fairly boring thing.";
        ArrayList<String> outputString = new ArrayList<>();
        outputString.add("fairly");
        outputString.add("boring");

//        Act
        WordAnalyser wordAnalyser = new WordAnalyser();
        ArrayList<String> result = wordAnalyser.findLongestWords(inputString4);

//        Assert
        assertEquals(outputString, result);
    }



}