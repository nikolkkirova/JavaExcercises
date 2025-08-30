package university;

public class Course {
    private final long id;
    private String name;
    private int credits; // кредити
    private CourseType courseType; // тип на курса --> задължителен/избираем
    private static long createdCourses; // брой на създадените курсове

    public Course(String name, int credits, CourseType courseType) {
        Course.createdCourses++;
        this.id = Course.createdCourses++;
        this.name = name;
        this.credits = credits;
        this.courseType = courseType;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public static long getCreatedCourses() {
        return createdCourses;
    }

    public static void setCreatedCourses(long createdCourses) {
        Course.createdCourses = createdCourses;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", courseType=" + courseType +
                '}';
    }
}
