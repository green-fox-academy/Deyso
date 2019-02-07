import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void sum_PositiveValue_ReturnPositiveValue(){

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,3,4,5,6));
        assertEquals(20,Sum.sum(numbers));
    }

    @Test
    public void sum_NegativValue_ReturnNegativeNumber(){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-2,-3,-4,-5,-6));
        assertEquals(-20,Sum.sum(numbers));
    }

    @Test
    public void sum_NegativeAndPositiveValue_ReturnAmbiguous(){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,-3,4,-5,6));
        assertEquals(4,Sum.sum(numbers));
    }

    @Test
    public void sum_OneNumber_ReturnOneNumber(){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(257));
        assertEquals(257,Sum.sum(numbers));
    }

    @Test(expected = NullPointerException.class)
    public void sum_NullValue_ReturnsThatValue(){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(null));
    }


}