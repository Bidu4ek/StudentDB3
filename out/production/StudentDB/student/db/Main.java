package student.db;

import Classes.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String help;
        int equals;
        String name;
        String numZach;
        String fac;
        String prevStatus = null;
        String bStat = "badly";
        String pStat = "perfect";
        String gStat = "good";
        int curs;
        Structure struct = new Structure();
        Check check = new Check();
        StudentDB stDb = new StudentDB();
        String fileName;
        int[] ass=new int[4];
        boolean readStatus = false;
        String nameFile;
        Scanner in = new Scanner(System.in);
        OutTXT oTxt = new OutTXT();
       while (!readStatus) {
           System.out.print("Введите название файла, который необходимо прочесть (без формата): ");
           nameFile = in.nextLine();
           readStatus = oTxt.copy(nameFile);
       }
        System.out.print("Введите кол-во студентов:");
        help = in.nextLine();
        while (!check.numIsCorrect(help)){
            System.out.print("\r\nВведенно неверное значение:");
            help = in.nextLine();
        }
        equals = Integer.parseInt(help);

        for(int i=0;i<equals;i++){
            Student studen = new Student();
            System.out.print("\r\nФамилия и инциалы студента №" + Integer.toString(i + 1) + ":");
            name = in.nextLine();
            System.out.print("\r\nНомер зачетки:");
            numZach = in.nextLine();
            System.out.print("\r\nФакультет:");
            fac = in.nextLine();
            System.out.print("\r\nКурс:");
            help = in.nextLine();
            while (!check.cursIsCorrect(help)){
                System.out.print("\r\nВведенно неверное значение:");
                help = in.nextLine();
            }
            curs = Integer.parseInt(help);

            for (int j=0;j<4;j++){
//                struct[j] = new Structure();
//                System.out.print("\r\nНазвание " + Integer.toString(j+1) + " предмета:" );
//                help = in.nextLine();
//                struct[j].setSubject(help);
//                System.out.print("\r\nФамилия преподователя:");
//                help = in.nextLine();
//                struct[j].setSecNameT(help);
                System.out.print("\r\nПредмет:"+ Structure.subject.values()[j].toString());
                System.out.print("\r\nПреподователь:"+ Structure.lecturer.values()[j].toString());
                System.out.print("\r\nОценка за данный предмет:");
                help = in.nextLine();
                while (!check.assIsCorrect(help)){
                    System.out.print("\r\nВведенно неверное значение:");
                    help = in.nextLine();
                }
                ass[j] = Integer.parseInt(help);
                if(prevStatus!=bStat)
                    if(prevStatus!=gStat)
                        prevStatus = check.status(Integer.parseInt(help));

            }
struct.setAssessment(ass);
            studen.setStatus(prevStatus);
            studen.setName(name);
            studen.setNumberRecord(numZach);
            studen.setFaculty(fac);
            studen.setCourse(curs);
            studen.setStructure(struct);
            stDb.add(studen);
        }
        oTxt.WriteDB(stDb, "List.txt");
        }
//        Iterator<Student> stIterator = stDb.students.iterator();
//            System.out.print("\r\nСведения о студентах отличниках:");
//        int tact = 0;
//        int tact1=0;
//while (stIterator.hasNext()){
//    Student nextSt = stIterator.next();
//    if(nextSt.getStatus()==pStat){
//        tact++;
//        System.out.print("\r\nФИО: "+nextSt.getName() + "\r\nНомер зачетки:" + nextSt.getNumberRecord()
//        + "\r\nФакультет:" + nextSt.getFaculty() + "\r\nКурс:" + nextSt.getCourse());
//    }
//}
//
//        if(tact==0)
//                System.out.print("Студентов отличников нет");
//        System.out.print("\r\nСведения о студентах имеющих хотя бы одну двойку:");
//        tact = 0;
//        Iterator<Student> stIterator1 = stDb.students.iterator();
//        while (stIterator1.hasNext()){
//            Student nextSt1 = stIterator1.next();
//            if(nextSt1.getStatus()=="badly"){
//                tact++;
//                System.out.print("\r\nФИО: "+nextSt1.getName() + "\r\nНомер зачетки:" + nextSt1.getNumberRecord()
//                        + "\r\nФакультет:" + nextSt1.getFaculty() + "\r\nКурс:" + nextSt1.getCourse());
//            stDb.students.remove(tact1);
//            }
//            tact1++;
//        }
//        if(tact==0)
//            System.out.print("Студентов имеющих двойки нет");
//
    }

