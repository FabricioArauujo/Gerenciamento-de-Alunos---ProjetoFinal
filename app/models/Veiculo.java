package models;

public class Veiculo {
    private Long id;
    private String modelo;

    public Veiculo(Long id, String modelo) {
        this.id = id;
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Veículo [id=" + id + ", modelo=" + modelo + "]";
    }
}
