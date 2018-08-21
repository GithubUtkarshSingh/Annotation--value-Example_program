package com.nt.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VotingEligibilityCheck;

public class ClientApplication 
{
	public static void main(String[] args)
	{
	    ApplicationContext ctx=null;
	    VotingEligibilityCheck check=null;
	    ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	    check=ctx.getBean("checker",VotingEligibilityCheck.class);
	  //invokeMethod
	  		System.out.println(check.VotingEligibilityCheck());
	    ((AbstractApplicationContext) ctx).close();
	    

	}

}
