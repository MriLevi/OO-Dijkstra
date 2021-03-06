package mrilevi.com.dijkstra;

public class Vlucht extends Edge {

	private Integer prijs;

	public Vlucht(Integer prijs, Stap startStap, Stap targetStap) {
		super(startStap, targetStap);
		this.prijs = prijs;
	}

	public Integer getPrijs() {
		return this.prijs;
	}

	public void setPrijs(Integer prijs) {
		this.prijs = prijs;
	}

	public Integer getWeight() {
		return prijs;
	}


	public void setWeight(Integer weight) {
		prijs = weight;
	}
	public String toString() {
		return " euro.";
	}
}