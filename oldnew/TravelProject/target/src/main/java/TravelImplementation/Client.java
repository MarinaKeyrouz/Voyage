package TravelImplementation;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Write a description of class Voyage here.
 *
 * @author (KAYROUZ Marina et AYACHE Zahra)
 * @version (2 NOV 2022)
 */

public class Client {
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
		Objects.requireNonNull(name);
        id ++;
        this.name = name;
        this.travel = new ArrayList<Travel>();
    }
    
    public Client() {
    	 id ++;
    	 this.travel = new ArrayList<Travel>();
    }
    
    public List<Travel> getTravel() {
		return travel;
	}
   
	public void setName(String name) {
		Objects.requireNonNull(name);
		this.name = name;
	}

	public int getId() {
        return id;
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
		Objects.requireNonNull(countryDest);
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

    public String entertain(String type, String title) {
		Objects.requireNonNull(type);
		Objects.requireNonNull(title);
    	return "Fail, please retry !";
    }
}


