import java.time.Instant;

public class Exam {
    private int examId;
    private String title;
    private Course course;
    private Instant examDate;
    private int coefficient;

    public Exam(int examId, String title, Course course, Instant examDate, int coefficient) {
        this.examId = examId;
        this.title = title;
        this.course = course;
        this.examDate = examDate;
        this.coefficient = coefficient;
    }

    public int getExamId() { return examId; }
    public void setExamId(int examId) { this.examId = examId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }

    public Instant getExamDate() { return examDate; }
    public void setExamDate(Instant examDate) { this.examDate = examDate; }

    public int getCoefficient() { return coefficient; }
    public void setCoefficient(int coefficient) { this.coefficient = coefficient; }
}
