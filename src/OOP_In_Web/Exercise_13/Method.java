package OOP_In_Web.Exercise_13;

import OOP_In_Web.Exercise_13.Employee_Class.*;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Method {
    private List<employee>employees;
    public Method(){
        employees = new ArrayList<>();
    }


    // Thêm nhân viên.
    public void addEmployee (Scanner scanner){
        employee employee = creatEmployee(scanner);
        employees.add(employee);
    }


    // Tổng số nhân viên trong công ty
    public void totalEmployee(){
        long total;
        total = employees.size();
        System.out.println("Công ty hiện có " + total + " nhân viên");
    }

    // Tổng số nhân viên là Intern trong công ty
    public void totalIntern (long total){
        for (employee employee : employees){
            if (employee instanceof intern){
                total ++;
            }
        }
        System.out.println("Tổng số nhân viên trong công ty làm Intern là: " + total + " nhân viên");
    }

    // Tổng số nhân viên là Fresher trong công ty
    public void totalFresher (long total){
        for (employee employee : employees){
            if (employee instanceof fresher){
                total ++;
            }
        }
        System.out.println("Tổng số nhân viên trong công ty làm Fresher là: " + total + " nhân viên");
    }

    // Tổng số nhân viên là Experience trong công ty
    public void totalExperience (long total){
        for (employee employee : employees){
            if (employee instanceof experience){
                total ++;
            }
        }
        System.out.println("Tổng số nhân viên trong công ty làm Experience là: " + total + " nhân viên");
    }


    // Hiển thị danh sách nhân viên
    public void display(){
        for (employee employee: employees){
            System.out.println(employee);
        }
    }


    // Hiển thị bằng cấp:
    public void displayCertificates(){
        for (employee employee : employees){
            System.out.println(employee.getCertificates());
        }

    }


    // Hiển thị nhân viên theo lựa chọn
    public void displayByType(int choice, Scanner scanner){
        choice = Integer.parseInt(scanner.nextLine());
        System.out.println("1. Nhân viên Intern");
        System.out.println("2. Nhân viên Fresher");
        System.out.println("3. Nhân viên Experience");
        switch (choice){
            case 1:
                displayIntern();
                break;
            case 2:
                displayFresher();
                break;
            case 3:
                displayExperience();
                break;
            default:
                System.out.println("Bạn lựa chọn không chính xác !!!");
        }
    }

    //Hiển thị nhân viên là Intern
    public void displayIntern(){
        for (employee employee: employees){
            if (employee instanceof intern){
                System.out.println(employee);
            }
        }
    }

    //Hiển thị nhân viên là Fresher
    public void displayFresher(){
        for (employee employee: employees){
            if (employee instanceof fresher){
                System.out.println(employee);
            }
        }
    }

    //Hiển thị nhân viên là Experience
    public void displayExperience(){
        for (employee employee: employees){
            if (employee instanceof experience){
                System.out.println(employee);
            }
        }
    }

    // Sửa thông tin nhân viên
    public void editInfo(Scanner scanner){
        System.out.println("Nhập ID người cần sửa đổi");
        String id = scanner.nextLine();
        for (employee employee : employees){
            if (employee.getId().equals(id)){
                System.out.println("Nhập tên mới: ");
                String name = scanner.nextLine();
                String phone;
                do {
                    System.out.println("Nhập SĐT mới: ");
                    phone = scanner.nextLine();
                }while (!checkPhone(phone));
                String email;
                do {
                    System.out.println("Nhập email mới: ");
                    email = scanner.nextLine();
                }while (checkEmailInEmployee(email) && checkEmailByCharacter(email));
                employee.setName(name);
                employee.setPhoneNumber(phone);
                employee.setEmail(email);
            }
        }
    }


    // Nhập ngày tháng năm theo Local Date
    private LocalDate date(Scanner scanner) {
        System.out.println("-------------");
        System.out.println("Nhập ngày : ");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tháng : ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập năm : ");
        int year = Integer.parseInt(scanner.nextLine());
        return LocalDate.of(year,month,day);
    }

    // Tạo mới nhân viên
    public employee creatEmployee(Scanner scanner){
        String ID ;
        do {
            System.out.println("Nhập ID nhân viên: ");
            ID = scanner.nextLine();
        }while (!checkID(ID));
        System.out.println("Khai báo tên nhân viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh: ");
        LocalDate date = date(scanner);
        String phone ;
        do {
            System.out.println("Số điện thoại liên hệ: ");
            phone = scanner.nextLine();
        }while (!checkPhone(phone));
        String email;
        do {
            System.out.println("Nhập email của bạn: ");
            email = scanner.nextLine();
        }while (checkEmailInEmployee(email) && !checkEmailByCharacter(email));
        System.out.println("Kinh nghiệm nhân viên: ");
        System.out.println("1. Intern");
        System.out.println("2. Fresher");
        System.out.println("3. Experience");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                return setIntern(scanner, ID, name, date, phone, email);
            case 2:
                return setFresher(scanner, ID, name, date, phone, email);
            case 3:
                return setExperience(scanner, ID, name, date, phone, email);
            default:
                System.out.println("Lựa chọn không hợp lệ !!!");
                return null;
        }
    }

    // Thêm thông tin cho từng loại nhân viên khác nhau


    // Thêm thông tin cho nhân viên Experience.
    @NotNull
    private experience setExperience(Scanner scanner, String ID, String name, LocalDate date, String phone, String email) {
        System.out.println("Nhập số năm kinh nghiệm: ");
        int expOfYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Kỹ năng chuyên môn: ");
        String proSkill = scanner.nextLine();
        List<certificate> certificate1 = creatCertificate(scanner, name);
        experience experience = new experience(ID, name, date, phone, email, certificate1, expOfYear, proSkill);
        experience.addCertificates(certificate1);
        return experience;
    }


    // Thêm thông tin cho nhân viên Fresher
    @NotNull
    private fresher setFresher(Scanner scanner, String ID, String name, LocalDate date, String phone, String email) {
        System.out.println("Ngày tốt nghiệp: ");
        LocalDate graduationDate = date(scanner);
        System.out.println("Xếp loại học lực: ");
        String graduationRank = scanner.nextLine();
        System.out.println("Nhập trường đã tốt nghiệp: ");
        String universityName = scanner.nextLine();
        List<certificate> certificate = creatCertificate(scanner, name);
        fresher fresher = new fresher(ID, name, date, phone, email, certificate, graduationDate, graduationRank, universityName);
        fresher.addCertificates(certificate);
        return fresher;
    }

    // Thêm thông tin cho nhân viên Intern.
    @NotNull
    private intern setIntern(Scanner scanner, String ID, String name, LocalDate date, String phone, String email) {
        System.out.println("Nhập chuyên ngành đang học: ");
        String major = scanner.nextLine();
        System.out.println("Nhập học kỳ đang học: ");
        String semester = scanner.nextLine();
        System.out.println("Nhập trường đang theo học: ");
        String university_name = scanner.nextLine();
        return new intern(ID, name, date, phone, email, major, semester, university_name);
    }



    //Thêm bằng cho nhân viên
    public void updateCertificate(Scanner scanner){
        System.out.println("Nhập ID nhân viên cần thêm bằng: ");
        String id = scanner.nextLine();
        for (employee employee : employees){
            if (employee.getId().equals(id)){
                employee.setCertificates(creatCertificate(scanner,employee.getName()));
            }
        }
    }



    // Khởi tạo bằng cấp
    private List<certificate> creatCertificate(Scanner scanner, String name) {
        System.out.println("Nhập mã bằng: ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("Mức độ đạt được: ");
        int rank = Integer.parseInt(scanner.nextLine());
        System.out.println("Ngày nhận bằng: ");
        LocalDate date = date(scanner);
        List<certificate> certificates = new ArrayList<>();
        certificates.add(new certificate(code,name,rank, date));
        return certificates;
    }

    // Xóa nhân viên
    public void delete(Scanner scanner){
        System.out.println("Nhập ID cần xóa: ");
        String id =scanner.nextLine();
        for (employee employee : employees){
            if(employee.getId().equals(id)){
                employees.remove(employee);
                break;
            }
            else {
                System.out.println("Không tìm thấy ID là " + id + " để xóa !!!");
            }
        }
    }

    // OOP_In_Web.Exercise_13.OOP_In_Web.Exercise_13.OOP_In_Web.OOP_In_Web.Check ID trùng nhau trong mã nhân viên
    public boolean checkID (String ID){
        for (employee employee: employees){
            if (employee.getId().equals(ID)){
                return false;
            }
        }
        return true;
    }

    // OOP_In_Web.Exercise_13.OOP_In_Web.Exercise_13.OOP_In_Web.OOP_In_Web.Check ID trùng nhau trong bằng cấp.
    public boolean checkIDInCertificate(int ID){
        for (employee employee : employees){
          for (certificate certificate: employee.getCertificates()){
              if (certificate.getId() == ID){
                  return false;
              }
          }
        }
        return true;
    }

    // Kiểm tra số điện thoại nhập vào
    public boolean checkPhone (String phone){
        for (employee employee : employees){
            if (phone.length() != 10 || employee.getPhoneNumber().equals(phone) ){
                return false;
            }
        }
        return true;
    }

    // Kiểm tra email nhập vào theo đúng form quy định.
    // Sử dụng thư viện java.until.regex.
    public boolean checkEmailByCharacter (String email){
        String regex = "^[a-zA-Z]+[a-zA-Z0-9]*@{1}\\w+mail.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()){
            return true;
        }
        return false;
    }

    // Kiểm tra trung lặp email của các nhân viên trong công ty
    public boolean checkEmailInEmployee(String email){
        for (employee employee : employees){
            if (employee.getEmail().equals(email)){
                return false;
            }
        }
        return true;
    }


    // Giới thiệu bản thân.
    public void showInfo(Scanner scanner){
        System.out.println("Nhập ID người cần biết:");
        String id  = scanner.nextLine();
        for (employee employee : employees){
            if(employee.getId().equals(id)){
                employee.showInfo();
            }
        }
    }

    // Lưu danh sách vào file riêng biệt bằng Stream

     public void saveEmployee (File file){

        try{
            if (!file.exists()){
                file.createNewFile();
            }
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
//            for (employee employee : employees){
//                out.writeObject(employee);
//            }
            out.writeObject(employees);
            out.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
     }

     // Đọc file đã lưu bằng Stream

    public List<employee> readFile(File file){
        try {
            if (!file.exists()){
                file.createNewFile();
            }
            ObjectInputStream in  = new ObjectInputStream(new FileInputStream(file));
//            employee  staff = null;
            employees = (List<employee>) in.readObject();
            in.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return employees;
    }


}
