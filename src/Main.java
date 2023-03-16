public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setCourseName("Java");
        course.setCourseNumber(2);
        course.setCourseStartDay("06.02.2023");
        course.setTeacherName("Muratov Azamat");
        System.out.println(course.getCourseName()+"\n" + course.getCourseNumber()+"\n"+ course.getCourseStartDay()
        + "\n" + course.getTeacherName());
        System.out.println("==================================================================");
        Student student =new Student();
        student.setStudentName("Safiya");
        student.setStudentAge(-18);
        student.setFaculty("New Technology");
        System.out.println(student.getStudentName() + "\n"+ student.getStudentAge() +
                "\n" + student.getFaculty());
    }
}