package com.example.demotomcat.app;

public class Tipo_Chain {
    private String tipo;

    /*costruttore*/
    public Tipo_Chain(String tipo)
    {
        this.tipo= tipo;
    }

    /**
     * metodo che prende il tipo assegnato
     * @return ritorna il tipo
     */
    public String getTipo()
    {
        return tipo;
    }
}
