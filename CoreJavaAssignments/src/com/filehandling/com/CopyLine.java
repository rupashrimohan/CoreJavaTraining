package com.filehandling.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyLine {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader in=null;
		FileWriter  out = null;
		BufferedReader read = null; 
		BufferedWriter write = null;
		
		try {
			in = new FileReader("D://JavaFileHandling/demo.txt");
			out = new FileWriter("D://JavaFileHandling/demoLineout.txt");
			read = new BufferedReader(in);
			write= new BufferedWriter(out);
			
			String line;
			while((line=read.readLine())!=null)
			{
			System.out.println(line);
		    write.write(line);
			}
			read.close();
			write.flush();
			write.close();
			System.out.println("Reading and writing is  complete");
			out.close();
			in.close();
		}catch(IOException io)
		{
			System.out.println(io.getMessage());
		}

	}


}
