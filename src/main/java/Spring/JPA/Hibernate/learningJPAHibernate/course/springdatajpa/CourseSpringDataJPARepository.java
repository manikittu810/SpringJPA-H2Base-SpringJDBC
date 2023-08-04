package Spring.JPA.Hibernate.learningJPAHibernate.course.springdatajpa;

import Spring.JPA.Hibernate.learningJPAHibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJPARepository extends JpaRepository<Course,Long > {
//just creating interface the spring data jpa makes the jpa way more simple.

}
