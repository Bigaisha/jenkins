package tests.simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SkippedTests {

    @Test
    @Disabled
    void test0() {
        assertTrue(false);
    }
    @Test
    @Disabled("with some reason")
    void test1() {
        assertTrue(false);
    }

}
