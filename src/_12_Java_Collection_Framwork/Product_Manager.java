package _12_Java_Collection_Framwork;

import java.util.ArrayList;
import java.util.Scanner;

public class Product_Manager {
    ArrayList<Product> products = new ArrayList<>();

    // Thêm sản phẩm
    public void add(Scanner scanner){
        Product product = create(scanner);
        products.add(product);
    }
    public Product create(Scanner scanner){
        System.out.println("Nhập ID sản phẩm: ");
        int ID = scanner.nextInt();
        System.out.println("Nhập tên sản phẩm");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhập giá của sản phẩm: ");
        int price = scanner.nextInt();
        return new Product(ID,name,price);
    }

    // Edit sản phẩm
    public void edit(Scanner scanner){
       for (Product product: products){
          if (checkID(scanner)){
              System.out.println("ID mới: ");
              product.setId(scanner.nextInt());
              System.out.println("Nhập tên mới: ");
              product.setName(scanner.nextLine());
              System.out.println("Nhập giá mới: ");
              product.setPrice(scanner.nextInt());
          }
       }
    }
    // Xóa sản phẩm theo ID
    public void deleteById(Scanner scanner){
        products.removeIf(product -> checkID(scanner));
    }



    // Tìm theo ID
    public boolean checkID(Scanner scanner){
        System.out.println("Nhập ID cần tìm");
        int ID = scanner.nextInt();
        for (Product product: products){
            if (ID == product.getId()){
                return true;
            }
        }
        return false;
    }


    // Sắp xếp theo giá tăng dần




    // Tìm kiếm theo tên sản phẩm:
    public void checkName(Scanner scanner){
        System.out.println("Nhập tên cần tìm kiếm: ");
        String name = scanner.nextLine();
        for (Product product: products){
            if (name.equals(product.getName())){
                System.out.println(product);
            }
        }
    }



    // Hiển thị sản phẩm
    public  void display(){
        for (Product product: products){
            System.out.println(product);
        }
    }



    public static void main(String[] args) {
        Product_Manager product_manager = new Product_Manager();
        Scanner scanner = new Scanner(System.in);
        product_manager.add(scanner);
        product_manager.add(scanner);
        product_manager.add(scanner);
        product_manager.add(scanner);
        product_manager.add(scanner);
        System.out.println("Dãy ban đầu");
        product_manager.display();
        System.out.println(" --------------------------------------------");

        product_manager.edit(scanner);
        System.out.println("Dãy sau khi sửa ");
        product_manager.display();
        System.out.println("-----------------------------------");

        product_manager.deleteById(scanner);
        System.out.println("Dãy sau khi xóa");
        product_manager.display();
        System.out.println("-----------------------------------------");

        product_manager.checkName(scanner);
        System.out.println(" ----------------------------------");


    }

}
