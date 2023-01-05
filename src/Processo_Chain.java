/*classe inerente al processo successivo*/
public abstract class  Processo_Chain {
    private Processo_Chain ProcessoSucc;
    /*  costruttore*/
    public Processo_Chain(Processo_Chain ProcessoSucc){
        this.ProcessoSucc = ProcessoSucc;
    }

    /*metodo che vede se il processo successivo non sia nullo*/
    public void processo(Tipo_Chain richiesta){
        if(ProcessoSucc != null)
        {
            ProcessoSucc.processo(richiesta);
        }
    }
}
