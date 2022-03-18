package io;

import java.io.File;
import java.net.Socket;
import java.util.Iterator;

public class ReadAllFile {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\User\\Desktop\\java");
		
		String[] string = file.list();
		for (String item : string) {
			System.out.println(item);
		}
	}

}
