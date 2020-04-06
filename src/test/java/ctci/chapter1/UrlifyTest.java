package ctci.chapter1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UrlifyTest {

    @Test
    public void testUrlify() {
        Urlify urlify = new Urlify();
        Assert.assertEquals("Mr%20John%20Smith", urlify.urlify("Mr John Smith    ", 13));
    }
}