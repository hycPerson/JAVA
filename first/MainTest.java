import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void aa(){
        System.out.println("aaa");
        char[]  aa = {'a','b'};
        Assert.assertEquals(Arrays.binarySearch(aa,'a'), 0);
        Assert.assertEquals(Arrays.binarySearch(aa,'c'), -3);
        Assert.assertEquals(Arrays.binarySearch(aa,0, 2,'b'), 1);
    }
    @Test
    public  void v(){
        Assert.assertEquals(0,"aa".indexOf('a'));
    }
}