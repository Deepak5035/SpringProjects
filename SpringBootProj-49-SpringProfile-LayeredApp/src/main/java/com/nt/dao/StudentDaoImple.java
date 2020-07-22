package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBo;

@Component("dao")
@Repository("dao")
@Profile(value={"uat","prod"})
@Scope("singleton")
public class StudentDaoImple implements StudentDao {
	private static final String STUDENT_INSERT="INSERT INTO STUDENT_TABLE  VALUES(?,?,?,?,?)";
	
	@Autowired
	public DataSource ds=null;
	
	/*	public StudentDaoImple(DataSource ds) {
			this.ds = ds;
		}*/
	
	@Override
	public int insert(StudentBo bo) throws Exception {
	Connection con=null;
	PreparedStatement ps=null;
	
	int count=0;
	//get connection object from conn pool
	con=ds.getConnection();
	//create prepare statement object having precompile Sql query
	ps=con.prepareStatement(STUDENT_INSERT);
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
