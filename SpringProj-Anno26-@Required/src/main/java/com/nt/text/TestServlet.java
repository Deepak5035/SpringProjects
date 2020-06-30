package com.nt.text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.servlet.VoterDetails;

public class TestServlet {
	
	public static void main(String[] args) {
	
	ApplicationContext ctx=null;
	
	ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	
	VoterDetails vd=ctx.getBean("vd",VoterDetails.class);
	
	String result=vd.CheckVotingEligibility();
	System.out.println(vd.toString());
	System.out.println(result);
	
	((AbstractApplicationContext) ctx).close();
	
	
	}
}
