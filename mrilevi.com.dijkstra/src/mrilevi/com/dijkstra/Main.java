package mrilevi.com.dijkstra;

import java.util.*;
public class Main {
    public static void main(String arg[]){
        Stap s1 = new Stap("1");
        Stap s2 = new Stap("2");
        Stap s3 = new Stap("3");
        Stap s4 = new Stap("4");
        Stap s5 = new Stap("5");
        Stap s6 = new Stap("6");

        s1.addEdge(new Rit(2,s1,s3));
        s1.addEdge(new Rit(1,s1,s2));
        s2.addEdge(new Rit(5,s2,s3));
        s2.addEdge(new Rit(1,s2,s4));
        s3.addEdge(new Rit(6,s3,s5));
        s3.addEdge(new Rit(3,s3,s6));
        s4.addEdge(new Rit(5,s4,s5));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(s1);
        Reis reis = new Reis();
        reis.setAfstand(dijkstra.getPathdistance());
        reis.setPath(dijkstra.getShortestPathTo(s6));
        System.out.println(reis);

        Stap ss1 = new Stap("Barcelona");
        Stap ss2 = new Stap("Madrid");
        Stap ss3 = new Stap("Rotterdam");
        Stap ss4 = new Stap("New york");
        Stap ss5 = new Stap("Berlijn");
        Stap ss6 = new Stap("London");

        ss1.addEdge(new Vlucht(320,ss1,ss3,0.06));
        ss1.addEdge(new Vlucht(559,ss1,ss2,0.10));
        ss2.addEdge(new Vlucht(131,ss2,ss3, 0.01));
        ss2.addEdge(new Vlucht(205,ss2,ss4,0.3));
        ss3.addEdge(new Vlucht(605,ss3,ss5, 0.35));
        ss3.addEdge(new Vlucht(320,ss3,ss6,0.2));
        ss4.addEdge(new Vlucht(512,ss4,ss5, 0.03));

        Dijkstra dijkstravlucht = new Dijkstra();
        dijkstravlucht.computePath(ss1);
        Reis reisvlucht = new Reis();
        reisvlucht.setAfstand(dijkstravlucht.getPathdistance());
        reisvlucht.setPath(dijkstravlucht.getShortestPathTo(ss6));
        System.out.println(reisvlucht);
    }
}