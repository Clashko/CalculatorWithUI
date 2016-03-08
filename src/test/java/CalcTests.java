import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTests {

    private CalcClicker clicker = CalcClicker.INSTANCE;
    double a;
    double b;

    public CalcTests() {
        a = 5000.55;
        b = 500.45;
    }

    @BeforeClass
    public static void setUpOnce() throws Exception {
        CalculatorUI.main(null);

    }

    @Before
    public void init() throws Exception {
        clicker.clear();
    }

    @Test
    public void testPlus() throws Exception {
        clicker.clear();
        clicker.click(a);
        clicker.plus();
        clicker.click(b);
        clicker.result();
        clicker.checkDoubleValue(a+b);
        Thread.sleep(1000);
    }

    @Test
    public void testMinus() throws Exception {
        clicker.clear();
        clicker.click(a);
        clicker.minus();
        clicker.click(b);
        clicker.result();
        clicker.checkDoubleValue(a-b);
        Thread.sleep(1000);
    }

    @Test
    public void testMultiply() throws Exception {
        clicker.clear();
        clicker.click(a);
        clicker.multiply();
        clicker.click(b);
        clicker.result();
        clicker.checkDoubleValue(a*b);
        Thread.sleep(1000);
    }

    @Test
    public void testDivide() throws Exception {
        clicker.clear();
        clicker.click(a);
        clicker.divide();
        clicker.click(b);
        clicker.result();
        clicker.checkDoubleValue(a/b);
        Thread.sleep(1000);
    }
    @Test
    public void testPlusNull() throws Exception {
            clicker.clear();
            clicker.click(0);
            clicker.plus();
            clicker.click(0);
            clicker.result();
            clicker.checkDoubleValue(0+0);
            Thread.sleep(1000);
    }
    @Test
    public void testMinusNull() throws Exception {
            clicker.clear();
            clicker.click(0);
            clicker.minus();
            clicker.click(0);
            clicker.result();
            clicker.checkDoubleValue(0-0);
            Thread.sleep(1000);
    }
    @Test
    public void testMultiplyNull() throws Exception {
            clicker.clear();
            clicker.click(0);
            clicker.multiply();
            clicker.click(0);
            clicker.result();
            clicker.checkDoubleValue(0*0);
            Thread.sleep(1000);
    }
    @Test
    public void testDivideNull() throws Exception {
        a=0;
        b=0;
        clicker.clear();
        clicker.click(a);
        clicker.divide();
        clicker.click(b);
        clicker.result();
        clicker.checkDoubleValue(a/b);
        Thread.sleep(1000);
    }
    @Test
    public void testMemory() throws Exception{
        clicker.clear();
        clicker.click(a);
        clicker.plus();
        clicker.click(b);
        clicker.result();
        clicker.memory();
        clicker.clear();
        clicker.memory();
        clicker.checkDoubleValue(a+b);
    }
    @Test
    public void testClearEnd() throws Exception{
        clicker.click(500.55);
        clicker.clearEnd();
        clicker.checkDoubleValue(500.5);
    }
}
