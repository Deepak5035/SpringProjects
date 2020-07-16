package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.WishService;
import com.nt.cfgs.ConfigClass;

public class Client 
{
    public static void main( String[] args ){

    ApplicationContext ctx=null;
    WishService ws=null;
    
    
    ctx=new AnnotationConfigApplicationContext(ConfigClass.class);
    
    ws=ctx.getBean("wmsg",WishService.class);
    
    System.out.println(ws.WishGanrator("Dhoni"));
    
    ((AbstractApplicationContext) ctx).close();
    	
    }
}
