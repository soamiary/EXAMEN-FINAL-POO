import java.time.LocalDate;
import java.util.Date;

public class teacher {
    private int idTeacher;
    private String firstNameTeacher;
    private String lastNameTeacher;
    private String emailTeacher;
    private LocalDate DateOfBirthTeacher;
    private String teacherPhone;
    private String speciality;

    public teacher( int idTeacher, String firstNameTeacher,String lastNameTeacher,
                    String emailTeacher,LocalDate DateOfBirthTeacher,String teacherPhone,String speciality) {
        this.idTeacher = idTeacher;
        this.firstNameTeacher = firstNameTeacher;
        this.lastNameTeacher = lastNameTeacher;
        this.emailTeacher = emailTeacher;
        this.DateOfBirthTeacher = DateOfBirthTeacher;
        this.teacherPhone = teacherPhone;
        this.speciality = speciality;

    }

}