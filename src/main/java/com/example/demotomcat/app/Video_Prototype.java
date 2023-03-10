package com.example.demotomcat.app;

import java.lang.constant.Constable;

/* classe che permette di crare un pacchetto Video (Prototype)*/
public class Video_Prototype extends Shape_Prototype{

    /*costruttore della classe con i vari parametri : tipo, ind_ric, ind_tras*/
    public Video_Prototype(){
        this.tipo="video";
        this.ind_ric = 1254325;
        this.ind_tras = 5;
    }

    /*metodo che permette di aggiungere   il pacchetto */
    @Override
    public Object add_pacchetto()
    {
        return Video_Prototype.this.tipo;
    }
    //metodo che permette di prendre l'indirizzo di trasferimento
    public int getIndTras() {
        return this.ind_tras;
    }


}