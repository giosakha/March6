package ReadEx;

import java.io.File;

public class ReadDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = null;
		String[] paths;
		try {
			// create new file object
			file = new File("C:\\Users\\2377126\\Desktop\\gio");
			// array of files and directory
			paths = file.list();
			// for each name in the path array
			for (String path : paths) {
				// prints filename and directory name
				System.out.println(path);
			}
		} catch (Exception e) {
			// if any error occurs
			e.printStackTrace();
		}
	}
}
