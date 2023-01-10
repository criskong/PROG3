import java.util.List;

public class Context_Strategy {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(Node source, List<Node> nodes)
    {
        strategy.calculateShortestPath(source);
        strategy.printPaths(nodes);
    }
}
