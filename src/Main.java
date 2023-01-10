import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*creazione pacchetti immagini*/



        /*creazione della catena */
        Catena_Chain catena = new Catena_Chain();
        Queue CodaIM = new LinkedList();
        Queue CodaVI = new LinkedList();
        Queue CodaGen = new LinkedList();

        boolean flag = true;
        while (flag) {
            System.out.println("Che tipo di pacchetti vuoi creare? ");
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader console = new BufferedReader(reader);
            String input = console.readLine();
            ;
            String string = String.valueOf(input);

            switch (input) {
                case "Immagine":
                    System.out.println("Quanti ne vuoi creare? ");
                    InputStreamReader reader1 = new InputStreamReader(System.in);
                    BufferedReader console1 = new BufferedReader(reader1);
                    String input1 = console1.readLine();
                    int integer = Integer.parseInt(input1);

                    for (int i = 0; i < integer; i++) {
                        CodaIM.add(PacchettiStore_Prototype.get_pacchetto(input).add_pacchetto());
                        catena.processo(new Tipo_Chain("Immagine"));
                    }


                    System.out.println("Vuoi aggiungere altro? (si o no)");
                    InputStreamReader reader3 = new InputStreamReader(System.in);
                    BufferedReader console3 = new BufferedReader(reader1);
                    String input3 = console3.readLine();
                    if (input3.equals("no")) {
                        flag = false;
                    }

                    break;
                case "Video":
                    /*creazione paccchetti video*/
                    System.out.println("Quanti ne vuoi creare? ");
                    InputStreamReader reader2 = new InputStreamReader(System.in);
                    BufferedReader console2 = new BufferedReader(reader2);
                    String input2 = console2.readLine();
                    ;
                    int integer2 = Integer.parseInt(input2);

                    for (int i = 0; i < integer2; i++) {
                        CodaVI.add(PacchettiStore_Prototype.get_pacchetto("Video").add_pacchetto());
                        catena.processo(new Tipo_Chain("Video"));
                    }

                    System.out.println("Vuoi aggiungere altro? (si o no)");
                    InputStreamReader reader4 = new InputStreamReader(System.in);
                    BufferedReader console4 = new BufferedReader(reader2);
                    String input4 = console4.readLine();
                    if (input4.equals("no")) {
                        flag = false;
                    }
                    break;
                default:
                    System.out.println("sbagliato");
            }
        }
        ChatMediator mediator = new ChatMediatorImpl();
        Node nodeA = new UserImpl("A", 0, mediator);
        Node nodeB = new UserImpl("B", 1, mediator);
        Node nodeC = new UserImpl("C", 2, mediator);
        Node nodeD = new UserImpl("D", 3, mediator);
        Node nodeE = new UserImpl("E", 4, mediator);
        Node nodeF = new UserImpl("F", 5, mediator);


        mediator.addUser(nodeB);
        mediator.addUser(nodeC);
        mediator.addUser(nodeD);
        mediator.addUser(nodeE);
        mediator.addUser(nodeF);


boolean flag2= true;
        while (flag2) {
            nodeA.addAdjacentNode(nodeB, (int) (Math.random() * (10 - 1 + 1)) + 1);
            nodeA.addAdjacentNode(nodeC, (int) (Math.random() * (10 - 1 + 1)) + 1);

            nodeB.addAdjacentNode(nodeC, (int) (Math.random() * (10 - 1 + 1)) + 1);
            nodeB.addAdjacentNode(nodeD, (int) (Math.random() * (10 - 1 + 1)) + 1);
            nodeB.addAdjacentNode(nodeE, (int) (Math.random() * (10 - 1 + 1)) + 1);

            nodeC.addAdjacentNode(nodeD, (int) (Math.random() * (10 - 1 + 1)) + 1);

            nodeD.addAdjacentNode(nodeE, (int) (Math.random() * (10 - 1 + 1)) + 1);
            nodeD.addAdjacentNode(nodeF, (int) (Math.random() * (10 - 1 + 1)) + 1);

            nodeE.addAdjacentNode(nodeF, (int) (Math.random() * (10 - 1 + 1)) + 1);

            if (!CodaIM.isEmpty() || CodaGen.isEmpty()) {
                CodaGen.addAll(CodaIM);
                CodaIM.clear();

                for (int i = 0; i < CodaGen.size(); i++) {
                    if (!CodaGen.isEmpty()) {
                        Context_Strategy strategy = new Context_Strategy();
                        strategy.setStrategy(new Percorso_IMM_Strategy());
                        strategy.executeStrategy(nodeA, Arrays.asList(nodeA, nodeB, nodeC, nodeD, nodeE, nodeF));

                    }
                }
                CodaGen.clear();
                nodeA.send("pacchetto-immagine");
                flag2=true;
            }

            if (!CodaVI.isEmpty() && CodaGen.isEmpty()) {
                CodaGen.addAll(CodaVI);
                CodaVI.clear();


                for (int i = 0; i < CodaGen.size(); i++) {
                    if (!CodaGen.isEmpty()) {
                        Context_Strategy strategy = new Context_Strategy();
                        strategy.setStrategy(new Percorso_VID_Strategy());
                        strategy.executeStrategy(nodeA, Arrays.asList(nodeA, nodeB, nodeC, nodeD, nodeE, nodeF));

                    }
                }
                nodeA.send("pacchetto-video");
                flag2=false;
            }


        }
    }
}