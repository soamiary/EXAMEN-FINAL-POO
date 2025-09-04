import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Grade {
    public static class Change {
        private Instant timestamp;
        private double value;
        private String reason;

        public Change(Instant timestamp, double value, String reason) {
            this.timestamp = timestamp;
            this.value = value;
            this.reason = reason;
        }

        public Instant getTimestamp() { return timestamp; }
        public double getValue() { return value; }
        public String getReason() { return reason; }
    }

    private student student;
    private Exam exam;
    private List<Change> history;

    public Grade(student student, Exam exam, double initialValue, String reason) {
        this.student = student;
        this.exam = exam;
        this.history = new ArrayList<>();
        this.history.add(new Change(Instant.now(), initialValue, reason));
    }

    public void updateGrade(double newValue, String reason) {
        this.history.add(new Change(Instant.now(), newValue, reason));
    }

    public double getGradeAt(Instant t) {
        double lastValue = 0;
        for (Change c : history) {
            if (!c.getTimestamp().isAfter(t)) {
                lastValue = c.getValue();
            } else {
                break;
            }
        }
        return lastValue;
    }

    public student getStudent() { return student; }
    public void setStudent(student student) { this.student = student; }

    public Exam getExam() { return exam; }
    public void setExam(Exam exam) { this.exam = exam; }

    public List<Change> getHistory() { return history; }
    public void setHistory(List<Change> history) { this.history = history; }
}
