package org.dropProject.samples.sampleJavaAssignment;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

// in Drop Project, all test classes must begin with "Test"
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestTeacherProject {

    @Test(timeout = 500)
    public void test_001_FindMax() {
        assertEquals("trying to find the maximum in [1,2,7,4]", 7, Main.findMax(new int[] { 1, 2, 7, 4 }));
        assertEquals("trying to find the maximum in [1,2,4]", 4, Main.findMax(new int[] { 1, 2, 4 }));
    }

    @Test(timeout = 500)
    public void test_002_FindMaxAllNegative() {
        assertEquals("trying to find the maximum in [-7,-5,-3,-1]", -1, Main.findMax(new int[]{-7, -5, -3, -1}));
        assertEquals("trying to find the maximum in [-7,-5,-3,-99]", -3, Main.findMax(new int[]{-7, -5, -3, -99}));
    }

    @Test(timeout = 500)
    public void test_003_FindMaxNegativeAndPositive() {
        assertEquals("trying to find the maximum in [-7,-5,-3,-1]", 3, Main.findMax(new int[]{-7, -5, 3, -1}));
        assertEquals("trying to find the maximum in [-7,5,-3,-99]", 5, Main.findMax(new int[]{-7, 5, -3, -99}));
    }

    @Test(expected = IllegalArgumentException.class, timeout = 500)
    public void test_004_FindMaxWithNull() {
        Main.findMax(null);
    }

}