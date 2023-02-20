package com.example.demotomcat;

import com.example.demotomcat.app.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author  Luca D’Anna matricola: 0124002324
 * @author Antonio Criscuolo matricola: 0124002407
 * @author Giuseppe Langella matricola: 0124002437
 */
// Extend HttpServlet class
public class HelloServlet extends HttpServlet {

    /** doPost
     *
     * @param request prende come dato di input un oggetto di classe HttpServletRequest
     * @param response prende come dato di input un oggetto di classe HttpServletRequest
     * @throws ServletException Costruisce un ServletException
     * @throws IOException Costruisce un IOException con null come messaggio di dettaglio dell'errore
     */

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        String nome = request.getParameter("nome").toLowerCase();
        int quantita = Integer.parseInt(request.getParameter("quantita"));

        request.setAttribute("nome", nome);
        request.setAttribute("quantità", quantita);


        //creazione della catena per capire se il processo è positivo,negativo o positivo
        Catena_Chain catena = new Catena_Chain();
        //creazione delle code dove verranno isneriti i pacchetti
        Queue CodaIM = new LinkedList();
        Queue CodaVI = new LinkedList();
        Queue CodaTES = new LinkedList();
        Queue CodaGen = new LinkedList();

        //lista che permettera alla fine di stampare tutto l'output richiesto
        LinkedList<String> output = new LinkedList<>();

            //costrutto di controllo if che in base al nome che gli viene dato tramite input sceglie quale parte di codice eseguire
            if (nome.equals("immagine")) {

                for (int i = 0; i < quantita; i++)
                {
                    //inserisce nella coda il pacchetto creato
                    CodaIM.add(PacchettiStore_Prototype.get_pacchetto("Immagine").add_pacchetto());
                    //si genera un nuovo processo per verificare l'effettivo funzionamento
                    catena.processo(new Tipo_Chain("Immagine"));
                    //aggiunge alla lista output l'immagine
                    output.add("immagine");

                }
                //costrutto di controllo else if che in base al nome che gli viene dato tramite input sceglie quale parte di codice eseguire
            }else if(nome.equals("video"))
            {

                for (int i = 0; i < quantita; i++)
                {
                    //inserisce nella coda il pacchetto creato
                    CodaVI.add(PacchettiStore_Prototype.get_pacchetto("Video").add_pacchetto());
                    //si genera un nuovo processo per verificare l'effettivo funzionamento
                    catena.processo(new Tipo_Chain("Video"));
                    //aggiunge alla lista output l'immagine
                    output.add("video");
                }
                //costrutto di controllo else if che in base al nome che gli viene dato tramite input sceglie quale parte di codice eseguire
            }else if(nome.equals("testo"))
            {

                for (int i = 0; i < quantita; i++)
                {
                    //inserisce nella coda il pacchetto creato
                    CodaTES.add(PacchettiStore_Prototype.get_pacchetto("Testo").add_pacchetto());
                    //si genera un nuovo processo per verificare l'effettivo funzionamento
                    catena.processo(new Tipo_Chain("Testo"));
                    //aggiunge alla lista output l'immagine
                    output.add("testo");
                }
            //se il nome è sbagliato esci
            }else{
                System.out.println("sbagliato");
            }

       //istanzia oggetto mediator nella classe ChatMediator
        ChatMediator mediator = new ChatMediatorImpl();
        Node nodeA = new UserImpl("A", 0, mediator);
        Node nodeB = new UserImpl("B", 1, mediator);
        Node nodeC = new UserImpl("C", 2, mediator);
        Node nodeD = new UserImpl("D", 3, mediator);
        Node nodeE = new UserImpl("E", 4, mediator);
        Node nodeF = new UserImpl("F", 5, mediator);

        //aggiungere gli "user" ossia i nodi al mediator così da farli comunicare tra loro
        mediator.addUser(nodeB);
        mediator.addUser(nodeC);
        mediator.addUser(nodeD);
        mediator.addUser(nodeE);
        mediator.addUser(nodeF);



            //costrutto che controlla se la coda in questione è piena e la coda generale è vuota
            if (!CodaIM.isEmpty() || CodaGen.isEmpty()) {
                //aggiunge tutti i pacchetti dalla coda in questione alla coda generale
                CodaGen.addAll(CodaIM);
                //pulisce la coda
                CodaIM.clear();

                //costrutto che ripete per tutto i lsize della coda generale
                for (int i = 0; i < CodaGen.size(); i++) {
                    //se la coda è piena mi crea il grafo
                    if (!CodaGen.isEmpty()) {
                        nodeA.addAdjacentNode(nodeB, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);
                        nodeA.addAdjacentNode(nodeC, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);

                        nodeB.addAdjacentNode(nodeC, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);
                        nodeB.addAdjacentNode(nodeD, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);
                        nodeB.addAdjacentNode(nodeE, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);

                        nodeC.addAdjacentNode(nodeD, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);

                        nodeD.addAdjacentNode(nodeE, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);
                        nodeD.addAdjacentNode(nodeF, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);

                        nodeE.addAdjacentNode(nodeF, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);

                        //istanzio oggetto strategy nella classe Context_strategy
                        Context_Strategy strategy = new Context_Strategy();
                        //setto la strategia
                        strategy.setStrategy(new Dijkstra());
                        //la eseguo
                        strategy.executeStrategy(nodeA, Arrays.asList(nodeA, nodeB, nodeC, nodeD, nodeE, nodeF));
                        //passo nella lsita output tutto il percorso minimo
                        output.add(PacchettiStore_Prototype.get_pacchetto("Immagine").printPaths(Arrays.asList(nodeA, nodeB, nodeC, nodeD, nodeE, nodeF)));
                        // passo nella lista il messaggio generato dalla send
                        output.add(nodeA.send("pacchetto-immagine","Immagine"));
                        //passo nella lista il messaggio ricevuto dalla receive
                        output.add(nodeE.receive("Pacchetto_immagine"));

                    }
                }
                //pulisco la coda
                CodaGen.clear();

            }
            //costrutto che controlla se la coda in questione è piena e la coda generale è vuota
            if (!CodaVI.isEmpty() && CodaGen.isEmpty()) {
                //aggiunge tutti i pacchetti dalla coda in questione alla coda generale
                CodaGen.addAll(CodaVI);
                //pulisce la coda
                CodaVI.clear();

                //costrutto che ripete per tutto i lsize della coda generale
                for (int i = 0; i < CodaGen.size(); i++) {
                    //se la coda è piena mi crea il grafo
                    if (!CodaGen.isEmpty()) {
                        nodeA.addAdjacentNode(nodeB, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);
                        nodeA.addAdjacentNode(nodeC, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);

                        nodeB.addAdjacentNode(nodeC, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);
                        nodeB.addAdjacentNode(nodeD, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);
                        nodeB.addAdjacentNode(nodeE, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);

                        nodeC.addAdjacentNode(nodeD, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);

                        nodeD.addAdjacentNode(nodeE, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);
                        nodeD.addAdjacentNode(nodeF, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);

                        nodeE.addAdjacentNode(nodeF, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);

                        //istanzio oggetto strategy nella classe Context_strategy
                        Context_Strategy strategy = new Context_Strategy();
                        //setto la strategia
                        strategy.setStrategy(new Dijkstra());
                        //la eseguo
                        strategy.executeStrategy(nodeA, Arrays.asList(nodeA, nodeB, nodeC, nodeD, nodeE, nodeF));
                        //passo nella lsita output tutto il percorso minimo
                        output.add(PacchettiStore_Prototype.get_pacchetto("Video").printPaths(Arrays.asList(nodeA, nodeB, nodeC, nodeD, nodeE, nodeF)));
                        // passo nella lista il messaggio generato dalla send
                        output.add(nodeA.send("pacchetto-video","Video"));
                        //passo nella lista il messaggio ricevuto dalla receive
                        output.add(nodeF.receive("Pacchetto_video"));
                    }
                }
                //pulisco la coda
                CodaGen.clear();

            }
            //costrutto che controlla se la coda in questione è piena e la coda generale è vuota
            if (!CodaTES.isEmpty()  && CodaGen.isEmpty()) {
                //aggiunge tutti i pacchetti dalla coda in questione alla coda generale
                CodaGen.addAll(CodaTES);
                //pulisce la coda
                CodaTES.clear();

                //costrutto che ripete per tutto i lsize della coda generale
                for (int i = 0; i < CodaGen.size(); i++) {
                    //se la coda è piena mi crea il grafo
                    if (!CodaGen.isEmpty()) {
                        nodeA.addAdjacentNode(nodeB, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);
                        nodeA.addAdjacentNode(nodeC, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);

                        nodeB.addAdjacentNode(nodeC, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);
                        nodeB.addAdjacentNode(nodeD, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);
                        nodeB.addAdjacentNode(nodeE, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);

                        nodeC.addAdjacentNode(nodeD, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);

                        nodeD.addAdjacentNode(nodeE, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);
                        nodeD.addAdjacentNode(nodeF, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);

                        nodeE.addAdjacentNode(nodeF, (int) ((Math.random() * (10 - 1 + 1)) + 1)+i);

                        //istanzio oggetto strategy nella classe Context_strategy
                        Context_Strategy strategy = new Context_Strategy();
                        //setto la strategia
                        strategy.setStrategy(new Dijkstra());
                        //la eseguo
                        strategy.executeStrategy(nodeA, Arrays.asList(nodeA, nodeB, nodeC, nodeD, nodeE, nodeF));
                        //passo nella lsita output tutto il percorso minimo
                        output.add(PacchettiStore_Prototype.get_pacchetto("Testo").printPaths(Arrays.asList(nodeA, nodeB, nodeC, nodeD, nodeE, nodeF)));
                        // passo nella lista il messaggio generato dalla send
                        output.add(nodeA.send("pacchetto-testo","Testo"));
                        //passo nella lista il messaggio ricevuto dalla receive
                        output.add(nodeC.receive("Pacchetto_testo"));
                    }
                }
                //pulisco la coda
                CodaGen.clear();

            }

        //prendo tutti gli output così da stamparli
        request.setAttribute("lista",output);
        //collego la richiesto al file response.jsp
        request.getRequestDispatcher("response.jsp").forward(request, response);
    }

}

