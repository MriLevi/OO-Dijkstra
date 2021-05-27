package mrilevi.com.dijkstra;

import java.util.*;

public class Reis {
	private double Afstand;
	private List<Stap> path = new ArrayList<>();
	private String reistype;

	public Reis(String reistype) {
		this.reistype = reistype;
	}

	public void setPath(List<Stap> path) {
		this.path = path;
	}

	public void setAfstand(double pathdistance) {
		this.Afstand = pathdistance;
	}


	public String toString() {
		String printstring;
		System.out.println(reistype);
		switch (reistype) {
			case "vliegtuig":
				printstring = " en die route kost " + Afstand + " euro. Je kans op bagage kwijtraken is: (helaas niet geimplementeerd)" ;
				break;
			case "auto":
				printstring = " en die route is " + Afstand + " kilometer lang.";
				break;
			case "trein":
				printstring = " en die route duurt " + Afstand + " minuten";
				break;
			default:
				throw new IllegalStateException("Unexpected value: " + reistype);
		}
		return "De kortste route is " + path.toString().replace("[", "").replace("]", "") + printstring + "";
	}
}