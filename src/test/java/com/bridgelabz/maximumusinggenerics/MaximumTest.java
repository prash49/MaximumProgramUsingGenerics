package com.bridgelabz.maximumusinggenerics;

import org.junit.Assert;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MaximumTest {
    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue() {
        int actualResult = Maximum.getMaximum(10, 15, 12);
        Assert.assertEquals(15, actualResult);
    }

}
