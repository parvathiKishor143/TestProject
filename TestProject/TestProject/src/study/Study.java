package study;



import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

import io.restassured.RestAssured;

public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// big/ small
		// String p="Parvathi"; //[80, 97, 114, 118, 97, 116, 104, 105]
	     
		// byte[] b= p.getBytes();
		// System.out.println(Arrays.toString(b));
		 
		 
		 // byte to string
		
		
		/*ArrayList<String> names= new ArrayList<String>();
		names.add("Anna");
		names.add("Ben");
		names.add("Amaya");
		names.add("Cathi");
		names.add("Angel");
		
		Long count= names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(count);
		
		
		Long lambda=Stream.of("Anna","Anugraha","Betti","Ctaherain","Aousap").filter(s->s.startsWith("C")).count();
		System.out.println(lambda);
		
		// To print all names
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s)); // limit the output
		
		//Stream.of("Dog","Cat","Rabbit","Penguin","Parrot").filter(s->s.startsWith("P")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		List<String> list= Arrays.asList("Dog","Cat","Rabbit","Penguin","Parrot");
		String remove="Caaat";
		//list.stream().filter(t->t.equals(list)).forEach(t->System.out.println(t));
		
		Stream<String> newStream= Stream.concat(names.stream(), list.stream());
		System.out.println(newStream);
		boolean flag=newStream.anyMatch(d->d.equalsIgnoreCase(remove));
		System.out.println(flag);
		Assert.assertTrue(flag);*/
		
		
		List<Integer> num=Arrays.asList(1,2,2,4,6,3);
		
		//num.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		// to get the 3rd element
		
		List<Integer> num1=num.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(num1.get(2));
		
		
	    }
	}

	      
    
	
	





	
	
	

