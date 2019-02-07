import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
    @Test
    public void getString_string_ReturnsApple(){
        Apples apple = new Apples("apple");
        String etwas = apple.getGivenString();
        assertEquals("apple",etwas);

    }

}