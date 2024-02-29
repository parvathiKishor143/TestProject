package ApacheCommonsIO;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f= new File("C:\\New folder\\File.txt");
//String file= FileUtils.readFileToString(f, "UTF-8");
//System.out.println(file);

// Edit file
//FileUtils.write(f, "I love my parents", "UTF-8", true);

/*Edit in acceding alphabetic order
List<String> list= FileUtils.readLines(f,"UTF-8");
Collections.sort(list);
FileUtils.write(f, "", "UTF-8", false); // cleared all the content
 for(String li: list) {
	 FileUtils.write(f, li+"\n", "UTF-8", true); 
	 System.out.println(li);
	 }*/

// copy file to another file
File f1=new File("C:\\New folder\\File1.txt");
File dr=new File("C:\\New folder\\dir");
File f2=new File("C:\\New folder\\File2.txt");
FileUtils.copyFile(f, f1);
	 

// copy file to directory
FileUtils.copyFileToDirectory(f, dr);

//Rename or move file
FileUtils.moveFile(f1, f2);
	 
	 
	 
 }

	}

