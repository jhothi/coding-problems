package ctci.chapter1;

import org.junit.Assert;
import org.junit.Test;

public class IsUniqueTest {

    @Test
    public void isUnique() {
        IsUnique isUnique = new IsUnique();
        Assert.assertTrue(isUnique.isUnique(""));
        Assert.assertTrue(isUnique.isUnique("ABC"));
        Assert.assertFalse(isUnique.isUnique("ABBC"));
    }

    @Test
    public void isUniqueWithoutExtraSpace() {
        IsUnique isUnique = new IsUnique();
        Assert.assertTrue(isUnique.isUniqueWithoutExtraSpace(""));
        Assert.assertTrue(isUnique.isUniqueWithoutExtraSpace("ABC"));
        Assert.assertFalse(isUnique.isUniqueWithoutExtraSpace("ABBC"));
    }
}