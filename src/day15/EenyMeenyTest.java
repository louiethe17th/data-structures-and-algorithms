package day15;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class EenyMeenyTest {

    @Test
    void eenyMeenyMineyMoe() {
        Queue<String> moeBois = new LinkedList<>();
        moeBois.add("Paul");
        moeBois.add("Brando");
        moeBois.add("Nick");
        moeBois.add("Tara");
        moeBois.add("Steve");

        String expected = "Tara";

        assertEquals(expected, EenyMeeny.EenyMeenyMineyMoe(moeBois, 5));


    }

    @Test
    void eenyMeenyMineyMoe2() {
        Queue<String> moeBois = new LinkedList<>();
        moeBois.add("Bob");
        moeBois.add("Tom");
        moeBois.add("lou");
        moeBois.add("jon");
        moeBois.add("kahn");

        String expected = "jon";

        assertEquals(expected, EenyMeeny.EenyMeenyMineyMoe(moeBois, 5));


    }
}