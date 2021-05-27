package mrilevi.com.dijkstra;

import java.util.*;

public class Reis {
	private double Afstand;
	private List<Stap> path = new ArrayList<>();

	public void setPath(List<Stap> path) {
		this.path = path;
	}

	public void setAfstand(double pathdistance) {
		this.Afstand = pathdistance;
	}

	public String toString() {
		String route = "";
		String target = "";
		System.out.println(path);
		for (Stap tussenstap : path) {
			target = "";
			route += tussenstap;
			route += ", ";
			target += tussenstap;
		}
		return "Dit is de kortste routste naar " + target + ": " + route.substring(0, route.length() - 2) + " en dat is " + Afstand + this.path.get(0).getEdges().get(0);
	}


}