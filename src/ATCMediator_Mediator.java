public class ATCMediator_Mediator implements IATCMediator_Mediator {
    private Ready_Mediator ready;
    private Permesso_Mediator permesso;
    public boolean land;
    /*metodo che prende in considerazione la richiesta di entrare di un pacchetto*/
    @Override
    public void registerPermission(Permesso_Mediator permesso)
    {
        this.permesso=permesso;
    }
    /*metodo che prende in considerazione lo stato del processo entrante*/
    @Override
    public void registerReady(Ready_Mediator ready)
    {
        this.ready=ready;
    }
    /*metodo da cui si evince che la richiesta è andata a buon fine ed il apcchetto è entrato*/
    @Override
    public boolean isLangingOk()
    {
        return land;
    }
    /*metodo booleano che useremo come flag*/
    @Override
    public void setLandingStatus(boolean status)
    {
        land = status;
    }
}
