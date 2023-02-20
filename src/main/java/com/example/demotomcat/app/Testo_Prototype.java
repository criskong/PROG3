package com.example.demotomcat.app;

import java.lang.constant.Constable;

/* classe che permette di crare un pacchetto Video (Prototype)*/
public class Testo_Prototype extends Shape_Prototype{

    /*costruttore della classe con i vari parametri : tipo, ind_ric, ind_tras*/
    public Testo_Prototype(){
        this.tipo = "Testo";
        this.ind_ric = 43278465;
        this.ind_tras = 2;
    }

    /*metodo che permette di aggiungere   il pacchetto */
    @Override
    public Object add_pacchetto()
    {
        return Testo_Prototype.this.tipo;
    }

    //metodo che permette di prendre l'indirizzo di trasferimento
    public int getIndTras() {
        return this.ind_tras;
    }



}