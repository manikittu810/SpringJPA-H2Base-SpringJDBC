package Spring.JPA.Hibernate.learningJPAHibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJDBCRepository Repository;
    @Override
    public void run(String... args) throws Exception {
        Repository.insert();

    }
}
