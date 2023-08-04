package Spring.JPA.Hibernate.learningJPAHibernate.course;

import Spring.JPA.Hibernate.learningJPAHibernate.course.Course;
import Spring.JPA.Hibernate.learningJPAHibernate.course.JPA.CourseJPARepository;
import Spring.JPA.Hibernate.learningJPAHibernate.course.jdbc.CourseJDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJDBCRepository Repository;
        @Autowired
        private CourseJPARepository Repository;
    @Override
    public void run(String... args) throws Exception {
        Repository.insert(new Course(1,"Learn Spark JPA Now","SMK1"));
        Repository.insert(new Course(2,"Learn AWS JPA Now","SMK2"));
        Repository.insert(new Course(3,"Learn Java JPA Now","SMK3"));
        Repository.insert(new Course(4,"Learn C Now","SMK4"));
        Repository.insert(new Course(5,"Learn C++ Now","SMK5"));
        Repository.deleteById(1);
        System.out.println(Repository.findById(2));
        System.out.println(Repository.findById(3));
    }
}
