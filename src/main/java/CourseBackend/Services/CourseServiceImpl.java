package CourseBackend.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CourseBackend.Dao.CourseDao;
import CourseBackend.Entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}
//------------------------------------------------------
	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return courseDao.save(course);
	}
//------------------------------------------------------
	@Override
	public void deleteCourse(long parseLong) {
		
		@SuppressWarnings("deprecation")
		Course entity= courseDao.getOne(parseLong);
		courseDao.delete(entity);;	
	}
//------------------------------------------------------
	@Override
	public Course updateCourse(Course course) {	
		return courseDao.save(course);
	}
//------------------------------------------------------
	@Override
	public Optional<Course> getCourse(long courseId) {
		Optional<Course> entity2=courseDao.findById(courseId);
		return entity2;
	}	
}
