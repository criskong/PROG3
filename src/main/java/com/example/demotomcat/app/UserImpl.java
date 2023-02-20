package com.example.demotomcat.app;

//classe appartenente al mediator
public class UserImpl extends Node {
  //costruttore
  public UserImpl(String name, int indirizzo_des ,ChatMediator med) {
    super(name, indirizzo_des,med);
  }

  /**
   *
   * @param msg messaggio da mandare
   * @param nome nome del tipo di pacchetto
   * @return ritorna il messaggio da mandare
   */
  @Override
  public String send(String msg , String nome) {
    mediator.sendMessage(msg, this, nome);
    return this.name+": Sending Message="+msg;
  }

  /**
   *
   * @param msg messaggio da ricevere
   * @return ritorna il messaggio da ricevere
   */
  @Override
  public String receive(String msg) {
    return this.name+": Received Message:"+msg;
  }
}


