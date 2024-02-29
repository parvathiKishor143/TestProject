package study;

import java.util.Scanner;

public class preparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Permutations of srting:
		
		
		String h="java";
		permut(h," ");
		
	}

	private static void permut(String h, String result) {
		// TODO Auto-generated method stub
		if(h.length()==0) {
			System.out.println(result +" ");
			return;
		}
		
		boolean alphabet[]= new boolean[26];
		for(int i=0;i<=h.length()-1;i++) {
			char ch=h.charAt(i);
			String rem=h.substring(0, i) + h.substring(i+1);
			if(alphabet[ch - 'a']==false) 
				permut(rem, result+ch);
			alphabet[ch - 'a']=true;
				
			
			
		}
		
	}


}
