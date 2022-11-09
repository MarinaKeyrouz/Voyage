package TravelImplementation;


import java.util.List;

/**
 * Write a description of class Voyage here.
 *
 * @author (KAYROUZ Marina et AYACHE Zahra)
 * @version (2 NOV 2022)
 */

public class Travel 
{
	
	private static int referenceNumber = 0;
	private Country country;
	private double price; 

	/**
     * Constructor for objects of class Travel
     */
    
    public Travel() {
        Travel.referenceNumber++; 
    	this.country = new Country();
    }

    public Travel(Country country) {
        Travel.referenceNumber++;
        this.country = country;
    }
    
    public void setCountry(Country country) {
		this.country = country;
	}
    
    public static int getReferenceNumber() {
 		return referenceNumber;
 	}

 	public static void setReferenceNumber(int referenceNumber) {
 		Travel.referenceNumber = referenceNumber;
 	}
    
    public Country getCountry() {
        return this.extracted();
    }
    
    public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
    public void setTravelMode(String travelMode) {
       extracted().addTravelModes(travelMode);
    }

	private Country extracted() {
		return country;
	}
    
    public List<String> getTravelMode() {
        return this.extracted().getTravelModes();
    }

	public String toString(){
        return "Id: " + Travel.referenceNumber + ", Country: " + this.extracted().getCountryName() ;
    }
}
