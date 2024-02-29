package study;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringLen len= s -> s.length(); // lambda
		//System.out.print(len.length("Hello world"));
		
		printLambda(s->s.length());
		
	}
	
	public static void printLambda(StringLen l){
		System.out.print(l.length("Hello world"));
	}
	interface StringLen{
		int length(String s);
	}

}
