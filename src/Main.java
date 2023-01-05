import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException{

        /*creazione pacchetti immagini*/

        System.out.println("Che tipo di pacchetti vuoi creare? ");
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader console = new BufferedReader(reader);
        String input = console.readLine();
        String string = String.valueOf(input);

        /*creazione della catena */
        Catena_Chain catena = new Catena_Chain();


        switch (input) {
            case "Immagine":
            Queue CodaIM = new LinkedList();
                System.out.println("Quanti ne vuoi creare? ");
                InputStreamReader reader1 = new InputStreamReader(System.in);
                BufferedReader console1 = new BufferedReader(reader1);
                String input1 = console1.readLine();;
                int integer = Integer.parseInt(input1);

                for(int i=0; i<integer;i++) {
                    CodaIM.add(PacchettiStore_Prototype.get_pacchetto(input).add_pacchetto());
                    catena.processo(new Tipo_Chain("Immagine"));
                }


            break;
            case "Video":
            /*creazione paccchetti video*/
            Queue CodaVI = new LinkedList();
                System.out.println("Quanti ne vuoi creare? ");
                InputStreamReader reader2 = new InputStreamReader(System.in);
                BufferedReader console2 = new BufferedReader(reader2);
                String input2 = console2.readLine();;
                int integer2 = Integer.parseInt(input2);

                for(int i=0; i<integer2;i++) {
                    CodaVI.add(PacchettiStore_Prototype.get_pacchetto("Video").add_pacchetto());
                    catena.processo(new Tipo_Chain("Video"));
                }
            break;
        }

        /*tutto ciò che riguarda il mediator
        IATCMediator_Mediator actMediator = new ATCMediator_Mediator();
        Permesso_Mediator sparrow101 = new Permesso_Mediator(actMediator);
        Ready_Mediator mainReady = new Ready_Mediator(actMediator);
        actMediator.registerPermission(sparrow101);
        actMediator.registerReady(mainReady);
        sparrow101.getReady();
        mainReady.land();
        sparrow101.land();
        */
    }
}