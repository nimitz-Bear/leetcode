package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class GoodString {
    public String makeGood(String s) {

        // cC
        // i = 0


        char[] input = s.toCharArray();
        List<Character> charList = new ArrayList<>();

        // manually add each char into the list
        for (char c: input) {
            charList.add(c);
        }

        int i = 0;
        while (i < charList.size() && !charList.isEmpty()) {
            System.out.println(charList.toString());
            char c = charList.get(i);

            if (Character.isUpperCase(c) && i <= charList.size() - 2 && charList.get(i + 1) == (c + 32)) {
                    charList.remove(i);
                    charList.remove(i);
                    if (i > 0) {
                        i--;
                    }
            }
            else if (Character.isLowerCase(c) && i <= charList.size() - 2 && charList.get(i + 1) == (c - 32)) {
                    charList.remove(i);
                    charList.remove(i);
                if (i > 0) {
                    i--;
                }

            } else {
                i++;
            }

        }

        StringBuilder sb = new StringBuilder();

        for (Character ch: charList) {
            sb.append(ch);
        }

        return sb.toString();
    }
}