package mrilevi.com.dijkstra;

public abstract class Edge {

	private Stap startStap;
	private Stap targetStap;

	public Edge(Stap startStap, Stap targetStap) {
		this.startStap = startStap;
		this.targetStap = targetStap;
	}
	public abstract void setWeight(Integer weight);

	public abstract Integer getWeight();

	public Stap getStartStap() {
		return startStap;
	}

	public void setStartStap(Stap startStap) {
		this.startStap = startStap;
	}

	public Stap getTargetStap() {
		return this.targetStap;
	}

	public void setTargetStap(Stap targetStap) {
		this.targetStap = targetStap;
	}



}