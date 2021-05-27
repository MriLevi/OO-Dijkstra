package mrilevi.com.dijkstra;

import java.util.*;
public class Dijkstra {

    // source = https://gist.github.com/artlovan/a07f29e16ab725f8077157de7abdf125

    private double pathdistance = 0;
    public void computePath(Stap beginStap) {
        beginStap.setMinDistance(0.0);
        PriorityQueue<Stap> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(beginStap);

        while (!priorityQueue.isEmpty()) {
            Stap stap = priorityQueue.poll();

            for (Edge edge : stap.getEdges()) {
                Stap s = edge.getTargetStap();
                double weight = edge.getWeight();
                double minDistance = stap.getMinDistance() + weight;
                if (minDistance < s.getMinDistance()) {
                    priorityQueue.remove(stap);
                    s.setPreviousStap(stap);
                    s.setMinDistance(minDistance);
                    priorityQueue.add(s);
                }
            }
        }
    }
    public List<Stap> getShortestPathTo(Stap targetStap) {
        List<Stap> path = new ArrayList<>();
        for (Stap stap = targetStap; stap != null; stap = stap.getPreviousStap()) {
            path.add(stap);
        }
        Collections.reverse(path);
        return path;
    }

    public double getPathdistance() {
        return pathdistance;
    }
}