package com.example.demotomcat.app;

import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;
//classe dove risiedono tutti i principali metodi del cammino minimo
public class Dijkstra extends Immagine_Prototype implements Strategy{

    //costruttore vuoto
    public Dijkstra() throws IOException {

    }

    /**
     *
     * @param source rappresenta il nodo 0
     */
    public void calculateShortestPath(Node source) {
        source.setDistance(0);//settare la distanza del nodo A a 0
        Set<Node> settledNodes = new HashSet<>();
        Queue<Node> unsettledNodes = new PriorityQueue<>(Collections.singleton(source)); //coda di priorità che avrà già il nodo origine all'interno
        while (!unsettledNodes.isEmpty()) {
            Node currentNode = unsettledNodes.poll();
            currentNode.getAdjacentNodes().entrySet().stream().filter(entry -> !settledNodes.contains(entry.getKey())).forEach(entry -> {
                evaluateDistanceAndPath(entry.getKey(), entry.getValue(), currentNode);
                unsettledNodes.add(entry.getKey());
            });
            settledNodes.add(currentNode);
        }


    }
    /**
     * @param adjacentNode rappresenta il nodo adiacente
     * @param edgeWeight rappresenta il peso dell'arco
     * @param sourceNode nodo corrente
     */
    private void evaluateDistanceAndPath(Node adjacentNode, Integer edgeWeight, Node sourceNode) {
        Integer newDistance = sourceNode.getDistance() + edgeWeight;
        if (newDistance < adjacentNode.getDistance()) {
            adjacentNode.setDistance(newDistance);
            adjacentNode.setShortestPath(Stream.concat(sourceNode.getShortestPath().stream(), Stream.of(sourceNode)).toList());
        }
    }





}
