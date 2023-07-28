package main;

import java.io.IOException;
import java.util.Scanner;

import bo.PrepareFileControlsBO;
import constants.Constants;
import utils.Utils;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		Scanner lectura = new Scanner (System.in);		
		System.out.println("Insert File Path: \n");
		String file = lectura.next();
		while(!Utils.existFile(file)) {
			System.out.println("Error File Path: \n");
			System.out.println("Insert File Path Again: \n");
			file = lectura.next();
		}		
		System.out.println("Calculate With Aim true/false: ");
		String aim = lectura.next();
		while(!aim.equals(Constants.trueValue) && !aim.equals(Constants.falseValue)) {
			System.out.println("Error Aim Value: \n");
			System.out.println("Insert Aim Value Again: \n");
			
		}
	    
		if(aim.equals(Constants.trueValue)) {
			PrepareFileControlsBO.prepareFileCommnadsTrip(file,true);
		}else {
			PrepareFileControlsBO.prepareFileCommnadsTrip(file,false);
		}
		
		
	    
	}
}
