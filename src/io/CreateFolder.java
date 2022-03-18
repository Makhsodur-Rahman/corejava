package io;

import java.io.File;

public class CreateFolder {
	public static void main(String[] args) {

		try {
			File file = new File("C:\\Users\\User\\Desktop\\java\\JavaTest\\test.txt");

			if(file.mkdirs()) {
				System.out.println("sucess");
			}
			else {
				System.out.println("fail");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
