public class Student {
    private String studentName;
    private int studentAge;
    private String faculty;

    public String getStudentName() {
        return studentName;

    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        if (studentAge > 0) {
            this.studentAge = studentAge;
        }
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;


    }
}
