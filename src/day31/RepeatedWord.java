package day31;

import java.util.*;

public class RepeatedWord {


    public static String firstRepeatedWord(String sentence){

        if (sentence == null || sentence.isEmpty()){
            return "No string given";
        }

        Set<String> dups = new HashSet<>();

        String[] words = sentence.split("\\s+");
        Set<String> set = new HashSet<>();

        for(String word : words){
            if(!set.add(word)){
                dups.add(word);
            }
        }
        String[] array = new String[dups.size()];
        for (String s: dups)
            array[0] = s;
        String result = array[0];
        return result;
    }
}
