package io;

import java.io.File;
import java.io.IOException;

public class FileRename {
public static void main(String[] args) throws IOException {
		
		
		try {
			File file = new File("C:\\Users\\User\\Desktop\\java\\text.txt");
			
			File newFile = new File("C:\\Users\\User\\Desktop\\java\\abc.text");
			file.renameTo(newFile);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
