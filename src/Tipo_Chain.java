public class Tipo_Chain {
    private String tipo;

    /*costruttore*/
    public Tipo_Chain(String tipo)
    {
        this.tipo= tipo;
    }
    /* metodo che consentirà di reperire il numero assegnato poi ad ogni processo per capire il suo stato*/
    public String getTipo()
    {
        return tipo;
    }
}
