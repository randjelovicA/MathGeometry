import org.etsntesla.it.math.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PointTest {
    static Point a=new Point();
    static Point b=new Point();

    @BeforeAll
    static void init(){
        a.setX(3);
        a.setY(4);
        b.setX(3);
        b.setY(6);
    }

    @Test
    public void test1(){
        Point t=new Point(3,4);
        Assertions.assertEquals(5.0d,t.radius(),"Greska! Uneta pogresna ocekivana vrednost.");
    }

    @Test
    public void test2(){
        Assertions.assertEquals(5.0d,a.radius(),"Greska! Uneta pogresna ocekivana vrednost.");
        //Assertions.fail();
    }
}
