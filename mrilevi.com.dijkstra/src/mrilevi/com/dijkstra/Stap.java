package mrilevi.com.dijkstra;

import java.util.List;

public class Stap {

	Reis reis;
	private String name;
	private boolean visited;
	private List<Edge> edges;
	private Stap previousStap;
	private Double minDistance;

	/**
	 * 
	 * @param name
	 */
	public Stap(String name) {
		// TODO - implement Stap.Stap
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	public String getId() {
		// TODO - implement Stap.getId
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param obj
	 */
	public boolean equals(Object obj) {
		// TODO - implement Stap.equals
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param s
	 */
	public void compareTo(Stap s) {
		// TODO - implement Stap.compareTo
		throw new UnsupportedOperationException();
	}
	public void addEdge(Edge edge) {
		// TODO - implement Stap.addEdge
		throw new UnsupportedOperationException();
	}

	public void getEdges() {
		// TODO - implement Stap.getEdges
		throw new UnsupportedOperationException();
	}

	public void setEdges() {
		// TODO - implement Stap.setEdges
		throw new UnsupportedOperationException();
	}

	public void isVisited() {
		// TODO - implement Stap.isVisited
		throw new UnsupportedOperationException();
	}

	public void setVisited() {
		// TODO - implement Stap.setVisited
		throw new UnsupportedOperationException();
	}

	public void getPreviousStap() {
		// TODO - implement Stap.getPreviousStap
		throw new UnsupportedOperationException();
	}

	public void setPreviousStap(Stap previousStap) {
		// TODO - implement Stap.setPreviousStap
		throw new UnsupportedOperationException();
	}

	public Double getMinDistance() {
		return this.minDistance;
	}


	public void setMinDistance(Double minDistance) {
		this.minDistance = minDistance;
	}

}