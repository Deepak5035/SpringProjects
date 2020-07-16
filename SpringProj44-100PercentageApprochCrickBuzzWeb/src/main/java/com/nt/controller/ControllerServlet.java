package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;

import com.nt.cfgs.AppConfig;
import com.nt.service.CrickBuzzService;

@Controller
public class ControllerServlet extends HttpServlet {

ApplicationContext ctx=null;
CrickBuzzService cbs=null;
RequestDispatcher rd=null;

	
@Override	
public void init() {
	System.out.println("ControllerServlet.init()");
ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	
}


@Override
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
	System.out.println("ControllerServlet.doGet()");
	int mid=Integer.parseInt(req.getParameter("123"));
	cbs=ctx.getBean("cbs",CrickBuzzService.class);
	String resultScore=cbs.score(mid);
	System.out.println("ControllerServlet.doGet()==>after getting result");
	req.setAttribute(resultScore, resultScore);
    
	rd=req.getRequestDispatcher("result_jsp");
    rd.forward(req, res);

}

public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		/*doGet(req,res);*/
}
@Override
public void destroy() {
	System.out.println("ControllerServlet.destroy()");
	((AbstractApplicationContext) ctx).close();
}

}
