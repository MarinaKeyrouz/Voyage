package TravelImplementation;


import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Voyage here.
 *
 * @author (KAYROUZ Marina et AYACHE Zahra)
 * @version (2 NOV 2022)
 */

public class Country
{
	private String countryName;
	private List <String> travelModes;
	
    /**
     * Constructor for objects of class Country
     */
    public Country() {
    	this.travelModes = new ArrayList<>() ;
    }
    
    public Country(String countryName) {
    	this.travelModes = new ArrayList<>() ;
    	this.countryName = countryName;
    }

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<String> getTravelModes() {
		return this.travelModes;
	}

	public List<String> addTravelModes(String travelMode) {
		if (travelMode == null) {
    		throw new NullPointerException();
    	}
		String mode;
        switch (travelMode.toUpperCase()){
            case "CAR":
            	mode = "CAR";
                break;
            case "AIRPLANE":
            	mode = "AIRPLANE";
            	break;
            default:
            	mode = "BUS";
            	break;
        }
        if (!(this.travelModes.contains(mode))){
        	this.travelModes.add(mode);
        }
        return this.travelModes;
    }
	
	public void removeTravelModes() {
		 this.travelModes.clear();
		
	}
    
    public String travelModesToString() {
    	 StringBuilder modes = new StringBuilder();
         for (String m: this.travelModes) {
         	modes.append(m).append(" ");
         }
         return modes.toString();
    }

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", travelModes=" + travelModes + "]" ;
	}
	
}

