package Classes;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentDB {
    public Student[] getList() {
        return list;
    }

    ArrayList<Student> list2;
    public Student[] list;

    public StudentDB() {
        this.list = new Student[0];
        this.list2 = new ArrayList<>();
    }

    public StudentDB(int length) {
        this.list = new Student[length];
        this.list2 = new ArrayList<>(length);
    }

    public void resize(int newLength)
    {
        Student[] tempList = new Student[newLength];
        tempList = Arrays.copyOf(this.list, newLength);

        this.list = tempList;
    }

    public void addToList(Student student)
    {
        list2.add(student);
    }

    public void add(Student student, int position) {
        if (position > list.length-1) {
            this.resize(position);
            list[position-1] = student;
        }
        else if (position > 0 && position < list.length)
            list[position-1] = student;
    }

    public void add(Student student)
    {
        int i = list.length-1;
        for (; i >= 0 && list[i] != null; i--);

        if (i == -1) {
            resize(list.length + 1);
            list[list.length-1] = student;
        }
        else
            list[i-1] = student;

    }

    public Student remove(int position)
    {
        if (position >=0 && position < list.length)
        {
            Student student = list[position-1];
            for (int i = position-1; i < list.length-1; i++) {
                list[i] = list[i+1];
            }

            resize(list.length-1);

            return student;
        }
        return null;
    }

    public void clear()
    {
        resize(0);
    }
}
