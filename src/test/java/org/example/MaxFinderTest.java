package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaxFinderTest {

    @Test
    public void testFindMax_1_2_3() {
        int result = MaxFinder.findMax(1, 2, 3);
        assertEquals(3, result);
    }

    @Test
    public void testFindMax_minus1_minus2_minus3() {
        int result = MaxFinder.findMax(-1, -2, -3);
        assertEquals(-1, result);
    }

    @Test
    public void testFindMax_0_0_1() {
        int result = MaxFinder.findMax(0, 0, 1);
        assertEquals(1, result);
    }
}