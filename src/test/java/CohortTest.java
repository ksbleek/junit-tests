import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {
    private Cohort cohort;
    private Student student;

    @Before
    public void setUp() {
        cohort = new Cohort();
        student = new Student(1, "John");
        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(95);
        cohort.addStudent(student);
    }
    @Test
    public void testGetCohortAverage() {
        double expectedAverage = (85 + 90 + 95) / 3.0;
        assertEquals(expectedAverage, cohort.getCohortAverage(), 0.001);
    }
    @Test
    public void testAddStudent() {
        Student newStudent = new Student(2, "Jane");
        newStudent.addGrade(90);
        newStudent.addGrade(95);
        newStudent.addGrade(100);
        cohort.addStudent(newStudent);
        assertEquals(2, cohort.getStudents().size());
    }
    @Test
    public void testGetStudents() {
        List<Student> students = cohort.getStudents();
        assertEquals(1, students.size());
        assertEquals(student, students.get(0));
    }

}