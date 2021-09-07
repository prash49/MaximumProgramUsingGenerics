package com.bridgelabz.maximumusinggenerics;

import org.junit.Assert;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MaximumTest {
//    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue() {
//        int actualResult = Maximum.getMaximum(10, 15, 12);
//        Assert.assertEquals(15, actualResult);
//    }
//    public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue(){
//        float actualResult = Maximum.getMaximum(10f,15f,12f);
//                Assert.assertEquals(15, actualResult ,0);
//    }
      public void given3Values_WhenGetMaximum_ShouldReturnCorrectValue(){
          String actualResult = Maximum.getMaximum("Aa","Bb","Cc");
          Assert.assertEquals("Cc",actualResult);

      }
}
