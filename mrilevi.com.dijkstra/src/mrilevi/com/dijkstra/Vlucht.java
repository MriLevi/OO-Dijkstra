package mrilevi.com.dijkstra;

public class Vlucht extends Edge {

	private Integer prijs;
	private Double kansBagage;

	public Vlucht(Integer prijs, Stap startStap, Stap targetStap, double kansBagage) {
		super(startStap, targetStap);
		this.prijs = prijs;
		this.kansBagage = kansBagage;
	}

	public double getKansBagage(){
		return this.kansBagage;
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