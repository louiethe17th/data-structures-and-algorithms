package day15;

import java.util.LinkedList;
import java.util.Queue;

public class EenyMeeny {


    public static String EenyMeenyMineyMoe (Queue<String> EMMMList, int n){

        int moeCount = n;
        while (EMMMList.size() > 1) {
            for (int count = 0; count < moeCount; count++) {
                String person = EMMMList.remove();
                EMMMList.add(person);
            }
            String removed = EMMMList.remove();
        }

        return EMMMList.remove();
        }

    }
