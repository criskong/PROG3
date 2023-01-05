/*classe inerente al processo*/
public class Permesso_Mediator implements Command_Mediator{
    private IATCMediator_Mediator atcMediator;
    /*costruttore*/
    public Permesso_Mediator(IATCMediator_Mediator atcMediator)
    {
        this.atcMediator=atcMediator;
    }
    /*metodo che stabilisce dove "atterrare"*/
    public void land()
    {
        if(atcMediator.isLangingOk())
        {
            System.out.println("Successfully Landed.");
            atcMediator.setLandingStatus(true);
        }
        else
            System.out.println("Waiting for landing.");
    }
    /*stato del processo pronto*/
    public void getReady()
    {
        System.out.println("Ready for landing.");
    }
}

