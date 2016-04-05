import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by eksheen on 4/5/16.
 */
public class MainPanelTest {
    int oldInt;
    int myInt;
    public int _r = 1000;
    private int _maxSize = 10000;

    @Before
    public void setUp() throws Exception {


    }




    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testConvertToInt() throws Exception {
        for(int i = 1 ; i < 1000 ; i++) {
            oldInt = oldConvertToInt(i);
            myInt = convertToInt(i);
            assertEquals(myInt,oldInt);
        }
    }
    @Test
    public void testConvertToInt1() throws Exception {
        int i = 0;
            oldInt = oldConvertToInt(i);
            myInt = convertToInt(i);
            assertEquals(myInt,oldInt);
    }
    @Test
    public void testConvertToInt2() throws Exception {
            int i = Integer.MAX_VALUE;
            oldInt = oldConvertToInt(i);
            myInt = convertToInt(i);
            assertEquals(myInt,oldInt);
    }

    @Test
    public void testToStringCorrectInput() throws Exception {
        String input = "X";
        String test1 = toStringTest(input);
        String test2 = oldToStringTest(input);
        assertEquals(test1,test2);
    }
    @Test
    public void testToStringWrongInput() throws Exception {
        String input = "F";
        String test1 = toStringTest(input);
        String test2 = oldToStringTest(input);
        assertEquals(test1,test2);

    }
    @Test
    public void testToStringInput1() throws Exception {
        String input = "Z";
        String test1 = toStringTest(input);
        String test2 = oldToStringTest(input);
        assertEquals(test1,test2);

    }
    public int oldConvertToInt(int x) {
        int c = 0;
        String padding = "0";
        while (c < _r) {
            String l = new String("0");
            padding += l;
            c++;
        }
        String n = padding + String.valueOf(x);
        int q = Integer.parseInt(n);
        return q;
    }

    public int convertToInt(int x) {
        int q = x;
        return q;
    }

    public String toStringTest(String s) {
        String currentState = s;
        if (currentState.equals("X")) {
            return "X";
        } else {
            return ".";
        }
    }

    public String oldToStringTest(String s) {
        String toReturn = new String("");
        String currentState = s;
        for (int j = 0; j < _maxSize; j++) {
            toReturn += currentState;
        }
        if (toReturn.substring(0,1).equals("X")) {
            return toReturn.substring(0,1);
        } else {
            return ".";
        }
    }
}