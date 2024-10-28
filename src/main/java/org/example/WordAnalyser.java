package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class WordAnalyser {
    public ArrayList<String> findLongestWords(String text) {
        // TODO: Implement the logic to find the longest word(s) in the given text

        String sentenceWithoutDot = text.substring(0,text.length()-1);

        String[] wordsList = (sentenceWithoutDot.split(" "));
//        System.out.println(Arrays.toString(wordsList));
        ArrayList<String> longestWordsList = new ArrayList<>();

        String longestCurrentWord = wordsList[0];
        for (int i = 1; i < wordsList.length; i++) {
            if(wordsList[i].length() > longestCurrentWord.length()) {
                longestCurrentWord = wordsList[i];
            }
            if(wordsList[i].length() == longestCurrentWord.length()) {
                longestWordsList.add(wordsList[i]);
            }
        }
//        longestWordsList.add(longestCurrentWord);

        return longestWordsList;
    }

    public Map<Character, Integer> calculateLetterFrequency(String text) {
        // TODO: Implement the logic to calculate the frequency of each letter in the given text
        return null;
    }
}