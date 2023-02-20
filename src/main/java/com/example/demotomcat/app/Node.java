package com.example.demotomcat.app;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
//classe che permette la creazione dei nodi
public abstract class Node implements Comparable<Node>{


    protected  final String name;
    protected ChatMediator mediator;
    protected  int indirizzo_des;

    //distanza del nodo che simuliamo con più infinito
    private Integer distance = Integer.MAX_VALUE;
    //lista che memorizza il percorso più breve
    private List<Node> shortestPath = new LinkedList<>();
    //mappa che memorizza il nodo adiacente e il peso dell'arco che li separa
    private Map<Node,Integer> adjacentNodes = new HashMap<>();


    /**
     *
     * @param node nodo preso in considerazione
     * @param weight peso dell'arco
     */
    public void addAdjacentNode(Node node, int weight)
    {
        adjacentNodes.put(node,weight);

    }

    /**
     *
     * @param node nodo preso in considerazione per fare la compare.
     * @return ritorna la distanza del nodo
     */

    @Override
    public int compareTo(Node node)
    {
        return Integer.compare(this.distance, node.getDistance());
    }

    /**
     *
     * @return ritorna la distanza
     */
    public Integer getDistance() {
        return distance;
    }

    /**
     *
      * @param distance setta la distanza
     */
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    /**
     * costruttore
     * @param name il nome del nodo
     * @param indirizzo_des indirizzo di destinazione
     * @param mediator mediator
     */
    public Node(String name, int indirizzo_des,ChatMediator mediator){
        this.name=name;
        this.mediator=mediator;
        this.indirizzo_des=indirizzo_des;
    }

    /**
     *
     * @return i nodi adiacenti
     */
    public Map<Node, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    /**
     *
     * @param shortestPath permette di decidere il cammino minimo
     */
    public void setShortestPath(List<Node> shortestPath) {
        this.shortestPath = shortestPath;
    }

    /**
     *
     * @return ritorna il cammino minimo
     */
    public List<Node> getShortestPath() {
        return shortestPath;
    }

    /**
     *
     * @return ritorna il nome dei pacchetti
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return ritorna l'indirizzo di destinazione
     */
    public int getIndirizzo_des() {
        return indirizzo_des;
    }


    /**
     *
     * @param msg messaggio da mandare
     * @param nome nome del tipo di pacchetto
     *
     */
    public abstract String send(String msg, String nome);

    /**
     *
     * @param msg messaggio da ricevere
     *
     */
    public abstract String receive(String msg);




}
