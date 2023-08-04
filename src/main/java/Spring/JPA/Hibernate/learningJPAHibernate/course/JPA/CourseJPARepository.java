package Spring.JPA.Hibernate.learningJPAHibernate.course.JPA;

import Spring.JPA.Hibernate.learningJPAHibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJPARepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course); //To insert a row in.
    }
    public Course findById(long id){
        return entityManager.find(Course.class,id);
    }
    public void deleteById(long id){
        Course course=entityManager.find(Course.class,id);
         entityManager.remove(course);
    }
}
