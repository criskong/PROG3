package com.example.demotomcat.app;

// interfaccia che implementa il mediator
public interface ChatMediator {
    /**
     *
     * @param msg messaggio da mandare
     * @param user nodo preso in considerazione
     * @param nome nome del pacchetto
     */
    public void sendMessage(String msg, Node user, String nome);

    /**
     *
     * @param user nodo da aggiungere
     */
    void addUser(Node user);



}


