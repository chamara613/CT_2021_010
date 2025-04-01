package Q_05;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setCourseName("OOP");
        course.setCourseCode("CTEC-22043");

        Lecture lecture=new Lecture();
        lecture.setLectureName("Dr.Kumara");
        lecture.setCourseTeaching("OOP");


        Student student = new Student();
        student.setStudentName("Chamara");
        student.setCourseFollowing("OOP");
        student.setDegreeName("BICT");

        System.out.println("Course Name :-"+course.getCourseName());
        System.out.println("Course Code :- "+course.getCourseCode());

        System.out.println("Lecture Name:- "+lecture.getLectureName());
        System.out.println("Course Teaching:- "+lecture.getCourseTeaching());

        System.out.println("Student Name:- "+student.getStudentName());
        System.out.println("Course Following:- "+student.getCourseFollowing());
        System.out.println("Degree Name:- "+student.getDegreeName());


    }
}
