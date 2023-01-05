/*classe inerente allo stato nullo del processo*/
public class ProcessoNull_Chain extends Processo_Chain{
    /*costruttore*/
    public ProcessoNull_Chain(Processo_Chain ProcessoSucc){
        super(ProcessoSucc);
    }
    /*metodo che controlla lo stato del processo*/
    public void processo(Tipo_Chain richiesta)
    {
        if(richiesta.getTipo() == " ")
        {
            System.out.println("ProcessoNull : " + richiesta.getTipo());
        }else
        {
            super.processo(richiesta);
        }
    }


}
