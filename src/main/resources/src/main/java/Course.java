public class Course {
    private int idCourse;
    private String label;
    private int credits;
    private teacher courseTeacher;

    public Course(int idCourse, String label, int credits, teacher courseTeacher) {
        this.idCourse = idCourse;
        this.label = label;
        this.credits = credits;
        this.courseTeacher = courseTeacher;
    }

    public int getIdCourse() { return idCourse; }
    public void setIdCourse(int idCourse) { this.idCourse = idCourse; }

    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }

    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }

    public teacher getCourseTeacher() { return courseTeacher; }
    public void setCourseTeacher(teacher courseTeacher) { this.courseTeacher = courseTeacher; }
}
