package OOP_In_Web.Exercise_13.Employee_Class;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class employee implements Serializable {
    public String id;
    public String name;
    public LocalDate birthDay;
    public String phoneNumber;
    public String email;
    public List<certificate>certificates = new ArrayList<>();

    public employee() {
    }

    public employee(String id, String name, LocalDate birthDay, String phoneNumber, String email, List<certificate> certificates) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.certificates = certificates;
    }

    public employee(String id, String name, LocalDate birthDay, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }


    public abstract String showInfo();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<certificate> getCertificates() {
        return certificates;
    }


    public void setCertificates(List<certificate> certificates1) {
        certificates.addAll(certificates1);
    }
    public void addCertificates(List<certificate> certificate){
        this.certificates = certificate;
    }


    @Override
    public String toString() {
        return "employee{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", BirthDay=" + birthDay +
                ", PhoneNumber=" + phoneNumber +
                ", Email='" + email + '\'' +
                ", Certificates=" + certificates +
                '}';
    }
}
