package com.example.demotomcat.app;

/*classe che permettera di creare una catena di responsabilitÃ */

public class Catena_Chain {


    Processo_Chain catena;

    /*costruttore*/
    public Catena_Chain(){
        buildCatena();
    }
    /*metodo che consentirÃ  la creazione effettiva della catena*/
    private void buildCatena(){
        catena = new ProcessoPositivo_Chain(new ProcessoNull_Chain(new ProcessoNegativo_Chain(null)));
    }

    /*metodo che permetterÃ  di vedere le richieste dei vari processi*/
    public void processo(Tipo_Chain richiesta){
        catena.processo(richiesta);

    }
}
