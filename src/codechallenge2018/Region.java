package codechallenge2018;

import java.util.HashMap;

public class Region {
	
	private int nPacchetti;
	private HashMap<String, Integer> unitsAvailable = new HashMap<String, Integer>();
	private HashMap<String, Integer> latencies = new HashMap<String, Integer>();
	
	public Region(int nPacchetti) {
		this.nPacchetti = nPacchetti;
	}
	
	public void addServiceUnit(String service, int unit) {
		unitsAvailable.put(service, unit);
	}
	
	public void addLatency(String country, int lat) {
		latencies.put(country, lat);
	}
}
