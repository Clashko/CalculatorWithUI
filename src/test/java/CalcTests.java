import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.Assert;

import javax.swing.*;

import static junit.framework.Assert.*;

public class CalcTests {

    private CalcClicker clicker = CalcClicker.INSTANCE;
    private double a;
    private double b;
    private CalcFunctions calc=new CalcFunctions();

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

    // <editor-fold defaultstate="collapsed" desc="Test calculator buttons">
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
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Test calculator functions">
    @Test
    public void testSummerNULL() {
        try{
            calc.summer(null,null );
        }
        catch(Throwable e){
            System.out.println("Input parameters in summer is not null");
            e.printStackTrace();
        }
    }

    @Test
    public void testDiffNULL() {
        try{
            calc.diff(null,null );
        }
        catch(Throwable e){
            System.out.println("Input parameters in diff is not null");
            e.printStackTrace();
        }
    }

    @Test
    public void testMultiNULL() {
        try{
            calc.multi(null,null );
        }
        catch(Throwable e){
            System.out.println("Input parameters in multi is not null");
            e.printStackTrace();
        }
    }

    @Test
    public void testDivideNULL() {
        try{
            calc.divide(null,null );
        }
        catch(Throwable e){
            System.out.println("Input parameters in divide is not null");
            e.printStackTrace();
        }
    }
    @Test
    public void testSummerStr() {
        try{
            calc.summer("firstValue", "secondValue");
        }
        catch(Throwable e){
            System.out.println("Can't input string values in function summer");
            e.printStackTrace();
        }
    }


    @Test
    public void testDiffStr() {
        try{
            calc.diff("firstValue", "secondValue");
        }
        catch(Throwable e){
            System.out.println("Can't input string values in function diff");
            e.printStackTrace();
        }
    }

    @Test
    public void testMultiStr() {
        try{
            calc.multi("firstValue", "secondValue");
        }
        catch(Throwable e){
            System.out.println("Can't input string values in function multi");
            e.printStackTrace();
        }
    }

    @Test
    public void testDivisionStr() {
        try{
            calc.divide("firstValue", "secondValue");
        }
        catch(Throwable e){
            System.out.println("Can't input string values in function divide");
            e.printStackTrace();
        }
    }
    @Test
    public void test_Divide_zero()
    {
        try {
            assertEquals(Double.isInfinite(calc.divide(78, 0)), true);
        }
        catch (Throwable e){
            System.out.println("Double / 0  is not infinite");
            e.printStackTrace();
        }
    }

    @Test
    public void test_isNaN()
    {
        try {
            assertEquals(Double.isNaN(calc.divide(0, 0)),true);
        }
        catch (Throwable e){
            System.out.println("0 / 0  is not NaN");
            e.printStackTrace();
        }
    }
    @Test
    //погрешности при суммировании
    public void testSummerError()
    {
        double s=0;
        try {
            for (int i=0;i<26;i++){
                s=calc.summer(s,0.1);
            }
            assertEquals(s, 2.6);
        }catch (Throwable e) {
            System.out.println("Error: "+ s +"!=2.6\nfault in summer");
            e.printStackTrace();
        }
    }
    @Test
    //погрешности при суммировании
    public void testDiffError()
    {
        double s=5;
        double temp=4;
        try {
            for (int i=0;i<10;i++){
                s=calc.diff(s,0.1);
            }
            assertEquals(s, temp);
        }catch (Throwable e) {
            System.out.println("Error: "+ s +"!="+temp+"\nfault in diff");
            e.printStackTrace();
        }
    }
    @Test
    //погрешности при умножении
    public void testMultiError()
    {
        double temp = 29;
        double s=calc.multi(29.0, 0.01);
        double s2=s*100;
        try {
            assertEquals(s2,temp);
        }
        catch (Throwable e){
            System.out.println("Error: "+s2+"!="+temp+"\nfault in Multi: 29*0.01="+s);
            e.printStackTrace();
        }

    }

    @Test
    //погрешности при вычитании
    public void testDivideError()
    {
        double a=2.0;
        double b=1.1;
        double temp =0.9;
        double s = calc.diff(2.0, 1.1);
        try{
            assertEquals(s,temp);
        }
        catch (Throwable e){
            System.out.println("Error: "+a+"/"+b+"="+s+"!="+temp+"\nfault in Divide");
            e.printStackTrace();
        }
    }
    @Test
    //производительность при смешанных операциях
    public void powerMultiTest() throws Exception {
        double a=55.000045;
        double b=32.00050;
        long start = System.currentTimeMillis();
        try{
            calc.multi(calc.summer(a,b),calc.diff(a,calc.divide(a,b)));
        }
        catch (Throwable e){
            System.out.println(e.getMessage());
        }
        Thread.yield();
        if (System.currentTimeMillis() - start > 1000) {
            throw new Exception("Long execution");
        }
    }

    //</editor-fold>
}
