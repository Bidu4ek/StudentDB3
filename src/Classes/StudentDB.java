package Classes;

import java.util.ArrayList;

public class StudentDB extends Student{
   public ArrayList<Student> students = new ArrayList<>();
   public void add(Student st){
      this.students.add(st);
   }

   public void remove(int n){
      this.students.remove(n);
   }

   public Student get(int n){
      return this.students.get(n);
   }

}
