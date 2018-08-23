package day33;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class LeftJoinTest {

    @Test
    public void leftJoin() {
        Map<String, String> testMapOne = new HashMap<String, String>();
        Map<String, String> testMapTwo = new HashMap<String, String>();


        testMapOne.put("fond", "enamdered");
        testMapOne.put("wrath", "anger");
        testMapOne.put("diligent", "employed");
        testMapOne.put("outfit", "garb");
        testMapOne.put("guide", "usher");

        testMapTwo.put("fond", "averse");
        testMapTwo.put("wrath", "delight");
        testMapTwo.put("diligent", "idle");
        testMapTwo.put("guide", "follow");
        testMapTwo.put("flow", "jam");

        String expected = "{diligent=[employed, idle], outfit=[garb, null], wrath=[anger, delight], guide=[usher, follow], fond=[enamdered, averse]}";

        String result = LeftJoin.LeftJoin(testMapOne, testMapTwo).toString();


        assertEquals(expected, result);

    }

    @Test
    public void leftJoinEmpty() {

        Map<String, String> testMapOne = new HashMap<String, String>();
        Map<String, String> testMapTwo = new HashMap<String, String>();


        String result = LeftJoin.LeftJoin(testMapOne, testMapTwo).toString();
        String expected = "{}";

        assertEquals(expected, result);


    }

    @Test
    public void leftJoin2() {

        Map<String, String> testMapOne = new HashMap<String, String>();
        Map<String, String> testMapTwo = new HashMap<String, String>();


        testMapTwo.put("fond", "enamdered");
        testMapTwo.put("wrath", "anger");
        testMapTwo.put("diligent", "employed");
        testMapTwo.put("outfit", "garb");
        testMapTwo.put("guide", "usher");

        testMapOne.put("fond", "averse");
        testMapOne.put("wrath", "delight");
        testMapOne.put("diligent", "idle");
        testMapOne.put("guide", "follow");
        testMapOne.put("flow", "jam");

        String expected = "{diligent=[employed, idle], outfit=[garb, null], wrath=[anger, delight], guide=[usher, follow], fond=[enamdered, averse]}";

        String result = LeftJoin.LeftJoin(testMapOne, testMapTwo).toString();


        assertEquals(expected, result);

    }
}