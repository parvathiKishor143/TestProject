package newTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;



public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add two matrix
	/*	int[] a= {1,2,3,7,8,8,9,9};
		  int remove=7;
		  
		  int[] newArray= removeNumber(a, remove);
		  System.out.println("new array =" +Arrays.toString(newArray));
	
	
		  // To reverse a string
		
		String s="Kallumootil veedu";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
	
		
		// To reverse as litoomullaK udeev
		String j="Kallumootil veedu";
		String[] h=j.split("//s+");
		int count=h.length; //2
		String rev1="";
		String rev2="";
		
		for(int k=0;k<count;k++) {
			String h1=h[k];
			if(k==0) {
				for(int i=h1.length()-1;i>=0;i--) {
					rev1=rev1+h1.charAt(i);
				}
				System.out.print(rev1);
			}
			else if(k==1) {
				for(int i=h1.length()-1;i>=0;i--) {
					rev2=rev2+h1.charAt(i);
				}
				System.out.print(rev2);
			}
			
		}
		
		
		String s="hggshjdgSWS   WSf87897458758 &*(";
		String h=s.replaceAll("[^\\D]", "");
		
		System.out.print(h);
	// to print all a's:	
String f="ssgghdfaaaaaaaanjbhjbhaaa";
char targetChar='a';
String character=targetCharPrint( f,  targetChar);
System.out.print(character);
		
		// To remove word "childen"
		
		String sentence="Life is beautiful when we spend children time with children kids";
		String remove="children";
		String[] sen=sentence.split(" ");
		StringBuilder s= new StringBuilder();
		for (String sent: sen) {
			if (!sent.equals(remove)) {
				s.append(sent).append(" ");
			}
		}
		
		String modstring=s.toString().trim();
		System.out.print(modstring);
	
	// Remove all special characters from sentence
		
		String history="In Li)))32322)fe lessons rep@#$%eat until we ar((((((e clear with our f*******aults";
	    
	String revomechar= history.replaceAll("[^\\w,\\s]", "");
	System.out.print(revomechar);
		
		
		int[] num= {2,3,6,6,4,5,6,4};
		int remove=6;
		int[] neww=removeNumber( num,  remove);
		System.out.print(Arrays.toString(neww));
		
	// To print prime numbers
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter num");
		int num=sc.nextInt();
		int count=0;
		 for(int i=1;i<=num;i++) {
			 if(num%i==0) {
				 count++;
			 }
			 
		 }
		 if(count==2) {
			 System.out.print("Prime");
		 }
		 else
		 {
			 System.out.print("Not Prime");
		 }
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter num range");
		int range=sc.nextInt();
		
		for(int j=2;j<=range;j++) {
			int count=0;
			for(int i=1;i<=j;i++) {
				if(j%i==0) {
					count++;
				}
				
				
			}
			if(count==2) {
				 System.out.print(j +",");
			 }
		}
		
	}
	
	
	/*		public static int[] removeNumber(int[] num, int remove) {
		
		int[] newarray= new int[num.length-1];
		int index=0;
		
		for(int i=0;i<=num.length-1;i++) {
			if(num[i]!=remove) {
				newarray[index]=num[i];
				index++;
			}
		}
		
		return newarray;
		
	}
	
	public static String targetCharPrint(String f, char targetChar) {
		String newSt="";
		int count=0;
		for(int i=0;i<=f.length()-1;i++) {
			if(f.charAt(i)==targetChar) {
				newSt=newSt+f.charAt(i);
			}
		}
		
		return newSt;
		
	}
	
	 public static int[] removeNumber(int[] a, int remove) {
		int newArray[]=new int[a.length-1];
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=remove) {
			newArray[index]=a[i];
			index++;
			}
		}
		
		
		return newArray;
		
	}*/
		
		int a[]={1,2,45,30};
		int min=a[0];
		int max=a[0];

		for(int b:a){
		if(min>b){
		min=b;
		}

		}
		 System.out.print("small:" + min);

		for(int c:a){
		if(max<c){
		max=c;
		}

		}
		System.out.print("large:" + max);

	}
}