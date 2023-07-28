package bo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import beans.CoordenatesFlyBean;
import constants.Constants;

public class PrepareFileControlsBO {

	public static  CoordenatesFlyBean prepareFileCommnadsTrip(String file, boolean aim) {
		CoordenatesFlyBean coordenatesFly = new CoordenatesFlyBean();
		try {
			BufferedReader reader;
			reader = new BufferedReader(new FileReader(file));
			
			
		    
		    while(reader.ready()) {
		    	String[] splitCommands = reader.readLine().split(" ");
		    	
		    	if(splitCommands[0].toUpperCase().equals(Constants.up.toUpperCase())) {
		    		coordenatesFly.setAltitude(coordenatesFly.getAltitude() - Integer.parseInt(splitCommands[1]));
		    		coordenatesFly.setAim(coordenatesFly.getAim() - Integer.parseInt(splitCommands[1])); 
		    	
		    	}else if(splitCommands[0].toUpperCase().equals(Constants.down.toUpperCase())) {
		    		coordenatesFly.setAltitude(coordenatesFly.getAltitude() + Integer.parseInt(splitCommands[1]));
		    		coordenatesFly.setAim(coordenatesFly.getAim() + Integer.parseInt(splitCommands[1])); 
		    	
		    	}else if(splitCommands[0].toUpperCase().equals(Constants.forward.toUpperCase())){
		    		coordenatesFly.setHorizontal(coordenatesFly.getHorizontal() + Integer.parseInt(splitCommands[1]));
		    		if(aim) {
		    			if(coordenatesFly.getAim() != 0) {
		    				coordenatesFly.setAltitude(coordenatesFly.getAltitude() + (Integer.parseInt(splitCommands[1]) * coordenatesFly.getAim()));
			    		}
		    		}
		    		
		    	}   	
		    	
		    }
		    reader.close();
		    System.out.println("altitude  "+coordenatesFly.getAltitude());
	 		System.out.println("horizontal "+coordenatesFly.getHorizontal());
	 		System.out.println("final  "+coordenatesFly.getAltitude() * coordenatesFly.getHorizontal());
	 		System.out.println("----------------------------------------------------------------------");
 		
 		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return null;
		}
 	   
	    
		return coordenatesFly;
	    
	}
	
	
}
