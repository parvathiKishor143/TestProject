package study;

public class Constructors {

	
		// TODO Auto-generated method stub
private int age;
private String name;



public  Constructors(int age , String name) {
			this.age=age;
			this.name=name;
		}
public  Constructors() {
		this(0,"unknown name");	
		}

public  Constructors(int age) {
	this(age,"unknown name");	
}
public  Constructors(String name) {
	this(0,name);	
}
		
	}


