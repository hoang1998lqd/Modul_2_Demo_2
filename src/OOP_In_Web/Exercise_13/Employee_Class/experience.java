package OOP_In_Web.Exercise_13.Employee_Class;

import java.time.LocalDate;
import java.util.List;

public class experience extends employee {
    private int expOfYear;   // Số năm kinh nghiệm.
    private String proSkill;  // Kỹ năng chuyên môn



    public experience(String id, String name, LocalDate birthDay, String phoneNumber, String email, List<certificate> certificates, int expOfYear, String proSkill) {
        super(id, name, birthDay, phoneNumber, email, certificates);
        this.expOfYear = expOfYear;
        this.proSkill = proSkill;
    }

    @Override
    public String showInfo() {
        say();
        return null;
    }

    private void say() {
        System.out.println("Tên tôi là: " + this.getName() + " !");
        System.out.println("Hiện tôi đã có: " + this.getExpOfYear() + " năm kinh nghiệm trong lĩnh vực IT");
        System.out.println("Những kỹ năng mà tôi đã tích lũy được: " + this.getProSkill() + " trong những năm qua !!");
        System.out.println("Thông tin liên hệ: ");
        System.out.println("Số điện thoại: " + this.getPhoneNumber());
        System.out.println("Địa chỉ email: " + this.getEmail());
    }

    public int getExpOfYear() {
        return expOfYear;
    }

    public void setExpOfYear(int expOfYear) {
        this.expOfYear = expOfYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }



    @Override
    public String toString() {
        return super.toString() + "Experience{" +
                "ExpOfYear=" + expOfYear +
                ", ProSkill='" + proSkill + '\'' +
                '}';
    }

}
