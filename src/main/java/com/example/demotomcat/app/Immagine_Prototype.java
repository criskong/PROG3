package com.example.demotomcat.app;

import java.lang.constant.Constable;

/* classe che permette di crare un pacchetto immagine (Prototype)*/
public class Immagine_Prototype extends Shape_Prototype {

    /*costruttore della classe con i vari parametri : tipo, ind_ric, ind_tras*/


    public Immagine_Prototype() {
        this.tipo = "Immagine";
        this.ind_ric = 0;
        this.ind_tras = 4;

    }


    /*metodo che permette di aggiungere   il pacchetto */
    @Override
    public Object add_pacchetto() {
        return Immagine_Prototype.this.tipo;
    }

    //metodo che permette di prendre l'indirizzo di trasferimento
    @Override
    public int getInd_tras() {
        return this.ind_tras;
    }


}
