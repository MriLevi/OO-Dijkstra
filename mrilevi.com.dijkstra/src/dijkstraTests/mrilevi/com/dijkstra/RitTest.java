package mrilevi.com.dijkstra;

import org.junit.Test;

import static org.junit.Assert.*;

public class RitTest {

    @Test
    public void getKilometer() {
        Stap stap1 = new Stap("1");
        Stap stap2 = new Stap("2");
        Rit rit1 = new Rit(10, stap1, stap2);
        Integer kilometer = rit1.getKilometer();
        assertEquals(java.util.Optional.of(10), kilometer);
    }

    @Test
    public void setKilometer() {
    }

    @Test
    public void setWeight() {
    }

    @Test
    public void getWeight() {
    }
}