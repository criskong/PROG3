import java.util.ArrayList;
import java.util.List;
public class ChatMediatorImpl extends PacchettiStore_Prototype implements ChatMediator {
private List<Node> router;
  public ChatMediatorImpl(){
  this.router=new ArrayList<>();
  }
  @Override
  public void addUser(Node router){
  this.router.add(router);
  }
  @Override
  public void sendMessage(String msg, Node user) {
	for(Node u : this.router){
	//message should not be received by the user sending it
		if(u != router && u.getIndirizzo_des() == PacchettiStore_Prototype.get_pacchetto("Immagine").ind_tras){
		u.receive(msg);
		}
	}
  }


}
