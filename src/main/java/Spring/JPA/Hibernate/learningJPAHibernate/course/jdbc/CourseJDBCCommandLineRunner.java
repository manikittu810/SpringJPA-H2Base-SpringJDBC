package Spring.JPA.Hibernate.learningJPAHibernate.course.jdbc;

import Spring.JPA.Hibernate.learningJPAHibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJDBCRepository Repository;
    @Override
    public void run(String... args) throws Exception {
        Repository.insert(new Course(1,"Learn Spark Now","SMK1"));
        Repository.insert(new Course(2,"Learn AWS Now","SMK2"));
        Repository.insert(new Course(3,"Learn Java Now","SMK3"));
        Repository.insert(new Course(4,"Learn C Now","SMK4"));
        Repository.insert(new Course(5,"Learn C++ Now","SMK5"));
        Repository.delete(1);
    }
}
