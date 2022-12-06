package TravelImplementation;


import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Voyage here.
 *
 * @author (KAYROUZ Marina et AYACHE Zahra)
 * @version (2 NOV 2022)
 */

public class Client implements ClientInterface{
    // instance variables - replace the example below with your own
    private static int id;
    private String name;
    private List<Travel> travel;
	private Country countryDest;

    /**
     * Constructor for objects of class Client
     */
    public Client(String name) {
        // initialize instance variables
        this.id ++;
        this.name = name;
        this.travel = new ArrayList<Travel>();
    }
    
    public Client() {
    	 this.id ++;
    	 this.travel = new ArrayList<Travel>();
    }
    
    public List<Travel> getTravel() {
		return travel;
	}
   
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

	@Override
	public String toString() {
		return "Client [name=" + name + ", countryDest=" + countryDest + "]";
	}

	public Country getCountryDest() {
		return countryDest;
	}

	public void setCountryDest(String countryDest) {
		this.countryDest = new Country(countryDest);
	}
	
    public Travel createTravel(String countryDest) {
    	if (countryDest == null) {
    		throw new NullPointerException();
    	}
    	this.setCountryDest(countryDest); 
    	Travel t = new Travel(this.countryDest);
        this.travel.add(t);
        return t;
    }
    
    @Override
    public String entertain(String type, String title) {
    	return "Fail, please retry !";
    }
}


