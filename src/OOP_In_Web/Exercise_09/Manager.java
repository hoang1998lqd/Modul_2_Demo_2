package OOP_In_Web.Exercise_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
   private final ArrayList<Client> clientArrayList;
   private final ArrayList<Bill> billArrayList;

    public Manager(ArrayList<Client> clientArrayList, ArrayList<Bill> billArrayList) {
        this.billArrayList = new ArrayList<>();
        this.clientArrayList =new ArrayList<>();
    }

    public void addClient (Scanner scanner){
        Client client = creatClient(scanner);
        clientArrayList.add(client);
    }

   public Client creatClient(Scanner scanner){
       System.out.println("Nhập tên chủ hộ: ");
       String name = scanner.nextLine();
       System.out.println("Nhập số nhà: ");
       int number = scanner.nextInt();
       System.out.println("Nhập số mã công tơ: ");
       int code = scanner.nextInt();
       return  new Client(name,number,code);
   }

   public void  addBill (Scanner scanner){
        Bill bill = creatBill(scanner);
        billArrayList.add(bill);
   }


   public Bill creatBill(Scanner scanner){
       System.out.println("Nhập chỉ sổ điện cũ: ");
       int oldE = scanner.nextInt();
       System.out.println("Nhập chỉ sổ điện mới: ");
       int newE = scanner.nextInt();
       scanner.nextLine();
       int cost = (newE - oldE) * 5;
       return new Bill(clientArrayList.get(clientArrayList.size()-1),oldE,newE,cost);
   }


   public void displayBill (){
        for (Bill bill: billArrayList){
            System.out.println(bill);
        }
    }


    @Override
    public String toString() {
        return "Manager{" +
                "clientArrayList=" + clientArrayList +
                ", billArrayList=" + billArrayList +
                '}';
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager(new ArrayList<>(),new ArrayList<>());

        manager.addClient(scanner);
        manager.addBill(scanner);
        System.out.println("*-----------------------------*");
        manager.addClient(scanner);
        manager.addBill(scanner);
//        manager.addBill(scanner); System.out.println("*-----------------------------*");

        System.out.println("*--------------------------------*");
        manager.addClient(scanner);
        manager.addBill(scanner);
        System.out.println("*--------------------------------*");
        manager.displayBill();







    }
}
