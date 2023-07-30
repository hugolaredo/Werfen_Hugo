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
	
	public static int addValue(int value1, int value2) {
		int result = value1 + value2;		
		return result;
	}
	
	public static int substractValue(int value1, int value2) {
		int result = value1 - value2;		
		return result;
	}
	
	public static int multiplyValue(int value1, int value2) {
		int result = value1 * value2;		
		return result;
	}
	
	
}
