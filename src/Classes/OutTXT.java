package Classes;

import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OutTXT {
    public boolean WriteDB(StudentDB std, String string) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(string + ".txt", false);
        Iterator<Student> stIterator = std.students.iterator();
        while (stIterator.hasNext()) {
            Student nextSt = stIterator.next();
                writer.write("ФИО: " + nextSt.getName() + "\r\n" + "Номер зачетки: " + nextSt.getNumberRecord() +
                        "\r\n" + "Факультет: " + nextSt.getFaculty() + "\r\n" +
                        "Курс: " + nextSt.getCourse() + "\r\n\r\n\r\n" + System.getProperty("line.separator"));
            }
            writer.close();
        return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean readDB(String strName) {
            try {
                FileReader reader = new FileReader(strName + ".txt");
                Scanner read = new Scanner(reader);
                while (read.hasNextLine()){
                   System.out.println(read.nextLine());
                }
                read.close();
                return true;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return false;
            }
    }
    public boolean copy(String fileName)
    {
        try {
            {
                FileReader reader = new FileReader(fileName + ".txt");
                Scanner read = new Scanner(reader);
                FileWriter writer = new FileWriter(fileName + "(1).txt");
                while (read.hasNextLine()){
                    writer.write(read.nextLine()+"\r\n");
                }
                reader.close();
                writer.close();
            }
            return true;
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.print("Файл не найден!");
            return false;
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.print("Ошибка записи файла!");
            return false;
        }
    }
}


//   public Student ReadDB(){
//        Student
//    }


