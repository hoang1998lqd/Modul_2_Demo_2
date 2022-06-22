package OOP_In_Web.Exercise_13;

import java.time.LocalDate;

public class intern extends employee{
    private String major;  // chuyên ngành học
    private String semester;  // học kỳ đang học
    private String university_name;


    public intern(String  id, String name, LocalDate birthDay, String phoneNumber, String email, String major, String semester, String university_name) {
        super(id, name, birthDay, phoneNumber, email);
        this.major = major;
        this.semester = semester;
        this.university_name = university_name;
    }

    public String showInfo() {

        return null;
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }


    @Override
    public String toString() {
        return super.toString() +"Intern{" +
                "Major='" + major + '\'' +
                ", Semester='" + semester + '\'' +
                ", University_name='" + university_name + '\'' +
                '}';
    }
}
