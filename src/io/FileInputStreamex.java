package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamex {
	public static void main(String[] args) throws IOException {
		// System.out.println("helllo");

		try {

			FileInputStream fis = new FileInputStream("C:\\test\\h.txt");
			int i = 0;

			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
