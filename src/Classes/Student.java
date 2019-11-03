package Classes;

public class Student {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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


    String Name;
    String numberRecord;
    String faculty;
    int course;
    Structure structure = new Structure();
    String status = new String();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Structure getStructure() {
        return structure;
    }

    public void setStructure(Structure structure) {
        this.structure = structure;
    }
}
