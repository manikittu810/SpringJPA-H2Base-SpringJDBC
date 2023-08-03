package Spring.JPA.Hibernate.learningJPAHibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {
    @Autowired
    private JdbcTemplate springJDBCTemplate;
    private static String INSERT_QUERY=
            """
                            insert into COURSE (id,name,author)
                            values(1,'Spark','Smk');
                                        
                    """;
    public void insert(){
        springJDBCTemplate.update(INSERT_QUERY);
    }
}
