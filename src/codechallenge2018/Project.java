package codechallenge2018;

import java.util.HashMap;

public class Project {
	
	private int penalty;
	private String country;
	HashMap<String, Integer> unitsNeeded = new HashMap<String, Integer>();
	HashMap<String, Integer> allocatedUnits = new HashMap<String, Integer>();
	
	public Project(int pen, String country) {
		penalty = pen;
		this.country = country;
	}
	
	public void addServiceCost(String serv, int cost) 
	{
		unitsNeeded.put(serv, cost);
		allocatedUnits.put(serv, 0);
	}
	
	public int getPenalty() {return penalty;}
	
	public String getCountry() { return country;}
	
	/*
	 * dato il nome di un servizio restituisce il numero di unità necessarie per il progetto
	 */
	public int getUnitNeeded(String serv) {
		return unitsNeeded.get(serv);
	}
	
	public int getFine() {
		int finalFine = 0;
		
		for (String serv : unitsNeeded.keySet()) {
			int needed = unitsNeeded.get(serv);
			int allocated = allocatedUnits.get(serv);
			
			finalFine += (penalty * ((needed - Math.min(needed, allocated))/ needed));
		}
		
		return finalFine;
	}
}
