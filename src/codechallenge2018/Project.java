package codechallenge2018;

import java.util.HashMap;

public class Project {
	
	private int penalty;
	private String country;
	HashMap<String, Integer> mappa = new HashMap<String, Integer>();
	
	public Project(int pen, String country) {
		penalty = pen;
		this.country = country;
	}
	
	public void addServiceCost(String serv, int cost) 
	{
		mappa.put(serv, cost);
	}
}
