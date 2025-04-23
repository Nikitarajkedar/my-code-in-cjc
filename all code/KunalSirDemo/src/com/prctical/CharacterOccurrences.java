package com.prctical;
import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrences {
    public static void main(String[] args) {
        String str = "nikita kedar";
        Map<Character, Integer> ccmap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (ccmap.containsKey(c)) {
                ccmap.put(c, ccmap.get(c) + 1);
            } else {
                ccmap.put(c, 1);
            }
        }
        
        ccmap.forEach((key, value) ->
        System.out.println(key + ": " + value));
        
    }
}