package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
	public static void main(String[] args) throws IOException {
		
		
		try {
			String text = "this is my file";
			FileOutputStream fout = new FileOutputStream("C:\\Users\\User\\Desktop\\java\\text.xlsx");
			byte[] b = text.getBytes();
			fout.write(b);
			fout.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
