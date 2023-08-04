package Spring.JPA.Hibernate.learningJPAHibernate.course;

import Spring.JPA.Hibernate.learningJPAHibernate.course.springdatajpa.CourseSpringDataJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJDBCRepository Repository;
//        @Autowired
//        private CourseJPARepository Repository;
    @Autowired
    private CourseSpringDataJPARepository Repository;
    @Override
    public void run(String... args) throws Exception {
        Repository.save(new Course(1,"Learn Spark JPA Now","SMK1"));
        Repository.save(new Course(2,"Learn AWS JPA Now","SMK2"));
        Repository.save(new Course(3,"Learn Java JPA Now","SMK3"));
        Repository.save(new Course(4,"Learn C Now","SMK4"));
        Repository.save(new Course(5,"Learn C++ Now","SMK5"));
        Repository.deleteById(1l);
        System.out.println(Repository.findById(2l));
        System.out.println(Repository.findById(3l));
        //l->long

    }
}
