package lab_2;

import lab_2.StringProcessor;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class TestStringProcessor {
    @Test
    public void testMulStr() throws Exception {
        Assert.assertEquals("uuu", StringProcessor.mulStr("u", 3));
        Assert.assertEquals("uuuu", StringProcessor.mulStr("u", 4));
        Assert.assertEquals("uuuu", StringProcessor.mulStr("uu", 2));
    }

    @Test(expected = Exception.class)
    public void testMulStrException() throws Exception {
        StringProcessor.mulStr("uu", -2);
    }

    @Test
    public void testCountOfSubstrings() throws Exception {
        Assert.assertEquals(3, StringProcessor.countOfSubstring("uuuu", "uu"));
        Assert.assertEquals(2, StringProcessor.countOfSubstring("MyMy", "My"));
    }

    @Test
    public void testCharToNumberReplace() throws Exception {
        Assert.assertEquals("onetwothree", StringProcessor.charToNumberReplace("123"));
        Assert.assertEquals("oneone twotwo threethree", StringProcessor.charToNumberReplace("1one 2two 3three"));
        Assert.assertEquals("oneztwozthree", StringProcessor.charToNumberReplace("1z2z3"));
    }

    @Test
    public void testCharRemove() throws Exception {
        Assert.assertEquals("1357", StringProcessor.charRemove(new StringBuilder("1234567")));
    }
}
