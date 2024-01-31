package fr.diginamic.utils;

import org.junit.Test;

import org.junit.Assert;

public class StringUtilsTest {

  @Test
  public void testLevenshteinDistance() {
    Assert.assertEquals(1, StringUtils.levenshteinDistance("house", "mouse"));
    Assert.assertEquals(3, StringUtils.levenshteinDistance("Saturday", "Sunday"));
    Assert.assertEquals(2, StringUtils.levenshteinDistance("distance", "instance"));
    Assert.assertEquals(2, StringUtils.levenshteinDistance("Chien", "Chine"));
  }


  @Test(expected = IllegalArgumentException.class)
  public void testNullArgForLevenshteinDistance() {
    Assert.assertEquals(1, StringUtils.levenshteinDistance(null, ""));
  }
}