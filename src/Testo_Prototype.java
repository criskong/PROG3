import java.lang.constant.Constable;

/* classe che permette di crare un pacchetto Video (Prototype)*/
public class Testo_Prototype extends Shape_Prototype{

    /*costruttore della classe con i vari parametri : tipo, ind_ric, ind_tras*/
    public Testo_Prototype(){
        this.tipo = "testo";
        this.ind_ric = 43278465;
        this.ind_tras = 1287354;
    }

    /*metodo che permette di aggiungere   il pacchetto */
    @Override
    public Constable add_pacchetto()
    {
        return Testo_Prototype.this.tipo;
    }
}
