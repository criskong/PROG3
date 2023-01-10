import java.util.*;

public abstract class Node implements Comparable<Node>{
    protected final String name; //nome del nodo
    protected ChatMediator mediator;
    protected  int indirizzo_des;


    private Integer distance = Integer.MAX_VALUE;//distanza del nodo che simuliamo con più infinito
    private List<Node> shortestPath = new LinkedList<>();//lista che memorizza il percorso più breve
    private Map<Node,Integer> adjacentNodes = new HashMap<>(); //mappa che memorizza il nodo adiacente e il peso dell'arco che li separa

    public void addAdjacentNode(Node node, int weight)
    {
        adjacentNodes.put(node,weight);

    }
    @Override
    public int compareTo(Node node)
    {
        return Integer.compare(this.distance, node.getDistance());
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Node(String name, int indirizzo_des,ChatMediator mediator){
        this.name=name;
        this.mediator=mediator;
        this.indirizzo_des=indirizzo_des;
    }

    public Map<Node, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setShortestPath(List<Node> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public List<Node> getShortestPath() {
        return shortestPath;
    }

    public String getName() {
        return name;
    }

    public int getIndirizzo_des() {
        return indirizzo_des;
    }

    public void setIndirizzo_des(int indirizzo_des) {
        this.indirizzo_des = indirizzo_des;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);

}
