package Spring.JPA.Hibernate.learningJPAHibernate.course.jdbc;

import Spring.JPA.Hibernate.learningJPAHibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {
    @Autowired
    private JdbcTemplate springJDBCTemplate;
    private static String INSERT_QUERY=
            """
                            insert into COURSE (id,name,author)
                            values(?,?,?);
                                        
                    """;

    private static String DELETE_QUERY=
            """
                            delete from COURSE 
                            where id =?;
                    """;
    private static String SELECT_QUERY=
            """
                            select * from COURSE 
                            where id =?;
                    """;

    public void insert(Course course){
        springJDBCTemplate.update(INSERT_QUERY,
                course.getId(),course.getName(),course.getAuthor());
    }

    public void delete(long id){
        springJDBCTemplate.update(DELETE_QUERY,id);
    }

    public Course findById(long id){
        return springJDBCTemplate.queryForObject(SELECT_QUERY,
                new BeanPropertyRowMapper<>(Course.class),
                id);
    }
    //Resultset->Bean mapping ->are called Row Mappers =>
    //id as the input
}
