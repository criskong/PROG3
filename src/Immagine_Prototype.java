import java.lang.constant.Constable;

/* classe che permette di crare un pacchetto immagine (Prototype)*/
public class Immagine_Prototype extends Shape_Prototype{

    /*costruttore della classe con i vari parametri : tipo, ind_ric, ind_tras*/



   public Immagine_Prototype() {
       this.tipo = "Immagine";
       this.ind_ric = 12415;
       this.ind_tras = 5;
   }




    /*metodo che permette di aggiungere   il pacchetto */
   @Override
   public Constable add_pacchetto()
   {
       return  Immagine_Prototype.this.tipo;
   }


}
