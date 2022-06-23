package OOP_In_Web.Excercise_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Method {
    private List<Vehicle> vehicles;

    public Method(){
      vehicles = new ArrayList<>();
    }
     // Thêm phương tiện

    public void addVehicle(Scanner scanner){
        Vehicle vehicle = creatVehicle(scanner);
        vehicles.add(vehicle);
    }

    // Khởi tạo thông tin
    public Vehicle creatVehicle(Scanner scanner){
        int ID ;
        do {
            System.out.println("Nhập ID phương tiện: ");
            ID = Integer.parseInt(scanner.nextLine());
        }while (!checkID(ID));
        System.out.println("Nhập hãng xe: ");
        String company = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá bán xe: ");
        int cost = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập màu sắc của xe: ");
        String color = scanner.nextLine();
        System.out.println("1. Car");
        System.out.println("2. Motor");
        System.out.println("3. Truck");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println("Nhập số chỗ ngồi: ");
                int seat = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập kiểu động cơ: ");
                String engine = scanner.nextLine();
                return new Car(ID,company,year,cost,color,seat,engine);
            case 2:
                System.out.println("Nhập công suất xe: ");
                int capacity = Integer.parseInt(scanner.nextLine());
                return new Motor(ID,company,year,cost,color,capacity);
            case 3:
                System.out.println("Nhập trọng tải của xe: ");
                int tonnage = Integer.parseInt(scanner.nextLine());
                return new Truck(ID,company,year,cost,color,tonnage);
        }
        return null;
    }

    // Hiển thị Vehicle
    public void displayVehicle(){
        for (Vehicle vehicle: vehicles){
            System.out.println(vehicle);
        }
    }

    // Xóa đối tượng theo ID
    public void deleteByID(Scanner scanner){
        System.out.println("Nhập ID cần xóa: ");
        int ID = Integer.parseInt(scanner.nextLine());
        vehicles.removeIf(vehicle -> ID == vehicle.getID());
    }

    // kiểm tra ID
    public boolean checkID (int ID){
        for (Vehicle vehicle: vehicles){
            if (ID == vehicle.getID()){
                return false;
            }
        }
        return true;
    }

    // Hiển thị đối tượng loại xe
    public void displayByCategory(Scanner scanner){
        System.out.println("Hiển thị tùy chọn ???");
        System.out.println("1. Hiển thị Car");
        System.out.println("2. Hiển thị Motor");
        System.out.println("3. Hiển thị Truck");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                for (Vehicle vehicle:vehicles){
                    if (vehicle instanceof Car){
                        System.out.println(vehicle);
                    }
                }
                break;
            case 2:
                for (Vehicle vehicle:vehicles){
                    if (vehicle instanceof Motor){
                        System.out.println(vehicle);
                    }
                }

                break;
            case 3:
                for (Vehicle vehicle:vehicles){
                    if (vehicle instanceof Truck){
                        System.out.println(vehicle);
                    }
                }
                break;
        }

    }

    // Hiển thị theo màu sắc
    public void displayByColor(Scanner scanner){
        System.out.println("Nhập màu xe bạn muốn hiển thị ? ");
        String color = scanner.nextLine();
        for (Vehicle vehicle: vehicles){
            if (color.equals(vehicle.getColor())){
                System.out.println(vehicle);
            }
        }
    }

    // Hiển thị theo hãng xe
    public void displayByCompany(Scanner scanner){
        System.out.println("Nhập màu xe bạn muốn hiển thị ? ");
        String color = scanner.nextLine();
        for (Vehicle vehicle: vehicles){
            if (color.equals(vehicle.getColor())){
                System.out.println(vehicle);
            }
        }
    }

    // Hiển thị theo sự lựa chọn
    public void display(Scanner scanner){
        System.out.println("1. Theo hãng sản xuất.");
        System.out.println("2. Theo loại phương tiện .");
        System.out.println("3. Theo màu sắc của phương tiện.");
        System.out.println("4. Hiển thị tất cả phương tiện.");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                displayByCompany(scanner);
                break;
                case 2:
                displayByCategory(scanner);
                break;
                case 3:
                displayByColor(scanner);
                break;
                case 4:
                displayVehicle();
                break;
            default:
                System.out.println("Lựa chọn không đúng !!!");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Method method = new Method();
        method.addVehicle(scanner);
        method.addVehicle(scanner);
        method.addVehicle(scanner);
        method.addVehicle(scanner);
        method.addVehicle(scanner);


        System.out.println("----------------------");
        method.displayByCompany(scanner);
        System.out.println("-----------------------------");
        method.displayByColor(scanner);
        System.out.println("------------------------------");
        System.out.println("Mảng ban đầu");
        method.displayVehicle();
        method.deleteByID(scanner);
        System.out.println("Mảng sau khi xóa");
        method.displayVehicle();

    }

}
