
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentTest {
    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student(1L, "John Doe");
        student.addGrade(90);
        student.addGrade(85);
        student.addGrade(88);
    }

    @Test
    public void testGetId() {
        assertEquals(1L, student.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", student.getName());
    }

    @Test
    public void testGetGrades() {
        assertEquals(new ArrayList<>(Arrays.asList(90, 85, 88)), student.getGrades());
    }

    @Test
    public void testAddGrade() {
        student.addGrade(95);
        assertTrue(student.getGrades().contains(95));
    }

    @Test
    public void testGetGradeAverage() {
        Student student = new Student(1, "John");
        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(95);
        assertEquals(90.0, student.getGradeAverage());
    }

    @Test
    public void testGetGradeAverageEmptyList() {
        Student student = new Student(2, "Jane");
        assertEquals(0.0, student.getGradeAverage());
    }
}