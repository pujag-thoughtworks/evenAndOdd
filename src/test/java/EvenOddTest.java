import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by pujag on 6/6/17.
 */
public class EvenOddTest {
    @Test
    public void twoshouldBeEven() {
        EvenAndOdd evn=new EvenAndOdd(2);
        assertTrue(evn.isEven());
    }

}
