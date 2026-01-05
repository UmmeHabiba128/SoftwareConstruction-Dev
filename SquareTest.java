package junittesting123;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquareTest {

    @Test
    public void testSquare() {
        int num = 4;
        int result = num * num;
        assertEquals(16, result);
    }
}
