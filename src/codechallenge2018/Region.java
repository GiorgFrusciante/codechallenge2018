package codechallenge2018;

import java.util.HashMap;

public class Region {
	
	private int nPacchetti;
	private float packageCost;
	private HashMap<String, Integer> unitsAvailable = new HashMap<String, Integer>();
	private HashMap<String, Integer> latencies = new HashMap<String, Integer>();
	
	public Region(int nPacchetti, float cost) {
		this.nPacchetti = nPacchetti;
		packageCost = cost;
	}
	
	public void addServiceUnit(String service, int unit) {
		unitsAvailable.put(service, unit);
	}
	
	public void addLatency(String country, int lat) {
		latencies.put(country, lat);
	}
	
	/*
	 * Dato un servizio restituisce il numero di unità per pacchetto disponibili
	 */
	public int getUnitsAvailable(String serv) {
		return unitsAvailable.get(serv);
	}
	
	/*
	 * Dato una country restituisce la latenza verso di essa
	 */
	public int getLatency(String country) {
		return latencies.get(country);
	}
}
