package com.nt.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

public class VotingEligibilityCheck
{
	     @Value("Rahul")
		private String name;
	     @Value("24")
		private int age;
	     @Value("Chhattisgarh")
		private String addr;
	     @PostConstruct
	     public void myInit()
	     {
	    	 System.out.println("Voter:myInit()");
	    	 if(name==null||age<=0)
	    	 {
	    		 throw new IllegalArgumentException("Name Must be Set");
	    		 
	    	 }
	     }
     @PreDestroy
     public void myDestroy()
     {
    	name=null;
    	age=0;
    	addr=null;
     }
	public String VotingEligibilityCheck()
	{
		if(age<18)
		{
		return name+"u r nt eligible for vote";
		}
		else
		{
			return name+"u r eligible for vote";
		}
	}
}