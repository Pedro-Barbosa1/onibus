package Data.Beans;

public class Rota {
    private String partida;
    private String destino;
    private double distancia;

    public Rota (String partida, String destino, double distancia){
        this.partida = partida;
        this.destino = destino;
        this.distancia = distancia;

    }

    public String getPartida(){
        return partida;
    }

    public String getDestino(){
        return destino;
    }

    public double getDistancia(){
        return distancia;
    }
}
