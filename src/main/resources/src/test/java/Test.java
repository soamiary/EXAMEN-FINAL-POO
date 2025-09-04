import org.junit.jupiter.api.Test;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeManagerTest {

    @Test
    public void testExamAndCourseGrades() {

        tutor tutor1 = new tutor(1, LocalDate.of(1970,12,1), "Jean", "Marc",
                "JeanMarc@example.com", "123456789", "Père");


        student student1 = new student(1, "Alice", "Martin", "alice@example.com",
                new java.util.Date(), "987654321", "G1");


        teacher teacher1 = new teacher(1, "Bob", "Durand", "bob@example.com",
                LocalDate.of(1980,2,2), "111222333", "Java");


        Course course1 = new Course(1, "PROG1", 6, teacher1);


        Exam exam1 = new Exam(1, "Examen 1", course1, Instant.now(), 2);
        Exam exam2 = new Exam(2, "Examen 2", course1, Instant.now(), 3);


        Grade grade1 = new Grade(student1, exam1, 10, "Initial");
        Grade grade2 = new Grade(student1, exam2, 15, "Initial");


        List<Grade> grades = new ArrayList<>();
        grades.add(grade1);
        grades.add(grade2);


        GradeManager manager = new GradeManager(grades);


        double examGrade = manager.getExamGrade(exam1, student1, Instant.now());
        assertEquals(10, examGrade, 0.01);


        double courseGrade = manager.getCourseGrade(course1, student1, Instant.now());
        assertEquals((10*2 + 15*3)/5.0, courseGrade, 0.01);


        grade1.updateGrade(12, "Correction erreur");


        double updatedExamGrade = manager.getExamGrade(exam1, student1, Instant.now());
        assertEquals(12, updatedExamGrade, 0.01);


        double updatedCourseGrade = manager.getCourseGrade(course1, student1, Instant.now());
        assertEquals((12*2 + 15*3)/5.0, updatedCourseGrade, 0.01);
    }
}
