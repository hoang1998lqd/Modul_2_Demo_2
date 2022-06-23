package _16_IO_Text_File;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class max_Value {
    static class readFile{
        public  List<Long> integerList(String filePatch){
            List<Long> numbers = new ArrayList<>();
            try {
                File file = new File(filePatch);
                if (!file.exists()){
                    throw new FileNotFoundException();
                }
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = "";
                while ((line = reader.readLine()) != null){
                    numbers.add(Long.parseLong(line));
                    findMaxValue.findMax(numbers);
                }
                reader.close();
            }

            catch (Exception e){
                System.out.println( "File không tồn tại");
            }
            return numbers;
        }

        public void writeFile(String filePatch, long max){
            try {
                FileWriter fileWriter = new FileWriter(filePatch,true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("Giá trị lớn nhất là: " + max);
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    static class findMaxValue {
        public static long findMax (List<Long> numbers){
            long max = numbers.get(0);
            for (Long number : numbers) {
                if (max < number) {
                    max = number;
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        readFile readFile = new readFile();
        List<Long> numbers = readFile.integerList("C:\\Users\\Regalite\\Desktop\\numbers.txt");
        long  max = findMaxValue.findMax(numbers);
       readFile.writeFile("C:\\Users\\Regalite\\Desktop\\result.txt", max);


    }

}
