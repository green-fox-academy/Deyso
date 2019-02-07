import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void anagram_TwoAnagramIsEqual_ReturnTrue() {
        Anagram test = new Anagram();
        assertTrue(test.compare("valami", "imlava"));
    }

    @Test
    public void anagram_TwoAnagramIsNotEqual_ReturnFalse() {
        Anagram test = new Anagram();
        assertFalse(test.compare("fal", "fil"));
    }

    @Test
    public void anagram_TwoAnagramNumberIsEqual_ReturnTrue(){
        Anagram test = new Anagram();
        assertTrue(test.compare("5478","8547"));
    }


}