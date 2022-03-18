package io;

import java.io.File;

public class FileDelete {
	public static void main(String[] args) {

		try {
			
			File newFile = new File("C:\\Users\\User\\Desktop\\java\\abc.text");
			newFile.delete();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
