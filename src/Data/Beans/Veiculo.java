package Data.Beans;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int capacidade;
    private boolean isDisponivel;

    public Veiculo(String marca, String modelo, int ano, String placa, int capacidade, boolean isDisponivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.capacidade = capacidade;
        this.isDisponivel = isDisponivel;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getPlaca() {
        return placa;
    }

    public int getCapacidade(){
        return capacidade;
    }

    public boolean isDisponivel() {
        return isDisponivel;
    }


}
