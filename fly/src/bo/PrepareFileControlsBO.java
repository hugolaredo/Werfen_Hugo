package bo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import beans.CoordenatesFlyBean;
import constants.Constants;
import utils.Utils;

public class PrepareFileControlsBO {

	public static CoordenatesFlyBean prepareFileCommnadsTrip(String file, boolean aim) {
		CoordenatesFlyBean coordenatesFly = new CoordenatesFlyBean();
		try {
			BufferedReader reader;
			reader = new BufferedReader(new FileReader(file));
			
			
		    
		    while(reader.ready()) {
		    	String[] splitCommands = reader.readLine().split(" ");
		    	
		    	if(splitCommands[0].toUpperCase().equals(Constants.up.toUpperCase())) {
		    		coordenatesFly.setAltitude(Utils.substractValue(coordenatesFly.getAltitude(), Integer.parseInt(splitCommands[1])));
		    		coordenatesFly.setAim(Utils.substractValue(coordenatesFly.getAim(), Integer.parseInt(splitCommands[1])));		    	
		    	}else if(splitCommands[0].toUpperCase().equals(Constants.down.toUpperCase())) {
		    		coordenatesFly.setAltitude(Utils.addValue(coordenatesFly.getAltitude(), Integer.parseInt(splitCommands[1])));		    		
		    		coordenatesFly.setAim(Utils.addValue(coordenatesFly.getAim(), Integer.parseInt(splitCommands[1])));	
		    	}else if(splitCommands[0].toUpperCase().equals(Constants.forward.toUpperCase())){
		    		coordenatesFly.setHorizontal(Utils.addValue(coordenatesFly.getHorizontal(), Integer.parseInt(splitCommands[1])));
		    		if(aim) {
		    			if(coordenatesFly.getAim() != 0) {
		    				int multi = Utils.multiplyValue(Integer.parseInt(splitCommands[1]), coordenatesFly.getAim());
		    				coordenatesFly.setAltitude(Utils.addValue(coordenatesFly.getAltitude(), multi));
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
			return coordenatesFly;
		}
 	   
	    
		return coordenatesFly;
	    
	}
	
	
}
