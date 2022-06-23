package _16_IO_Text_File;


import java.io.*;
import java.util.Scanner;

public class test {
    public void readFileText(String filePath){
        try{
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = reader.readLine())!= null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println("Tổng là: " + sum);
            reader.close();
        }catch (Exception e) {
            System.out.println("File không tồn tại hoặc nội dung có lỗi");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        test test = new test();
        test.readFileText(path);

    }


}
