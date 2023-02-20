package com.example.demotomcat.app;

/*classe inerente allo stato positivo del processo*/
public class ProcessoPositivo_Chain extends Processo_Chain{
    /*costruttore*/
    public ProcessoPositivo_Chain(Processo_Chain ProcessoSucc)
    {
        super(ProcessoSucc);
    }
    /*metodo che controlla lo stato del processo*/
    public void processo(Tipo_Chain richiesta)
    {

        if(richiesta.getTipo() == "Immagine" || richiesta.getTipo() == "Video" || richiesta.getTipo() == "Testo")
        {

            System.out.println("ProcessoPositivo : " + richiesta.getTipo());
        }else
        {
            super.processo(richiesta);
        }

    }
}
