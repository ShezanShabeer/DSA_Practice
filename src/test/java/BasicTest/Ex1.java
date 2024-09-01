package BasicTest;

import BaiscTest.Example;
import org.junit.Assert;
import org.junit.*;

import java.time.LocalDate;

public class Ex1 {
    @Test
    public void compare1(){
        String query = "Shezan";
        Example ex = new Example(LocalDate.of(2021,6,30), query);
        String ans = Example.compare(ex, "Shezan");
        Assert.assertEquals(ans, query);
    }

    @Test
    public void compare2(){
        Example ex = new Example(LocalDate.of(2021,6,30), null);
        String ans = Example.compare(ex, "Shezan");
        Assert.assertNull(ans);
    }

    @Test
    public void compare3(){
        String query = "Shezan";
        Example ex = new Example(LocalDate.of(2025,6,30), query);
        String ans = Example.compare(ex, "Shezan");
        Assert.assertNull(ans);
    }
}