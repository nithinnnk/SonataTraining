package Streams;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D://test.text");
		FileInputStream fis = new FileInputStream("D://test.text");
		byte b = 68;
		int i = 0;
		char c;
		try {
			fos.write(b);
			
			while((i= fis.read())!=-1) {
				c = (char)i;
				System.out.print(c);
				
			}
		}finally {
			if(fos!=null)
				fos.close();
			if(fis!=null)
				fis.close();
		}
	

	}

}
