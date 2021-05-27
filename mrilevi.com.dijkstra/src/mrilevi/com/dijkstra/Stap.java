package mrilevi.com.dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Stap implements java.lang.Comparable<Stap> {

	private String name;
	private boolean visited;
	private List<Edge> edges;
	private Stap previousStap;
	private Double minDistance = Double.MAX_VALUE;

	public Stap(String name) {
		this.name = name;
		this.edges = new ArrayList<>();
	}

	public String getName() {
		return this.name;
	}

	public void addEdge(Edge edge) {
		this.edges.add(edge);
	}

	public List<Edge> getEdges() {
		return this.edges;

	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;

	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public Stap getPreviousStap() {
		return previousStap;

	}

	public void setPreviousStap(Stap previousStap) {
		this.previousStap = previousStap;
	}

	public Double getMinDistance() {
		return this.minDistance;
	}


	public void setMinDistance(Double minDistance) {
		this.minDistance = minDistance;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Stap otherStap) {
		return Double.compare(this.minDistance, otherStap.minDistance);
	}
}