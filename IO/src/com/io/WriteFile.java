package com.io;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
   public static void main(String[]args) {
	   String string="Rawafed internship\nDatabase\nJava\nSpringboot";
	   String path="C:\\Users\\legion\\eclipse-workspace\\Data\\file.txt";
	   try {
		   FileWriter fw=new FileWriter(path);
		   BufferedWriter bf=new BufferedWriter(fw);
		   bf.write(string);
		   bf.flush();
		   bf.close();
		   fw.close();
	   }catch(IOException e)
	   {
		   e.printStackTrace();
	   }
   }
}
