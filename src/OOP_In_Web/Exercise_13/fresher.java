package OOP_In_Web.Exercise_13;

import java.time.LocalDate;
import java.util.List;

public class fresher extends employee{
    private LocalDate graduation_date;  // Thời gian tốt nghiệp
    private String graduation_rank;     // Xếp loại học lực
    private String university_name;     // Tên trường tốt nghiệp


    public fresher(String id, String name, LocalDate birthDay, String phoneNumber, String email, List<certificate> certificates, LocalDate graduation_date, String graduation_rank, String university_name) {
        super(id, name, birthDay, phoneNumber, email, certificates);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.university_name = university_name;
    }

    @Override
    public String showInfo() {

        return null;
    }
    public LocalDate getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(LocalDate graduation_date) {
        this.graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.graduation_rank = graduation_rank;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }



    @Override
    public String toString() {
        return super.toString() +"Fresher{" +
                "Graduation_date=" + graduation_date +
                ", Graduation_rank='" + graduation_rank + '\'' +
                ", University_name='" + university_name + '\'' +
                '}';
    }
}
