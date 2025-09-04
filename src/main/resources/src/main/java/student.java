public class student {
    private int id;
    private Sring lastName;
    private String firstName;
    private String email;
    private Date dateOfBirth;
    private String studentPhone;
    private String group;

    public student(int id, String firstName, String lastName,
                   String email, Date dateOfBirth, String studentPhone , String group) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.studentPhone = studentPhone;
        this.group = group;

    }
}
