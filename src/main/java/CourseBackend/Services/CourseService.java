package CourseBackend.Services;

import java.util.List;
import java.util.Optional;

import CourseBackend.Entities.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Course addCourse(Course course);
	public void deleteCourse(long parseLong);
	public Course updateCourse(Course course);
	public Optional<Course> getCourse(long courseId);
}
