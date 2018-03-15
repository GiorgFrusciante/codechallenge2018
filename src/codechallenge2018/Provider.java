package codechallenge2018;

import java.util.HashMap;

public class Provider {
	
	private int nRegioni;
	private HashMap<String, Region> regioni = new HashMap<String, Region>();
	
	public Provider(int nRegioni) {
		this.nRegioni = nRegioni;
	}
	
	public void addRegion(String regionName, Region reg) {
		regioni.put(regionName, reg);
	}
}
