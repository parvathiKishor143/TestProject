package newTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import groovyjarjarantlr4.v4.parse.BlockSetTransformer.setAlt_return;

public class Palindrome_number {
	public static void main(String[] args) {
	
// PALINDROME
	/*
		// TODO Auto-generated method stub
		String orginal, reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number/string to check for Palindrome"); 
		orginal=sc.nextLine();
		int length=orginal.length();
		for(int i=length-1;i>=0;i--) {
		reverse=reverse+orginal.charAt(i);
		}
if(orginal.equals(reverse))
{
	System.out.println("number/string is Palindrome");
}
else {
	System.out.println("number/string is not Palindrome");
}
	}
	
// FIBONACCI
	
	int a=0,b=1,c;
	Scanner sc= new Scanner(System.in);
System.out.println("Enter the count to check");
int count=sc.nextInt();
System.out.println(a=0);
System.out.println(b=1);
for(int i=2;i<=count;i++) {
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
}
		
//Remove number from Alphanumeric
		
		String s = "2de67uihj891";
		String [] op = s.replaceAll("[a-zA-Z]", " ").trim().split("\\s+");
		String finalValue = "";
		
		for(int i=0; i<op.length; i++) {
			finalValue = finalValue + op[i];
			
		}
		System.out.println(finalValue);
		
		
/*		
//Right angle triangle star

		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

// Right angle triangle number
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
		
// Remove duplicate words:
		
	String s="My life and my my parents are awesome, I I am am grateful for for everything";
	String[] str=s.split(" ");
	Set<String> myset=new LinkedHashSet<String>();
	for(String f:str) {
		myset.add(f);
	}
	Iterator itr= myset.iterator();
	while(itr.hasNext()) {
		System.out.print(itr.next()+ " ");
	}
	
		
		
		// Factorial of  a number
		
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int fact=1;
for(int i=1;i<=n;i++) {
	fact=fact*i;
}
System.out.println(fact);

		
		
// Reverse an array
	
		int [] a= {12,13,14,15,16};
		
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]);
		}
		System.out.println(" ");

		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
		
		
		int[] y= {1,2,3,4,5,7,5,90,11};
		int bigValue=y[0];
		
		for(int z:y) {
			if (bigValue<z) {
				bigValue=z;
			}
		}
		System.out.print(bigValue);
		
		
		
		// remove duplicates
		String g="Sandeep";
		String [] h=g.split("");
		Set<String> j=new LinkedHashSet<String>();
		for(String w:h) {
			j.add(w);
		}
		Iterator it=j.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"");
		}
		
		// reverse the line
		String g="Sandeep is great";
		String[] h=g.split(" ");
		 
		for(int i=h.length-1;i>=0;i--) {
			System.out.println(h[i]);
		}
		
		// vowels print
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		
		char[] letters= str.toCharArray();
		int count=0;
		for(char lett:letters) {
			switch(lett) {
			
			case 'a':
			case 'e':
			case 'i':
			case '0':
			case 'u':
			count++;
			System.out.println("lettr is" + lett);
			break;
			}
			
		}
		System.out.println("count is" + count);
		
	
	
	String home= "KALLUMOOTIL VEEDU";
	String[] h=home.split("//s+");
	int count=h.length; //2
	String reverse="";
	String reverse1="";
	int i;
	
	 for( i=0;i<count;i++) {
		 String h1=h[i];
		 if (i==0) {
			 for(int j=h1.length()-1;j>=0;j--) {
				 reverse=reverse+h1.charAt(j);
			 }
			 System.out.print(reverse);
		 }
		 
		 else if(i==1) {
			 for(int j=h1.length()-1;j>=0;j--) {
				 reverse1=reverse1+h1.charAt(j);
			 }
			 System.out.print(reverse1);
		 }
	 }
	
		// tables of number
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for (int i=1;i<=10;i++) {
			
			System.out.println(n +"*" + i + "=" + n*i);
		}
		
		//Remove number from Alphanumeric

		String s="JDBDFHSB6125163^&*&";
		String[] f=s.replaceAll("[a-zA-Z\\W]", " ").trim().split("\\s+");
	
		String value="";
		for(int i=0;i<f.length;i++) {
			
			value=value+f[i];
		}
		
		System.out.println(value);
	
	
	
}
		String a="AABYUPAAABYIPAAABYKPAAABNHU";
		String pat="AAB.*?A";
		Pattern p=Pattern.compile(pat);
		Matcher m=p.matcher(a);
		System.out.println(m.results().count());
		m.reset();
		while(m.find()) {
			System.out.println("starts at:" + m.start());
			System.out.println("group :" +m.group());
		}
	
	// www.dezlearn.com, www.dezlearn.in, www.dez.com, www.dezlearn.us
		
	String h="www\\.(dezlearn|dez)\\.(com|in|us)";
	String i="www.dezlearn.in";
	String j="www>dezlearn.in";6
	System.out.println(i.matches(h));
	System.out.println(i.matches(j));*/
		
		/*
		 * Create a RegEx pattern to represent following number ranges
		 * 1. 0-99
		 * 2. 0-1000
		 * 3. 99-9999
		 * 4. 25-75
		 * 5. 220-240
		 
		
		
		String pat="[0-9][0-9]?";
		String pat1="[0-9][0-9]?[0-9]?[0-9]?|1000";
		String pat2="99|[1-9][0-9][0-9][0-9]?";
		String pat3="2[5-9]|[3-6][0-9]|7[0-5]";
		String pat4="2[2-3][0-9]|240";
		String re="240";
		System.out.println(re.matches(pat4));
		
	
		String str1 = "Your total cost is $2400997.999009 after $000.90009 sale discount and $12.09 ";
		String p="\\${1}\\d{1,}\\.\\d{1,}";
		Pattern pat=Pattern.compile(p);
		Matcher m=pat.matcher(str1);
		System.out.println("Prices in list: ");
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
		//Anagrams--- > if two string have the same characters
		
		
	
	String str1="JAVA";
	String str2="MAVA";
	
	System.out.println(AnagramCheck(str1,str2));
	
	
	// Print the even word in a string
		String g= "Mahadev is Love";
		String[] s= g.split(" ");
		for(String h:s) {
			if(h.length()%2==0) {
				System.out.println(h);
			}
		}
		
	// java ---> aavj	
		
		String g= "java";
		char[] h=g.toCharArray();
	    Arrays.sort(h);
	String t= new String(h);
	System.out.println(t);
	
	
	// To remove an element from a array
	
	int[] a= {1,2,3,7,8,9};
	int removeElement=7;
	
	int[] newArray= removeEle(a,removeElement);
	
	System.out.println("new array =" +Arrays.toString(newArray));
	
		
		// reverse a number
		int n=1234;
		int rev=0;
		
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);
	
	// missing number
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		
		int sum1=0;
		for(int j=0;j<=10;j++) {
			sum1=sum1+j;
		}
		
		int k=sum1-sum;
		System.out.println("missing number =" + k );
		
		
		String[] s={"java", "phython", "Ruby", "java", "c++"};
		Set<String> j= new LinkedHashSet<String>();
		for(String g:s) {
			if(j.add(g)==false) {
				System.out.println("Duplicate element is : " +g);
		}
		
		String[] name={"java", "phython", "Ruby", "java", "c++"};
		
		Map<String, Integer> m= new HashMap<String, Integer>();
		 for(String names: name) {
			 Integer count= m.get(names);
			 if(count==null) {
				 m.put(names, 1);
			 }
			 else
			 {
				 m.put(names, count+1);
			 }
		
	}
	
		 Set<Entry<String, Integer>> entrySet=m.entrySet();
		 for(Entry<String, Integer> en :entrySet) {
			 if (en.getValue()>1) {
				 System.out.println("Duplicate element is : "+ en.getKey());
			 }
		 }
	
	// big/ small
		 
		 int[] a= {-10,200,39,4,-706,5};
		 int big= a[0]; //1
		 int small=a[0]; //10
		 
		 for(int b: a) {
			 if(big<b) {
				 big=b;
			 }
			 
		 }
		 
		 System.out.println("big is " + big);
		  
		 for (int c:a) {
			 if(small>c) {
				 small=c;
			 }
		 }
		 System.out.println("small is " + small);
		  }
	// swap string	 
		
		 String a="Heloo";
		 String b="World";
		 a=a+b; //HelloWorld
		 b=a.substring(0, a.length()-b.length()); //Hello
		 a=a.substring(b.length());
		 
		 System.out.println(a);
		 System.out.println(b);
		
		// swap numbers
		int a=50;
		int b=70;
		
		int t=a;//50
		a=b;// a=70
		b=t;
		System.out.println(a);
		 System.out.println(b);
		 ///+++
		
		int a=50;
		int b=70;
		
		a=a+b; //120
		b=a-b; //50
		a=a-b;
		System.out.println(a);
		 System.out.println(b);
		int a=50;
		int b=70;
		
		a=a*b; //350
		b=a/b; //50
		a=a/b;
		System.out.println(a);
		 System.out.println(b);
		
		
			
			
			
			
			
  int[] a= {1,2,3,7,8,9};
  int remove=7;
  
		// anagram check
	// to change odd to even	
		List<Integer> l= new LinkedList<Integer>();
		l.add(100);
		l.add(22);
		l.add(33);
		l.add(233);
		l.add(15);
		
		ListIterator<Integer> itr= l.listIterator();
		while(itr.hasNext()) {
			int i=(int) itr.next();
			if(i%2==1) {
				i++;
				itr.set(i);
			}
			System.out.println(i);
		}
		  
		
		/// alternate letters
		String h="abcdefghijklm";
		
		String temp="";
		
		for(int r=0;r<=h.length()-1;r++) {
			if(r%2==0) {
				temp=temp + h.charAt(r);
				
			}
			
		}
		
		System.out.println(temp);
		
		// prime number
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt(); //7
		int count=0;
		 for(int i=1;i<=num;i++) {
			 
			 if(num%i==0) {
				 count++;
			 }
			 
		 } 
			 if (count==2){
				 System.out.println("PRIME!");
			 }
			 else {
				 System.out.println("No");
			 }
		 
		// Prime numbers between 1 & 50
			 
			 Scanner c= new Scanner(System.in);
		     System.out.println("Enter the range"); 
		     int ran =c.nextInt();//50
		     
		     for(int j=2;j<=ran;j++)
		 	{
		 	int count=0;
		 	for(int i=1;i<=j;i++)
		 	{
		 	   if(j%i==0)
		 	   {
		 	        count++;        
		 	   }
		 	}
		 	if(count==2)
		 	       System.out.print(j+"  ");     
		 	}
		 	}
		     
		    
		     
		
		// To coutn the number of words in a string
		
		String line = "I am am learning learning java java and fun fun fun";
		String[] words=line.split(" ");
		Map <String, Integer> map= new HashMap<String, Integer>();
		
		for(String word: words) {
			Integer count=map.get(word);// object key-> word
			if(count==null) {
				map.put(word, 1);
			}
			else {
				map.put(word, count+1);
			}
		}
		
		Set<Entry<String, Integer>> entry= map.entrySet();
		for(Entry<String, Integer> en:entry) {
			System.out.println("no . of words with " + en);
		}
		
		
		
		String h="I Love Lord Mahadev and Parvathi ma ";
		String mod=h.replace(" ", "");
		String[] words=mod.trim().split("");
		
		
		Map<String, Integer> map= new LinkedHashMap<String, Integer>();
		 for(String word:words) {
			 Integer count=map.get(word);
			 if(count==null) {
				 map.put(word, 1);
			 }else {
				 map.put(word, count+1);
			 }
		 }
		
		 Set<Entry<String, Integer>> en=map.entrySet();
		 
		 for(Entry<String, Integer> entry: en) {
			 if(entry.getValue()==1) {
				 System.out.print(entry.getKey());
				 break;
			 }
		// to count the number of words
		
		
		String h="I lknow that my God and Goddess hears me annd they will lead me in the right path.";
		int count=0;
		for(int i=0;i<=h.length()-1;i++) {
			if(h.charAt(i)==' '&& h.charAt(i+1)!=' ') {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
	// String p="Parvathi"; //[80, 97, 114, 118, 97, 116, 104, 105]
	     
		// byte[] b= p.getBytes();
		// System.out.println(Arrays.toString(b));
		 
		 
		 // byte to string
		 
		 byte[] a= {80, 97, 114, 118, 97, 116, 104, 105};
		 String f= new String(a);
		 System.out.println(f);
	/ to print num
	int n=1;
		 numbers(n);
		 
		 // Permutations of srting:
		
		
		String input="dar";
		permutation(input," ");

	}

	private static void permutation(String input, String result) {
		// TODO Auto-generated method stub
		if(input.length()==0) {
			System.out.println(result + " ");
			return;
		}
		
		for(int i=0;i<=input.length()-1;i++) {
			char ch=input.charAt(i); // i th char
			String rest=input.substring(0, i)+input.substring(i+1); // rest apart from ith
			permutation(rest, result+ch );
		}
	    }
	      
	
}
	
	public static void numbers(int num){
		  
		  if(num<=100){
		    System.out.println(num +" ");
		    numbers(num+1);
		    
		  }  
		
	
	/*public static boolean anagramCheck(String a1,String e1 ) {
		char[] c1=a1.toCharArray();
		char[] d1=e1.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(d1);
		
		
		return Arrays.equals(c1, d1);
		
	}
		public static int[] removeNum(int[] a, int remove) {
		
		int[] newArray= new int[a.length-1];
		int index=0;
		for(int i=0;i<=a.length;i++) {
			if(a[i]!=remove) {
				newArray[index]=a[i];
				index++;
			}
		}
		return newArray;
		
	}
		
	
		 public static boolean AnagramCheck(String str1,String str2) {
		char[] str1tochar=str1.toCharArray();
		char[] str2tochar=str2.toCharArray();
		
		Arrays.sort(str1tochar);
		Arrays.sort(str2tochar);
	
	return Arrays.equals(str1tochar, str2tochar);
	}
	
	public static int[] removeEle(int[] array, int element) {
		
		int[] newArray= new int[array.length-1];
		int index=0;
		for(int i=0;i<array.length;i++) {
			if (array[i]!=element) {
				newArray[index]=array[i];
				index++;
			}
		}
		
		return newArray;
	}*/

	



