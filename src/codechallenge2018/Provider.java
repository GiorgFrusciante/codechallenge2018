package codechallenge2018;

import java.util.HashMap;

public class Provider {
	
	private String nome;
	private int nRegioni;
	private HashMap<String, Region> regioni = new HashMap<String, Region>();
	
	public Provider(String nome, int nRegioni) {
		this.nome = nome;
		this.nRegioni = nRegioni;
	}
	
	public void addRegion(String regionName, Region reg) {
		regioni.put(regionName, reg);
	}
}
