package com.example.demotomcat.app;

import java.util.HashMap;
import java.util.Map;

public class PacchettiStore_Prototype {
    /*creazione di una mappa che ci eprmetterà di cercare elementi sulla base di una chiave */
    private static Map<String,Shape_Prototype> packMap = new HashMap<String,Shape_Prototype>();

    /*chiavi che verranno utilizzate per cercare i pacchetti nella packmap*/
    static
    {
            packMap.put("Immagine",new Immagine_Prototype());
            packMap.put("Video",new Video_Prototype());
            packMap.put("Testo",new Testo_Prototype());
        }


    /**
     *
     * @param nome nome del pacchetto
     * @return ritorna un clone del pacchetto che ha lo stesso nome inserito in input
     */
    public static Shape_Prototype get_pacchetto(String nome)
    {
        return (Shape_Prototype) packMap.get(nome).clone();
    }

    //costruttore vuoto
    public PacchettiStore_Prototype(){

    }




}
