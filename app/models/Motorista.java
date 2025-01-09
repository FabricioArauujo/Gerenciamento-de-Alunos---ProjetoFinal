package models;

public class Motorista {
    private Long id;
    private String nome;

    public Motorista(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Motorista [id=" + id + ", nome=" + nome + "]";
    }
}
