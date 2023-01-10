import java.lang.constant.Constable;

public  abstract class Shape_Prototype implements Cloneable{
   /*variabili che vengono usate per ogni pacchetto creato*/
    protected String tipo;
    protected int ind_ric;
    protected int ind_tras;

    /*costruttore vuoto*/
    public Shape_Prototype(){}

    /*costruttore della classe che inizializza tutte e 3 le variabili*/
    public Shape_Prototype(String tipo,int ind_ric,int ind_tras){
        this.tipo=tipo;
        this.ind_ric=ind_ric;
        this.ind_tras=ind_tras;
    }

    /*metodo che permette di clonare l'oggetto istanziato per quella determinata classe ossia immagine, testo o video*/
    public  Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }

    /*metodo astratto che permette di aggiungere un pacchetto*/
    public  abstract Constable add_pacchetto();

    public String getTipo() {
        return tipo;
    }
}
