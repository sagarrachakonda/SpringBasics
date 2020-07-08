package com.sagar.SpringProj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//DependencyInjection(IOC)
    	
    	//InterfaceNameforApplicationCntext
    	
    	//Beanfactorycreated and spring.xml is created to give bean calling for classOne to remove object creation
    	
		/*BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		 The above is commented because XmlBeanFactory is depricated in spring instead use application context */
    	
    	@SuppressWarnings("resource")
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    	
       
        //Bean for this class is created in Spring.xml using code--> <bean id="one" class="com.sagar.SpringProj.ClassOne"></bean> 
        
    	//Calling Bean instead of creating object of the class
		
    	ClassOne one1 = (ClassOne) factory.getBean("one");
        one1.Code();
        one1.age1 = 15;
        System.out.println("age:"+ one1.age1);
        
        ClassOne one2 = (ClassOne) factory.getBean("one");
        one2.Code();
        // Here we get same output of age :15 for both objects thats why its called singleton Bean in Spring
        
        /* to make the bean from singleton to prototype so that multiple objects then create scope=prototype in beanid
           give <bean id="one" class="com.sagar.SpringProj.ClassOne" scope="prototype"></bean> in spring.xml */
        
        System.out.println("age:"+ one2.age1);
    	
    	//setter Injection
    	ClassOne classone = (ClassOne) factory.getBean("one");
    	System.out.println("SetterInjection:"+classone.getAge());
    }
}
