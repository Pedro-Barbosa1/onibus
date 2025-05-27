package Data.Beans;

public class Passagem {
    private String numeroPassagem;
    private String nomePassageiro;
    private String cpfPassageiro;
    private String origem;
    private String destino;
    private LocalDate dataViagem;
    private LocalTime horarioSaida;
    private String poltrona;
    private double preco;

    public Passagem(String numeroPassagem, String nomePassageiro, String cpfPassageiro, String origem, String destino, LocalDate dataViagem, LocalTime horarioSaida, String poltrona, double preco) {
        this.numeroPassagem = numeroPassagem;
        this.nomePassageiro = nomePassageiro;
        this.cpfPassageiro = cpfPassageiro;
        this.origem = origem;
        this.destino = destino;
        this.dataViagem = dataViagem;
        this.horarioSaida = horarioSaida;
        this.poltrona = poltrona;
        this.preco = preco;
    }

    public String getNumeroPassagem() {
        return numeroPassagem;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public String getCpfPassageiro() {
        return cpfPassageiro;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getDataViagem() {
        return dataViagem;
    }

    public LocalTime getHorarioSaida() {
        return horarioSaida;
    }

    public String getPoltrona() {
        return poltrona;
    }

    public double getPreco() {
        return preco;
    }

    @Override

    public String toString() {
        return "Passagem{" +
                "numeroPassagem='" + numeroPassagem + '\'' +
                ", nomePassageiro='" + nomePassageiro + '\'' +
                ", cpfPassageiro='" + cpfPassageiro + '\'' +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", dataViagem=" + dataViagem +
                ", horarioSaida=" + horarioSaida +
                ", poltrona='" + poltrona + '\'' +
                ", preco=" + preco +
                '}';
    }

}
