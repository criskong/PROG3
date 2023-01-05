/*classe dello stato ready del processo*/
public class Ready_Mediator implements Command_Mediator{
    private IATCMediator_Mediator atcMediator;
    /*costruttore*/
    public Ready_Mediator(IATCMediator_Mediator atcMediator)
    {
        this.atcMediator = atcMediator;
        atcMediator.setLandingStatus(true);
    }

    /*metodo che permette dove "atterrare"*/
    @Override
    public void land()
    {
        System.out.println("Landing ppermission granted.");
        atcMediator.setLandingStatus(true);
    }
}
