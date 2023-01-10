public class UserImpl extends Node {
  public UserImpl(String name, int indirizzo_des ,ChatMediator med) {
  super(name, indirizzo_des,med);
  }


  @Override
  public void send(String msg){
  System.out.println(this.name+": Sending Message="+msg);
    mediator.sendMessage(msg, this);
  }

  @Override
  public void receive(String msg) {
  System.out.println(this.name+": Received Message:"+msg);
  }
}
