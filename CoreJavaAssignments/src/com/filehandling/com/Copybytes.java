package com.filehandling.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copybytes {

	public static void main(String[] args) throws IOException{
		
		FileInputStream in=null;
		FileOutputStream  out = null;
		
		try {
			in = new FileInputStream("D://JavaFileHandling/demo.txt");
			out = new FileOutputStream("D://JavaFileHandling/demoByteout.txt");
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
