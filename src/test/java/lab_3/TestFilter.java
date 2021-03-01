package lab_3;

import lab_3.filter.BeginStringFilter;
import lab_3.filter.EndStringFilter;
import lab_3.filter.LengthStringFilter;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class TestFilter {

    @Test
    public void testBeginStringFilter(){
        BeginStringFilter beginStringFilter = new BeginStringFilter("pattern");
        Assert.assertTrue(beginStringFilter.apply("pattern123"));
        Assert.assertFalse(beginStringFilter.apply("123"));
        Assert.assertFalse(beginStringFilter.apply(""));
        Assert.assertFalse(beginStringFilter.apply(null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeginStringFilterNeg(){
        BeginStringFilter beginStringFilter = new BeginStringFilter(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeginStringFilterEmpty(){
        BeginStringFilter beginStringFilter = new BeginStringFilter("");
    }


    @Test(expected = IllegalArgumentException.class)
    public void testLengthFilterNeg(){
        LengthStringFilter filter = new LengthStringFilter(-10);
    }

    @Test
    public void testLengthStringFilter(){
        LengthStringFilter lengthStringFilter = new LengthStringFilter(5);
        Assert.assertTrue(lengthStringFilter.apply("12345"));
        Assert.assertFalse(lengthStringFilter.apply("123"));
        Assert.assertFalse(lengthStringFilter.apply(""));
        Assert.assertFalse(lengthStringFilter.apply(null));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testEndStringFilterNeg(){
        EndStringFilter beginStringFilter = new EndStringFilter(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEndStringFilterEmpty(){
        EndStringFilter beginStringFilter = new EndStringFilter("");
    }

    @Test
    public void testEndStringFilter(){
        EndStringFilter endStringFilter = new EndStringFilter("pattern");
        Assert.assertTrue(endStringFilter.apply("123pattern"));
        Assert.assertFalse(endStringFilter.apply("pattern123"));
        Assert.assertFalse(endStringFilter.apply(""));
        Assert.assertFalse(endStringFilter.apply(null));
    }
}
