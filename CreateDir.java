package ReadEx;

import java.io.*;

public class CreateDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirname = "C:\\Users\\2377126\\Desktop\\gio";
		File d = new File(dirname);
		// Create directory now.
		d.mkdirs();
	}

}
