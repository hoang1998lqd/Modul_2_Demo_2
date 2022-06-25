package OOP_In_Web.Exercise_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class accountAndPassword {
    static class account{
        public String account;
        public String password;

        public account(String account, String password) {
            this.account = account;
            this.password = password;
        }

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "account{" +
                    "account='" + account + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

    public boolean checkAccount(List<account> list, String account1, String password){
        for (account account : list){
            if (account.getAccount().equals(account1) && account.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }


    public boolean checkAdmin(String account1, String password1){
        return account1.equals("admin") && password1.equals("admin");
    }

    public static void main(String[] args) {
        accountAndPassword demo = new accountAndPassword();
        Scanner scanner = new Scanner(System.in);
        List<account> list = new ArrayList<>();
        account account1 = new account("hoang1998","anh27121997");
        account account2 = new account("hoang","123456");
        account account3 = new account("concac","123456");
        account account4 = new account("nammoi","123456");
        list.add(account1);
        list.add(account2);
        list.add(account3);
        list.add(account4);
        System.out.println(list);
        String account;
        String password;
        int count = 0;
        do {
            System.out.println("Tài khoản: ");
             account = scanner.nextLine();
            System.out.println("Mật khẩu: ");
             password = scanner.nextLine();
            if ( !demo.checkAccount(list, account, password) && !demo.checkAdmin(account,password)){
                System.out.println("Tài khoản hoặc mật khẩu không chính xác !!!");
                count ++;
            }
            if (demo.checkAccount(list, account, password)) {
                System.out.println("Đây là dòng lệnh được thực thi dưới quyền người dùng");
                count = 1;
                break;
            } else if (demo.checkAdmin(account,password)){
                System.out.println("Đây là dòng lệnh được thực thi dưới quyền Admin !!!");
                count = 1;
                break;
            }
        }while (count != 3 && !demo.checkAccount(list, account, password) || (account.equals("admin") || password.equals("admin")));
        if (count == 3){
            System.out.println("Bạn đã nhập sai 3 lần vui lòng thử lại sau !!!");
        }
    }
}




