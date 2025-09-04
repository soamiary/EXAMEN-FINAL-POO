import java.time.Instant;
import java.util.List;

public class GradeManager {
    private List<Grade> grades;

    public GradeManager(List<Grade> grades) {
        this.grades = grades;
    }

    public double getExamGrade(Exam exam, student student, Instant t) {
        for (Grade g : grades) {
            if (g.getExam().equals(exam) && g.getStudent().equals(student)) {
                return g.getGradeAt(t);
            }
        }
        return 0;
    }

    public double getCourseGrade(Course course, student student, Instant t) {
        double total = 0;
        int totalCoeff = 0;

        for (Grade g : grades) {
            if (g.getExam().getCourse().equals(course) && g.getStudent().equals(student)) {
                int coeff = g.getExam().getCoefficient();
                total += g.getGradeAt(t) * coeff;
                totalCoeff += coeff;
            }
        }

        return totalCoeff == 0 ? 0 : total / totalCoeff;
    }
}
