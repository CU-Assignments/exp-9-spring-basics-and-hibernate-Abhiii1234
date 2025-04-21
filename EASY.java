public class Course {
    private String courseName;
    private int duration;

    // Getters and Setters
}
public class Student {
    private String name;
    private Course course;

    // Getters, Setters, and Constructor
}
@Configuration
public class AppConfig {

    @Bean
    public Course course() {
        Course course = new Course();
        course.setCourseName("Spring Framework");
        course.setDuration(60);
        return course;
    }

    @Bean
    public Student student() {
        Student student = new Student();
        student.setName("Abhigyan");
        student.setCourse(course());
        return student;
    }
}
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = context.getBean(Student.class);
        System.out.println("Name: " + student.getName());
        System.out.println("Course: " + student.getCourse().getCourseName());
        context.close();
    }
}
