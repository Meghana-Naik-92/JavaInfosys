
public class Student {

    private int StudentId;
    private String StudentName;
    private float QualifyingMarks;
    private char ResidentialStatus;
    private int YearofEngg;

    // Setters
    public void setStudentId(int studentId) {
        this.StudentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.StudentName = studentName;
    }

    public void setQualifyingMarks(float qualifyingMarks) {
        this.QualifyingMarks = qualifyingMarks;
    }

    public void setResidentialStatus(char residentialStatus) {
        this.ResidentialStatus = residentialStatus;
    }

    public void setYearofEngg(int yearofEngg) {
        this.YearofEngg = yearofEngg;
    }

    // Getters
    public int getStudentId() {
        return StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public float getQualifyingMarks() {
        return QualifyingMarks;
    }

    public char getResidentialStatus() {
        return ResidentialStatus;
    }

    public int getYearofEngg() {
        return YearofEngg;
    }
}
