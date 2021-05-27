package mrilevi.com.dijkstra;

public class Rit extends Edge {

	private Integer kilometer;

	public Rit(Integer kilometer, Stap startStap, Stap targetStap) {
		super(startStap, targetStap);
		this.kilometer = kilometer;
	}

	public Integer getKilometer() {
		return this.kilometer;
	}

	public void setKilometer(Integer kilometer) {
		this.kilometer = kilometer;
	}

	@Override
	public void setWeight(Integer weight) {
		kilometer = weight;
	}

	@Override
	public Integer getWeight() {
		return kilometer;
	}
}