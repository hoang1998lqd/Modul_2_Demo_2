package OOP_In_Web.Exercise_13;

import java.io.File;
import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Method method = new Method();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("***********************************");
            System.out.println("Quản lý thông tin nhân viên...");
            System.out.println("1. Thêm nhân viên.");
            System.out.println("2. Sửa thông tin nhân viên.");
            System.out.println("3. Xóa thông tin nhân viên theo ID.");
            System.out.println("4. Hiển thị tất cả nhân viên trong công ty.");
            System.out.println("5. Hiển thị thông tin nhân viên theo kinh nghiệm.");
            System.out.println("6. Hiển thị bằng cấp.");
            System.out.println("7. Hiển thị tổng số nhân viên trong công ty.");
            System.out.println("8. Cập nhật bằng cho nhân viên.");
            System.out.println("9. Giới thiệu bản thân.");
            System.out.println("10. Lưu file dưới dạng txt.");
            System.out.println("11. Xuất dữ liệu đã lưu.");
            System.out.println("0. Thoát.");
            System.out.println("******************************************");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    method.addEmployee(scanner);
                    break;
                case 2:
                    method.editInfo(scanner);
                    break;
                case 3:
                    method.delete(scanner);
                    break;
                case 4:
                    method.display();
                    break;
                case 5:
                    method.displayByType(choice,scanner);
                    break;
                case 6:
                    method.displayCertificates();
                    break;
                case 7:
                    method.totalEmployee();
                    break;
                case 8:
                    method.updateCertificate(scanner);
                    break;
                case 9:
                    method.showInfo(scanner);
                    break;
                case 10:
                    System.out.println("Nhập File: ");
                    String nameFile = scanner.nextLine();
                    File file = new File(nameFile);
                    method.saveEmployee(file);
                    break;
                case 11:
                    System.out.println("Nhập File: ");
                    String name = scanner.nextLine();
                    File file1 = new File(name);
                    method.readFile(file1);
                    break;
                default:
                    System.out.println("Bạn chọn không chính xác !!!");
            }
        }while (choice != 0);

    }
}
