
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    App obj = new App();

    @Test
    public void testGradeA() {
        assertEquals("A", obj.calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", obj.calculateGrade(80));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", obj.calculateGrade(60));
    }

    @Test
    public void testFail() {
        assertEquals("Fail", obj.calculateGrade(30));
    }
}
