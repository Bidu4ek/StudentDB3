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
    public void WriteDB(StudentDB std, String string) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(string, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Iterator<Student> stIterator = std.students.iterator();
        while (stIterator.hasNext()) {
            Student nextSt = stIterator.next();
            try {
                writer.write("ФИО: " + nextSt.getName() + "\r\n" + "Номер зачетки: " + nextSt.getNumberRecord() +
                        "\r\n" + "Факультет: " + nextSt.getFaculty() + "\r\n" +
                        "Курс: " + nextSt.getCourse() + "\r\n\r\n\r\n" + System.getProperty("line.separator"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readDB(String strName) {
        StudentDB rDB = new StudentDB();
            int line = 0;
            try {
                FileReader reader = new FileReader(strName);
                Scanner read = new Scanner(reader);
                while (read.hasNextLine()){
                    
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
    }
}


//   public Student ReadDB(){
//        Student
//    }


