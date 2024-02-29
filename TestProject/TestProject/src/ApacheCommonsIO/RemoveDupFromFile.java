package ApacheCommonsIO;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;

public class RemoveDupFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file= new File("C:\\New folder\\DuplicateWords.txt");
		String dup=FileUtils.readFileToString(file,"UTF-8");
		String s=dup.replaceAll("/n", " ");
		String duplicate[]=s.split(" ");
		String neww="";
		
		for(String d:duplicate ) {
			if(!neww.contains(d)&& d.trim()!="") { // not equal to word or blank
				neww=neww+ " " +d;
				
			}
		}
		FileUtils.write(file, neww, "UTF-8", false);
		
		
	}

}
