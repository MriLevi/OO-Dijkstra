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
        Reis reis = new Reis("auto");
        reis.setAfstand(dijkstra.getPathdistance(s6));
        reis.setPath(dijkstra.getShortestPathTo(s6));
        System.out.println(reis);

        Stap ss1 = new Stap("Barcelona");
        Stap ss2 = new Stap("Madrid");
        Stap ss3 = new Stap("Rotterdam");
        Stap ss4 = new Stap("New york");
        Stap ss5 = new Stap("Berlijn");
        Stap ss6 = new Stap("London");

        ss1.addEdge(new Vlucht(320,ss1,ss3));
        ss1.addEdge(new Vlucht(559,ss1,ss2));
        ss2.addEdge(new Vlucht(131,ss2,ss3));
        ss2.addEdge(new Vlucht(205,ss2,ss4));
        ss3.addEdge(new Vlucht(605,ss3,ss5));
        ss3.addEdge(new Vlucht(325,ss3,ss6));
        ss4.addEdge(new Vlucht(512,ss4,ss5));

        Dijkstra dijkstravlucht = new Dijkstra();
        dijkstravlucht.computePath(ss1);
        Reis reisvlucht = new Reis("vliegtuig");
        reisvlucht.setAfstand(dijkstravlucht.getPathdistance(ss6));
        reisvlucht.setPath(dijkstravlucht.getShortestPathTo(ss6));
        System.out.println(reisvlucht);

        Stap trs1 = new Stap("Utrecht");
        Stap trs2 = new Stap("Amersfoort");
        Stap trs3 = new Stap("Amersfoort Schothors");
        Stap trs4 = new Stap("Zwolle");
        Stap trs5 = new Stap("Amsterdam Centraal");
        Stap trs6 = new Stap("Amsterdam Zuid");

        trs1.addEdge(new Treinrit(25,trs1,trs3));
        trs1.addEdge(new Treinrit(18,trs1,trs2));
        trs2.addEdge(new Treinrit(5,trs2,trs3));
        trs2.addEdge(new Treinrit(40,trs2,trs4));
        trs3.addEdge(new Treinrit(35,trs3,trs5));
        trs3.addEdge(new Treinrit(65,trs3,trs6));
        trs4.addEdge(new Treinrit(105,trs4,trs5));

        Dijkstra treinstra = new Dijkstra();
        treinstra.computePath(trs1);
        Reis treinreis = new Reis("trein");
        treinreis.setAfstand(dijkstra.getPathdistance(trs6));
        treinreis.setPath(dijkstra.getShortestPathTo(trs6));
        System.out.println(treinreis);
    }
}