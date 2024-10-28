package org.example;

public class StringManipulator {

    public String reverseString(String input) {
        // TODO: Implement the logic to reverse the input string
//        String reversedString = "";
//        for(int i = 0; i<input.length(); i++) {
//            reversedString = input.charAt(i) + reversedString;
//        }
//        return reversedString;

       return new StringBuilder(input).reverse().toString();
    }

    public boolean isPalindrome(String input) {
        // TODO: Implement the logic to check if the input string is a palindrome
        // (A palindrome = same forwards as backwards)
        return false;
    }
}
