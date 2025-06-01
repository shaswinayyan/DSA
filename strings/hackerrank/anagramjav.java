package strings.hackerrank;

import java.util.*;


public class anagramjav {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "maanagr";

        Map<Character, Integer> count1 = new HashMap<>();
        Map<Character, Integer> count2 = new HashMap<>();

        char[] firstString = str1.toCharArray();
        char[] secondString = str2.toCharArray();

        for(char c : firstString){
            count1.put(c, count1.getOrDefault(c, 0)+1);
        }

        for(char c : secondString){
            count2.put(c, count2.getOrDefault(c, 0)+1);
        }

        System.out.println(count1.equals(count2));

    }
}
