package com.sagar.SpringProj;

public class ClassOne {
	
	int age1;
	
	//Generated getters and setters (int age)for setter injection process 
	private int age;
	//private Classtwo classtwo;
	//commented class two for autowire
	
	/* public Classtwo getClasstwo() {
		return classtwo;
	}

	public void setClasstwo(Classtwo classtwo) {
		this.classtwo = classtwo;
	}*/

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Classthree classthree;
	
	/*
	 * public ClassTwo getClasstwo() { return classtwo; } public void
	 * setClasstwo(ClassTwo classtwo) { this.classtwo = classtwo; }
	 */
	
	public Classthree getClassthree() {
		return classthree;
	}

	public void setClassthree(Classthree classthree) {
		this.classthree = classthree;
	}

	//default constructor of class is commented to utilise parameterised constructor
	//after commenting in spring.xml commented <property name="age" value = "15"></property>
	//and gave <constructor-arg value = "15"></constructor-arg> to give value to age without default constructor
	//for autowiring concept constructor below is uncommented
	public ClassOne(){
		//when we create constructor spring automatically creates object of this constructor
		System.out.println("Constructor created");
	}
	public void Code() {
		
		System.out.println("Dependency Injection Called for ClassOne");
		
		//reference for this class is created in <property name="classtwo" ref = "classtwo"></property>
		
		//classtwo.compile(); commented for autowire
		classthree.compile();
	}

	//Constructor Injection
	
	/*public ClassOne(int age) {
		this.age = age;
		commented constructor injection for autowiring concept
	}*/
	
	
	

}
