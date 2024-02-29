package study;

public class AddTwo {

	public static void main(String[] args) {
		
		//add additionTwo= (a,b)-> a+b;
		
		additionl((a,b)-> a+b);
	}
	
	public static void  additionl(add a) {
		
		System.out.println(a.addition(4, 5));
		
	}

	
interface add{
	
	  int addition(int a, int b);

}
}
