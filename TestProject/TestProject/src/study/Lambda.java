package study;

public class Lambda {
	
	public void  greet(LambdaInterface Interface ) {
		Interface.perform();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lambda lam=new Lambda();
	//	Helloworld world= new Helloworld();
	//	lam.greet(world);
		
		LambdaInterface LambdaFun= () -> System.out.print(" My Lambda Function"); // not exactly fancy as new short cut of the below
		LambdaFun.perform();
		
		LambdaInterface InnerClass= new LambdaInterface() {

			@Override
			public void perform() {
				System.out.print(" My InnerClass Function");
				
			}
			
		};
		InnerClass.perform();
	}

}
