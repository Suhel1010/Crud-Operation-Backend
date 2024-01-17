package CourseBackend.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CourseBackend.Entities.Course;


@Repository
public interface CourseDao extends JpaRepository<Course, Long> {

}
