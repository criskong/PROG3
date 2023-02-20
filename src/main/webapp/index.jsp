<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <link href="CSS/CSSFile.css" rel="stylesheet" type="text/css">
  <title>Gestione Router</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>

</head>
<body>

<div class="container-fluid">
  <div class="row">
    <div class="col bg-success p-3 text-white">
      <h1 class="logo">GestioneRouter</h1>
    </div>
  </div>
</div>
<h2 class="titolo"> Progetto di Programmazione 3 e Laboratorio</h2>
<h6 class="text-center">A. A. 2022/2023</h6>
<p>la seguente web application simula l'instradamento di una serie di pacchetti all'interno di una tabella di routing. Nella schermata seguente è possibile scegliere quali e quanti pacchetti instradare, una volta scelte codeste opzioni è possibile visualizzare il percorso fatto da ogni singolo pacchetto basato sull'algoritmo di com.example.demotomcat.app.Dijkstra che vuole un grafo orientato e pesato con pesi non negativi. Il grafo verrà aggiornato ad ogni pacchetto entrato, in modo tale da effettuare in modo uniforme e sicuro il percorso più breve andando a modificare i pesi degli archi con una rand(). Con l'immagine sottostante è possibile capire quali collegamenti sono stati fatti e in generale per capire se effettivamente i risultati generati siano coerenti con il grafo generato.</p>
<img src="Img/Cattura.PNG">




<form action="HelloServlet" method="post">
  <input type="tipo" id="input-field" placeholder="Nome" name = "nome">
  <input type="Quantità" class="control" placeholder="Quantità" name = "quantita">
  <input type="submit" value="Submit">
</form>




</body>


</html>


