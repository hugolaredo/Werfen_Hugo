package utils;

import java.io.File;

public class Utils {
	
	public static boolean existFile(String filePath) {		
		File fileFind = new File(filePath);
		if(fileFind.exists()) {
			return true;
		}else {
			return false;	
		}
	}
	
}
