package com.example.boot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.boot.model.Student;

//Integer represents type of primary key
//public interface StudentRepo extends CrudRepository<Student, Integer> {
//	List<Student> findBySname(String sname);
//	 
//	List<Student> findBySidGreaterThan(int sid);
//
//	@Query("from Student where sname=?1 order by sname")
//	List<Student> findBySnameSorted(String sname);

//}

public interface StudentRepo extends JpaRepository<Student, Integer> {
//	List<Student> findBySname(String sname);
//	 
//	List<Student> findBySidGreaterThan(int sid);
//
//	@Query("from Student where sname=?1 order by sname")
//	List<Student> findBySnameSorted(String sname);

}
