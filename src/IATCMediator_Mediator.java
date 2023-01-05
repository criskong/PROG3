/*interfaccia contenente i metodi che serviranno a capire lo stato dell'inserimento di un pacchetto*/
public interface IATCMediator_Mediator {

    /*metodo che prende in considerazione la richiesta di entrare di un pacchetto*/
    public void registerPermission(Permesso_Mediator permesso);
    /*metodo che prende in considerazione lo stato del processo entrante*/
    public void registerReady(Ready_Mediator ready);
    /*metodo da cui si evince che la richiesta è andata a buon fine ed il apcchetto è entrato*/
    public boolean isLangingOk();
    /*metodo booleano che useremo come flag*/
    public void setLandingStatus(boolean status);
}
