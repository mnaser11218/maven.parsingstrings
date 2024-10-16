package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 10/01/2019.
 */
public class StringParser {

    public static Character[] parseCharacters(String input) {
        if(input == null){
            return null;
        }
        Character[] result = new Character[input.length()];
        char[]characters = input.toCharArray();
        for(int i=0; i< characters.length;i++){
            result[i] = new Character(characters[i]);
        }
        return result;
    }

    public static Integer[] parseIntegers(String input) {
        if(input == null){
            return null;
        }
        Integer[] result = new Integer[input.trim().length()];
        char[]characters = input.trim().toCharArray();
        for(int i=0; i< input.trim().length();i++){
            System.out.println(characters[i]);
            if(characters[i] != ' ') {
                Integer num = characters[i] - '0';
                result[i] = num;
            }

        }
        return result;
    }

    public static List<String> toList(String[] input) {
        return new ArrayList<>(Arrays.asList(input));


    }

    public static String[] parseStrings(String input) {
     return input != null ? input.split("") : null;
    }
}
