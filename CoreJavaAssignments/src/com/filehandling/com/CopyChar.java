package com.filehandling.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader in=null;
		FileWriter  out = null;
		
		try {
			in = new FileReader("D://JavaFileHandling/demo.txt");
			out = new FileWriter("D://JavaFileHandling/demoCharout.txt");
			int value;
			while((value=in.read())!=-1)
			{
			out.write(value);
			}
			System.out.println("Reading and writing is  complete");
			out.close();
			in.close();
		}catch(IOException io)
		{
			System.out.println(io.getMessage());
		}

	}

}
