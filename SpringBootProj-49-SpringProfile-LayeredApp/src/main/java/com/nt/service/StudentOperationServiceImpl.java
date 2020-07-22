package com.nt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.nt.bo.StudentBo;
import com.nt.dao.StudentDao;
import com.nt.dto.StudentDto;

@Scope("singleton")
@Service("service")
public class StudentOperationServiceImpl implements StudentOperationService {
    
	@Autowired(required=false)
	public StudentDao dao;
		
	/*	public StudentOperationServiceImpl(StudentDao dao) {
			this.dao = dao;
		}*/
	@Override
	public String register(StudentDto dto)throws Exception {
	    StudentBo bo=null;
	    String result=null;
	    int count=0;
	    
	    //creating bo class object
	    bo=new StudentBo();
	    
	    //getting data from dto obj
		bo.setsName(dto.getsName());
		bo.setsAdd(dto.getsAdd());
		double m1=dto.getM1();
		double m2=dto.getM2();
		double m3=dto.getM3();
		//b.logic
		double total=m1+m2+m3;
		double avg=total/3;
		
		if(m1<33&&m2<33&&m3<33&&avg<33)
		result="Fail";
		else	
		result="Pass";
		bo.setTotal(total);
		bo.setResult(result);
		bo.setAvg(avg);
		
	     count=dao.insert(bo);
         if(count==0)
	     return "Registration Failed";
         else
         return"Student is "+result+"and total Marks is"+total+"and Average is"+avg+"";	
	
	
	}

}
