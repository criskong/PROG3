package com.example.demotomcat.app;

import java.util.ArrayList;
import java.util.List;

//classe che implementa tutti i metodi dell'interfaccia ChatMediator
public class ChatMediatorImpl extends PacchettiStore_Prototype implements ChatMediator {
    private List<Node> router;
    //costruttore
    public ChatMediatorImpl() {
        this.router = new ArrayList<>();
    }

    /**
     *
     * @param router nodo da aggiungere
     */
    @Override
    public void addUser(Node router) {
        this.router.add(router);
    }

    /**
     *
     * @param msg messaggio da mandare
     * @param user nodo preso in considerazione
     * @param nome nome del pacchetto
     */
    @Override
    public void sendMessage(String msg, Node user, String nome) {
        for (Node u : this.router) {
            //message should not be received by the user sending it
            if (u != router && nome.equals("Immagine") && u.getIndirizzo_des() == PacchettiStore_Prototype.get_pacchetto("Immagine").ind_tras) {
                u.receive(msg);
            } else if (u != router && nome.equals("Video") && u.getIndirizzo_des() == PacchettiStore_Prototype.get_pacchetto("Video").ind_tras) {
                u.receive(msg);
            } else if (u != router && nome.equals("Testo") && u.getIndirizzo_des() == PacchettiStore_Prototype.get_pacchetto("Testo").ind_tras) {
                u.receive(msg);
            }

        }
    }
}
