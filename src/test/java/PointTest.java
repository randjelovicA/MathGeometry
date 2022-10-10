import org.etsntesla.it.math.Point;
import org.junit.jupiter.api.AssertionFailureBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PointTest {
    static Point A,B;
    @BeforeAll
    static void init(){
        A = new Point(3,4);
        B = new Point(3,6);
    }
    @Test
    void test1(){
        System.out.println("Hello test");
        Assertions.assertEquals(5,A.radius(),"Formula nije tacna!");
        Assertions.assertEquals(2,A.distance(B),"Formula nije tacna!");
    }

}
