package ctci.chapter1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationTest {

    @Test
    public void testIsPermutation() {
        Permutation permutation = new Permutation();
        Assert.assertTrue(permutation.isPermutation("", ""));
        Assert.assertTrue(permutation.isPermutation("a", "a"));
        Assert.assertTrue(permutation.isPermutation("abc", "bca"));
        Assert.assertTrue(permutation.isPermutation("aaabbcc", "bbccaaa"));
        Assert.assertFalse(permutation.isPermutation("a", ""));
        Assert.assertFalse(permutation.isPermutation("a", "aa"));
    }
}