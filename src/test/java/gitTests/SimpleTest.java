package gitTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {

    @Test
    void assertTestTrue () {
        assertTrue (5 > 2);
    }

    @Test
    void assertTestRefactor () {
        assertFalse (5 < 2);
    }
}
