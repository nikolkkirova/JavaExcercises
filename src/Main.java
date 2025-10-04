import university.Course;
import university.CourseType;
import university.Program;
import university.ProgramType;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Java", 6, CourseType.REQUIRED);
        Course course2 = new Course("C++", 6, CourseType.ELECTIVE);
        Course course3 = new Course("Python", 3, CourseType.REQUIRED);
        Course course4 = new Course("Java", 3, CourseType.ELECTIVE);

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
        System.out.println(course4);

        Program program = new Program("Computer Science", ProgramType.MAJOR);
        System.out.println(program);
        // Добавяне на курсове към програмата
        program.addCourse(course1); // този вече го премахнахме
        program.addCourse(course1); // индекс 0
        program.addCourse(course2); // индекс 1
        System.out.println(program);

        program.printCourseList();
        System.out.println("The size of the course list is: " + program.getCourseListSize());

//        System.out.println("=================");
//        // program.removeCourse(course1);
//        System.out.println(program.removeCourse(1));
//        program.printCourseListByCourseType(CourseType.REQUIRED);
//
//        ProgramType.MAJOR.setProgramTypeCredits(260);
//
//        System.out.println("Credits needed: " + program.getProgramType().getProgramTypeCredits());



    }
}