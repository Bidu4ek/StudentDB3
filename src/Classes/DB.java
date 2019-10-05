package Classes;

public class DB {
    public String[] getFullName() {
        return fullName;
    }

    public void setFullName(String[] fullName) {
        this.fullName = fullName;
    }

    public String getNumberRecord() {
        return numberRecord;
    }

    public void setNumberRecord(String numberRecord) {
        this.numberRecord = numberRecord;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Structure getStructure() {
        return structure;
    }

    public void setStructure(Structure structure) {
        this.structure = structure;
    }

    String fullName[] = new String[3];
String numberRecord;
String faculty;
int course;
Structure structure = new Structure();
}
