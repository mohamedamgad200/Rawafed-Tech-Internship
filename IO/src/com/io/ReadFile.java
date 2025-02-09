package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		String path="C:\\Users\\legion\\eclipse-workspace\\Data\\read.txt";
		File file=new File(path);
        try {
        	FileReader fr=new FileReader(file);
        	BufferedReader bf=new BufferedReader(fr);
        	//BufferedReader bf2=new BufferedReader(new FileReader(new File(path)));
        	String line=null;
        	while((line=bf.readLine())!=null)
        	{
        		System.out.println(line);
        	}
        	bf.close();
        	fr.close();
        }catch(FileNotFoundException e){
        	e.printStackTrace();
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
	}

}
