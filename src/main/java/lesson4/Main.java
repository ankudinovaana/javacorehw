package lesson4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] words = {"one", "two", "three", "five", "five", "six", "seven", "eight", "nine", "nine"};

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if(wordCount.containsKey(words[i])) {
                wordCount.put(words[i], wordCount.get(words[i]) + 1);
            } else {
                wordCount.put(words[i], 1);
            }
        }
        System.out.println(wordCount);
    }
}
