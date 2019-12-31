package com.elva.social1.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends CrudRepository<Student, String> {
	
	// step #1
	public Optional<Student> findById(String id);
	
	// step #2
//	@Query("SELECT t.name FROM Student t where t.id = :id")
//	public Optional<Student> findById(@Param("id")String id);
	
	//step #3
//	@Query("SELECT * FROM Student t where t.id = :id")
//	public Optional<Student> findById(@Param("id") String id);
	
//	@Query("SELECT * FROM Student t where t.id= ?1 AND t.department= ?2")
//	public Optional<Student> findByNameAndDepartment(String name, String department);
//
//	@Query("SELECT * FROM Student t where t.name = %?1%")
//	public Optional<Student> findByCriteria(String criteria);


}
