package _16_IO_Text_File;

import java.io.*;

public class old {
    public static void main(String[] args) {
        File file = new File("old");
        try {
            if (!file.exists()){
                file.createNewFile();
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
            writer.write("Hello World \n");
            writer.write("It's beautiful day \n");
            writer.write("Goodbye World \n");
            writer.close();

        }
        catch (IOException e){
            System.out.println("Sai con mẹ nó rồi !!!");
        }

        File file1 = new File("new");
        File file2 = new File("old");
        try {
            if (!file1.exists()){
                file1.createNewFile();
            }
            FileReader fileReader = new FileReader(file2);
            BufferedReader reader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter  = new BufferedWriter(new FileWriter(file1,false));
            String line;
            while  ((line = reader.readLine()) != null){
                 bufferedWriter.write(line);
                 bufferedWriter.write("\n");
            }
            bufferedWriter.close();
            reader.close();

        }
        catch (IOException e){
            System.out.println("Sai con mẹ nó rồi");
        }
    }
}
