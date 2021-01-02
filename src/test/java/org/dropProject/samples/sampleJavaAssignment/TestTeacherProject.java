package org.dropProject.samples.sampleJavaAssignment;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// in Drop Project, all test classes must begin with "Test"
public class TestTeacherProject {

    @Test
    public void testFindMax() {
        assertEquals(7, Main.findMax(new int[] { 1, 2, 7, 4 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithNull() {
        Main.findMax(null);
    }

    @Test
    public void testFindMaxAllNegative() {
        assertEquals(-1, Main.findMax(new int[]{-7, -5, -3, -1}));
        assertEquals(-3, Main.findMax(new int[]{-7, -5, -3, -99}));
    }

    @Test
    public void testFindMaxNegativeAndPositive() {
        assertEquals(3, Main.findMax(new int[]{-7, -5, 3, -1}));
        assertEquals(5, Main.findMax(new int[]{-7, 5, -3, -99}));
    }

}