package com.test.demorest;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class StudentRepo {

	// List<Student> stud;

	Connection conn = null;

	public StudentRepo()

	{
		String url = "jdbc:mysql://localhost:3306/Test";
		try {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");// `com.mysql.jdbc.Driver'. This is deprecated.
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn = DriverManager.getConnection(url, "root", "Kasthuri");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		stud =new ArrayList<>();
//		
//		Student s =new Student ();
//		s.setName("Kasthuri");
//		s.setSid(101);
//		
//		
//		Student s1 =new Student ();
//		s1.setName("Harish");
//		s1.setSid(102);
//	
//		stud.add(s);
//		stud.add(s1);
	}

	public List<Student> getStudents() {

		List<Student> students = new ArrayList<Student>();
		String sql = "select* from student";
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				Student s = new Student();
				s.setSid(rs.getInt(1));
				s.setName(rs.getString(2));
				students.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return students;
		// return stud;
	}

	public Student getStudent(int sid)

	{
//		Student st = null;
//		for (Student stu : stud) {
//			if (stu.getSid() == sid)
//				return stu;
//		}
//		// return null;
//		return new Student();

		String sql = "select* from student where sid =" + sid;

		Student s = new Student();

		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);

			if (rs.next()) {

				s.setSid(rs.getInt(1));
				s.setName(rs.getString(2));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return s;

	}

	public void create(Student st) {
		// TODO Auto-generated method stub

		// stud.add(st);
		String sql = "insert into student values (?,?)";
		try {
			PreparedStatement st1 = conn.prepareStatement(sql);
			st1.setInt(1, st.getSid());
			st1.setString(2, st.getName());
			st1.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update(Student st) {
		// TODO Auto-generated method stub

		// stud.add(st);
		String sql = "update student set sid=?, name=? where sid=?";
		try {
			PreparedStatement st1 = conn.prepareStatement(sql);
			st1.setInt(1, st.getSid());
			st1.setString(2, st.getName());
			st1.setInt(3, st.getSid());
			st1.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delete(int id) {
		// TODO Auto-generated method stub

		String sql = "delete from student where sid=?";
		try {
			PreparedStatement st2 = conn.prepareStatement(sql);
			st2.setInt(1, id);
			st2.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
