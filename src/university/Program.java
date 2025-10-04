package university;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private String name;
    private ProgramType programType;

    private List<Course> courseList; // списък от курсове в програмата

    public Program(String name, ProgramType programType) {
        this.name = name;
        this.programType = programType;
        this.courseList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ProgramType getProgramType() {
        return programType;
    }

    // метод за добавяне на курсове към програмата
    public boolean addCourse(Course course) {
        if (this.courseList.contains(course)){
            return false;
        }
        return this.courseList.add(course);
    }

    // метод за премахване на курсове от програмата

    public boolean removeCourse(Course course) {
        return this.courseList.remove(course);
    }

    // метод за премахване на курсове от програмата по индекс
    public Course removeCourse(int index) {
        return this.courseList.remove(index);
    }

    // метод, който принтира листа с курсовете
    public void printCourseList() {
        // използвам foreach версията на for цикъла
        for(Course course : this.courseList) {
            System.out.println(course);
        }
    }

    // метод, който принтира листа с курсовете по критерий --> дали е REQUIRED или ELECTIVE
    public void printCourseListByCourseType(CourseType courseType) {
        // използвам foreach версията на for цикъла
        for(Course course : this.courseList) {
            if(course.getCourseType().equals(courseType)){
            System.out.println(course);
            }
        }
    }

    public int getCourseListSize() {
        return this.courseList.size();
    }

    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", programType=" + programType +
                ", courseList=" + courseList +
                '}';
    }


}
