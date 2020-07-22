package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBo;

@Repository
@Profile(value={"dav","test"})

public class StudentDaoImple1 implements StudentDao {
	private static final String SPRING_LAYERED_STUDENT="INSERT INTO STUDENT_TABLE (SNAME,SADD,TOTAL,AVG,RESULT)  VALUES(?,?,?,?,?)";
	
	@Autowired
	private DataSource ds=null;
	
	public StudentDaoImple1(DataSource ds) {
		this.ds = ds;
	}
	
	@Override
	public int insert(StudentBo bo) throws Exception {
	Connection con=null;
	PreparedStatement ps=null;
	
	int count=0;
	//get connection object from conn pool
	con=ds.getConnection();
	//create prepare statement object having precompile Sql query
	ps=con.prepareStatement(SPRING_LAYERED_STUDENT);
    ps.setString(1, bo.getsName());
    ps.setString(2, bo.getsAdd());
    ps.setDouble(3, bo.getTotal());
    ps.setDouble(4, bo.getAvg());
    ps.setString(5, bo.getResult());
    //execute PreCompile sql query
    count=ps.executeUpdate();
    //close jdbc connections
    ps.close();
    con.close();
	return count;
	}

}
