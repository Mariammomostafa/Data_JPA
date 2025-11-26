package springmvctest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springmvctest.model.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
