package com.example.demotomcat.app;

import java.io.IOException;
import java.util.List;
//classe che riguarda il design pattern strategy e mi permette di creare sia il setStrategy sia l'executeStrategy richiamate poi nel main
public class Context_Strategy {

    private Strategy strategy;

    /**
     *
     * @param strategy input che permette di istranziare un oggetto di tipo strategy, in questo caso di tipo Dijkstra dove risiedono i vari metodi principali
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     *
     * @param source rappresenta il nodo 0
     * @param nodes rappresenta la lista di nodi che rappresentano il grafo
     * @throws IOException Costruisce un IOException con null come messaggio di dettaglio dell'errore
     */
    public void executeStrategy(Node source, List<Node> nodes) throws IOException {
        strategy.calculateShortestPath(source);
    }
}
