package day31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RepeatedWordTest {

    @Test
    public void firstRepeatedWordTest() {
        String string = "Once upon a time, there was a brave princess who...";

        String expected = "a";



        assertEquals(expected, RepeatedWord.firstRepeatedWord(string));
    }



    @Test
    public void firstRepeatedWordTestEmpty() {
        String string = "";
        String expected = "No string given";



        assertEquals(expected, RepeatedWord.firstRepeatedWord(string));
    }



}