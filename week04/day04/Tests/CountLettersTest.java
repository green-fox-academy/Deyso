import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;


public class CountLettersTest {

    @Test
    public void count_Sequence_ReturnA(){
        CountLetters etwasWord = new CountLetters();
        HashMap valami = etwasWord.givenString("blablaa");
        assertEquals(2,valami.get('b'));
    }


}