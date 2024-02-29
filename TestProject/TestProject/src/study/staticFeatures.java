package study;

public class staticFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		penFeatures p= new penFeatures();
		p.cost=10;
		p.num=100;
		
		
		penFeatures p1= new penFeatures();
		p1.cost=10;
		p1.num=105;
		
		
		p.details();
		p1.details();
		penFeatures.details1(p);
	}
	
	
		
		
		
	}


 class penFeatures{
	
	int num;
	int cost;
	static String name="Renaults";
	
	
	
	public void details() {
		System.out.println("name is " + name +" cost is " + cost+ " number is " +num );
	}
	public static void details1(penFeatures p) {
		System.out.println("name is " + name +" cost is " + p.cost+ " number is " +p.num );
	}
	
	
	
}