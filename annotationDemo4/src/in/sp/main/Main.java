package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.MyStudent;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("in/sp/resources/applicationContext.xml");
		
		MyStudent std = (MyStudent)context.getBean("stdObj");
		std.stdDisplay();
	} 
}
