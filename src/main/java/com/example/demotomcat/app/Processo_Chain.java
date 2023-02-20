package com.example.demotomcat.app;

/*classe inerente al processo successivo*/
public abstract class  Processo_Chain {
    private Processo_Chain ProcessoSucc;
    /*  costruttore*/
    public Processo_Chain(Processo_Chain ProcessoSucc){
        this.ProcessoSucc = ProcessoSucc;
    }

    /**
     *
     * @param richiesta input che permette poi di vedere all'interno del metodo lo stato del processo
     */
    public void processo(Tipo_Chain richiesta){
        if(ProcessoSucc != null)
        {
            ProcessoSucc.processo(richiesta);
        }
    }
}
