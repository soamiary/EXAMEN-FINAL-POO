public class tutor {
    private int tutorId;
    private LocalDate tutorDateOfBirth
    private String tutorFirstName;
    private String tutorLastName;
    private String tutorEmail;
    private String tutorPhoneNumber;
    private String relativity;

    public tutor( int tutorId, LocalDate tutorDateOfBirth,String tutorFirstName, String tutorLastName, String tutorEmail, String tutorPhoneNumber, String relativity) {
        this.tutorId = tutorId;
        this.tutorDateOfBirth = tutorDateOfBirth;
        this.tutorFirstName = tutorFirstName;
        this.tutorLastName = tutorLastName;
        this.tutorEmail = tutorEmail;
        this.tutorPhoneNumber = tutorPhoneNumber;
    }
}