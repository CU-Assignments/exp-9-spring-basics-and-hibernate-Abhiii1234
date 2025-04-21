public class Student {
    private String name;
    private Course course;

    // Getters, Setters, and Constructor
}
public class Course {
    private String courseName;
    private int duration;

    // Getters and Setters
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

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;

    // Getters and Setters
}
