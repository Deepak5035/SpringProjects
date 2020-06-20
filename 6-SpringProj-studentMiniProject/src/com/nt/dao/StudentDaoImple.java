package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import com.nt.bo.StudentBo;

public class StudentDaoImple implements StudentDao {
	private static final String STUDENT_INSERT="INSERT INTO STUDENT_TABLE  VALUES(?,?,?,?,?)";
	private DataSource ds=null;
	
	public StudentDaoImple(DataSource ds) {
		this.ds = ds;
	}
	
	@Override
	public int insert(StudentBo bo) throws Exception {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet res=null;
	int count=0;
	//get connection object from conn pool
	con=ds.getConnection();
	//create prepare statement object having precompile Sql query
	ps=con.prepareStatement(STUDENT_INSERT);
    ps.setString(1,bo.getsName());
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
