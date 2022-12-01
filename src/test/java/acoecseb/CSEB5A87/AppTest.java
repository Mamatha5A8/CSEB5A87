package acoecseb.CSEB5A87;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	@Test
    public void test() {

        App p = new App();
        assertEquals("Hello ACOE", p.getMessage("GOOD MORNING"));

    }
}
