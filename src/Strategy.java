import java.util.*;

public interface Strategy{

    public void calculateShortestPath(Node source);

    public void printPaths(List<Node> nodes);
}
