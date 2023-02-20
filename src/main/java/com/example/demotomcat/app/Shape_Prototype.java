package com.example.demotomcat.app;

import java.lang.constant.Constable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
//classe principale del prototype
public  abstract class Shape_Prototype implements Cloneable{
    /*variabili che vengono usate per ogni pacchetto creato*/
    protected String tipo;
    protected int ind_ric;
    protected int ind_tras;

    /*costruttore vuoto*/
    public Shape_Prototype(){}

    /*costruttore della classe che inizializza tutte e 3 le variabili*/
    public Shape_Prototype(String tipo,int ind_ric,int ind_tras){
        this.tipo=tipo;
        this.ind_ric=ind_ric;
        this.ind_tras=ind_tras;
    }

    /*metodo che permette di clonare l'oggetto istanziato per quella determinata classe ossia immagine, testo o video*/
    public  Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }

    /*metodo astratto che permette di aggiungere un pacchetto*/
    public  abstract Object add_pacchetto();

    public String getTipo() {
        return tipo;
    }

    public int getInd_tras() {
        return ind_tras;
    }

    /**
     *
     * @param nodes lista di nodi che formeranno il grafo
     * @return ritorna il percorso minimo
     */
    public String printPaths(List<Node> nodes) {
        StringBuilder builder = new StringBuilder();
        nodes.forEach(node -> {
            String path = node.getShortestPath().stream()
                    .map(Node::getName).map(Objects::toString)
                    .collect(Collectors.joining(" -> "));
            if (node.getIndirizzo_des() == getInd_tras()) {
                builder.append((path.isBlank()
                        ? "%s : %s".formatted(node.getName(), node.getDistance())
                        : "%s -> %s : %s".formatted(path, node.getName(), node.getDistance()))
                );
            }

        });
        return builder.toString();
    }


}
