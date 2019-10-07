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

}
