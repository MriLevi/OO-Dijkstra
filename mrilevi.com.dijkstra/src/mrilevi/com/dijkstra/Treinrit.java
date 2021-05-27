package mrilevi.com.dijkstra;

public class Treinrit extends Edge {

	private Integer minutes;

	public Treinrit(Integer minutes, Stap startStap, Stap targetStap) {
		super(startStap, targetStap);
		this.minutes = minutes;
	}

	public Integer getMinutes() {
		return this.minutes;
	}

	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}

	public Integer getWeight() {
		return minutes;
	}

	public void setWeight(Integer weight) {
		minutes = weight;
	}

	public String toString() {
		return " minuten";
	}

}