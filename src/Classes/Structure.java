package Classes;

public class Structure {
    public enum subject{
        ТеорСис,
        СоврТехнПрог,
        ТАУ,
        КомпТехн;
    }
public enum lecturer{
        Крапива,
    Сперанский,
    Бобриков,
    Ложечников;
}


    public int[] getAssessment() {
        return assessment;
    }

    public void setAssessment(int[] assessment) {
        this.assessment = assessment;
    }

    int[] assessment = new int[4];
//    String subject;
//    String secNameT;
//
//    public String getSubject() {
//        return subject;
//    }
//
//    public void setSubject(String subject) {
//        this.subject = subject;
//    }
//
//    public String getSecNameT() {
//        return secNameT;
//    }
//
//    public void setSecNameT(String secNameT) {
//        this.secNameT = secNameT;
//    }
//
//    public int getAssessment() {
//        return assessment;
//    }
//
//    public void setAssessment(int assessment) {
//        this.assessment = assessment;
//    }
//
//    int assessment;

}
